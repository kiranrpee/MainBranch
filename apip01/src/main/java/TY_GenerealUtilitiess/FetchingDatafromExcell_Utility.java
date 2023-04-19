package TY_GenerealUtilitiess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDatafromExcell_Utility 
{

	
	DataFormatter df=null;
	Workbook wb = null;
	FileInputStream fis=null;
	public FetchingDatafromExcell_Utility(String path) 
	{
	
		df=new DataFormatter();
		//FileInputStream fis=null;
		try {
			fis = new FileInputStream(path);
		} 
		catch (FileNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		
		try 
		{
			 wb = WorkbookFactory.create(fis);
		} 
		catch (EncryptedDocumentException | IOException e) 
		{
		e.printStackTrace();
		}
		
	}
	
	
	
	public  String[] fetchSingledata(String sheet,String key1,String key2)
	{
		
Sheet sh=wb.getSheet(sheet);
		
		int rowcount = sh.getLastRowNum();//it will give lastrownumber if +1 then it gives total rows 
		String[] keyvalues=new String[10];
		for(int i=1;i<=rowcount;i++)
		{
			short celcount = sh.getRow(i).getLastCellNum();//cell count in first row
			for(int j=0;j<celcount;j++)
			{

				if(df.formatCellValue(sh.getRow(i).getCell(j)).equals(key1))
				{
					keyvalues[0]=df.formatCellValue(sh.getRow(i+1).getCell(j));

				}
				else if (df.formatCellValue(sh.getRow(i).getCell(j)).equals(key2))
				{
					keyvalues[1]=df.formatCellValue(sh.getRow(i+1).getCell(j));
				}

			}
		}
		
		
		return keyvalues;
		
		
		
		
	}
	
	
	public Map<String, String> fetchingexcelandStroringinMAP(String sheet) 
	{
	Map<String,String> map=new HashedMap<>();
		
		Sheet sh = wb.getSheet(sheet);
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			for(int j=0;j<sh.getRow(i).getLastCellNum();j++)
			{
				if(df.formatCellValue(sh.getRow(i).getCell(j))!=null)
				{
					for(int k=0;k<sh.getLastRowNum();k++)
					{
					map.put(df.formatCellValue(sh.getRow(k).getCell(j)),df.formatCellValue(sh.getRow(k).getCell(i+1)));
					}
					
				}
			}
		}
		
		return map;
		
		
	}
	
	
	
	
	public Map<String, String> fetchdatexcellinkeyandDownValue(String Sheet)
	{
		
		Map<String,String> map=new HashMap<>();
		  Sheet sh= wb.getSheet(Sheet);
		  int rowcount=sh.getLastRowNum();
		  for(int i=1;i<=rowcount;i++)
		  {
			  int cellcount=sh.getRow(i).getLastCellNum();
			  for(int j=0;j<cellcount;j++)
			  {
		String key=df.formatCellValue(sh.getRow(i).getCell(j));
		if(df.formatCellValue(sh.getRow(i+1).getCell(j))!=null)
		{
			String value=df.formatCellValue(sh.getRow(i+1).getCell(j));
		
				map.put(key,value);
		}	

				
			  }
			  
			
			  
		  }
		  System.out.println(map);
	
		  return map;
	}
	
	
	public void closefis()
	{
		try {
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
