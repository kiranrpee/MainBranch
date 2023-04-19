package Requestchaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutandDelete
{


	 String proid;
	
	
	@BeforeMethod
	 public  void create()
	{

	Random rnd1=new Random();

	//initialize inbuilt variable	
	baseURI="http://rmgtestingserver";
	port=8084;

	//create body
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","kiran1");
	jobj.put("projectName","k12350"+rnd1.nextInt(100));
	jobj.put("status","ongoing");
	jobj.put("teamSize",6);

		
	RequestSpecification req = given()
	.body(jobj)
	.contentType(ContentType.JSON);

	
	 Response resp = req.when().put("/Projects/{{pid}}");
	 System.out.println(resp.body());
	proid=resp.body().jsonPath().get("projectId");

	
	
	 System.out.println(proid);
	
	}
	
	
	@Test
	public void delete()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().pathParam("pid1",proid)

		.when().delete("/projects/{pid1}").then().assertThat().statusCode(204).contentType(ContentType.JSON).log().all();
	}
	
	
}
