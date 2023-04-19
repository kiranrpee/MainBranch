package headervalidation;

import static io.restassured.RestAssured.baseURI;

import java.util.List;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;


public class Headervalidation 
{

@Test
public void HeaderBodyvalidation()
{
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	String expectedcontenttype="application/json";
	String  expectedVary="Access-Control-Request-Headers";
	String expectepragma="no-cache";
	
	Response responsebody = when().get("/projects");
	//responsebody.prettyPrint();
	//responsebody.prettyPeek();
 //System.out.println(responsebody.contentType());
	Assert.assertEquals(expectedcontenttype,responsebody.contentType());
	Assert.assertEquals(responsebody.header("Vary"),expectedVary);
	Assert.assertEquals(responsebody.header("Pragma"),expectepragma);
	

	
	//body validation
	
	try
	{
	List<String> pid = responsebody.jsonPath().get("projectId");
	for(String p:pid)
	{
		//System.out.println(p);
		if(p.equalsIgnoreCase("TY_PROJ_2963"))
		{
			System.out.println("data present");
			break;
		}
	}
	}
	
	catch(Exception e)
	{
		System.out.println("enetered matching string wrong");
		
	}
			
}
	
}
