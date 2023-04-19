package dynamicnadStaticResponse;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.*;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;


import io.restassured.response.Response;

public class DynamicResponse
{
	

	@Test
	public void dynamicNOlocation()
	{
	
		boolean flag = true;
	baseURI="http://rmgtestingserver";
	String expecteddata="TY_PROJ_2935";
	port=8084;
	
	 Response res = when().get("/projects");
	   List<String> pids = res.jsonPath().get("projectId");
	  
	  
	 for (String ids:pids)
	 {
		 if(ids.equalsIgnoreCase(expecteddata))
		 {
			 flag=true;
		 }
		
	}
	 
	 Assert.assertTrue(flag);
	 System.out.println("data verified");
	 res.then().log().all();
	 
	
	
	}
	
	
}
