package dynamicnadStaticResponse;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

@Test
public class staticResponse 
{

	public void getfromstatic()
	{
		baseURI="http://rmgtestingserver";
		
		String expecteddata="TY_PROJ_2935";
		port=8084;
		
		Response resp = when().get("/projects");
		Object data = resp.jsonPath().get("[1].projectId");
		Assert.assertEquals(data,expecteddata);
		System.out.println("data vaerified");
		resp.then().log().all();
		
	}
	
	
}
