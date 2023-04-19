package Requestchaining;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class GetandDelete 
{


	static String pid;

	@BeforeMethod
	public void delete()
	{
		baseURI="http://rmgtestingserver";

		port=8084;
		Response  response=when().get("/projects");
		response.prettyPrint();
		pid = response.jsonPath().get("[0].projectId");
		System.out.println(pid);
		System.out.println("hi");
	}
	

	@Test
	public static void dele()
	{

		baseURI="http://rmgtestingserver";

		port=8084;
		given().pathParam("projectId",pid)
		.when().delete("/projects/{projectId}")
		.then().assertThat().statusCode(204).log().all();

	}



}
