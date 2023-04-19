package paramameter;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class formparam 
{

	@Test
	public void formparameter()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().formParam("createdBy", "kiran406").formParam("projectName","aaaa").formParam("status", "ongoing").formParam("teamSize",5)
		.contentType(ContentType.JSON)
		.when().post("/addprojects")
		.then().assertThat().contentType(ContentType.JSON).log().all();
		
	}
	
}
