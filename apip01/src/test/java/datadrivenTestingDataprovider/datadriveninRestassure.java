package datadrivenTestingDataprovider;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import apip01.pojoclass;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class datadriveninRestassure
{

@Test(dataProvider ="insertdata")
public void createproject(Object createdBy,Object projectName,Object status,Object teamSize)
{
	
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	pojoclass pojo=new pojoclass(createdBy,projectName,status,teamSize);
	
	given().body(pojo).contentType(ContentType.JSON)
	.when().post("/addProject")
	.then().assertThat().statusCode(201).contentType(ContentType.JSON).log().all();
	
	
	
	
}



@DataProvider
public Object[][] insertdata() throws IOException
{
	
	
	DataFormatter df=new DataFormatter();
	FileInputStream fis=new FileInputStream(".//Restassured.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	 Sheet sh = wb.getSheet("Sheet1");
	// int rcount = sh.getLastRowNum();
	 //int cellcount=sh.getRow(0).getLastCellNum();
	 Object[][] data = new Object[10][10];
	 for(int i=1;i<=sh.getLastRowNum();i++)
	 {
		 
		 for(int j=0;j<=sh.getRow(i).getLastCellNum();j++)
		 {
			 data[i][j]=df.formatCellValue(sh.getRow(i).getCell(j));
		 }
	 }
	
	fis.close();
	
	
	/*
	Random rnd =new Random();
	
	 
	 Object[][] data = new Object[2][4];
	 data[0][0]="deepak7890";
	 data[0][1]="p199"+rnd.nextInt(100);
	 data[0][2]="ongoing";
	 data[0][3]=5;
	 
	 //2nddata
	 data[1][0]="deepak7890999";
	 data[1][1]="p299"+rnd.nextInt(100);
	 data[1][2]="completed";
	 data[1][3]=5;
	 */
	 return data;
	
}
	
	
}
