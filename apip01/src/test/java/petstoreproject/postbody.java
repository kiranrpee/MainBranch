package petstoreproject;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class postbody 
{

	@Test
	public void creatproject()
	{
		
		JSONObject j=new JSONObject();
		j.put("id",0);
		j.put("category"
		
		JSONObject j2=new JSONObject()
		j2.put("id",0)
		j2.put("name","kiran"));
				
		
		given().body(j).contentType(ContentType.JSON)
				
				
		
	}
	
	
}
