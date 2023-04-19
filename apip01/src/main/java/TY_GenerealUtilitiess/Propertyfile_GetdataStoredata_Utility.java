package TY_GenerealUtilitiess;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is used to store and fetch Data from property file
 * This class has constructor that takes property file path as argument
 * @author Kiran
 *
 */
public class Propertyfile_GetdataStoredata_Utility 
{
	private Properties prop;
	
	public Propertyfile_GetdataStoredata_Utility(String path)
	{
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(path);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
	    prop=new Properties();
	
	    try 
	    {
			prop.load(fis);
		} 
	    catch (IOException e)
	    {
			
			e.printStackTrace();
		}
	
	
	}


	
		
		
		public String getdataPropertyFile(Enumkey keyname) 
	{
		
		 String propertyvalue = prop.getProperty(keyname.name().toLowerCase().trim());
		 
		return propertyvalue;
		
	}
		
		public String getdataPropertyFile(String key) 
		{
			
			 String propertyvalue = prop.getProperty(key).trim();
			 
			return propertyvalue;
			
		}
		
		
		@SuppressWarnings("deprecation")
		public void storedataPropertfFile(String key,String value ) 
		{
			
			FileOutputStream fos = null;
			try {
				fos = new FileOutputStream("./src/test/resources/property/commondata.properties",true);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Properties prop=new Properties();
			prop.setProperty(key,value);
			prop.save(fos,"written through java pgm");
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			
		}
		
		
		


