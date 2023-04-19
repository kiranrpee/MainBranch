package Requestchaining;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostandGet
{

	public String pid;
	
	
	@BeforeMethod
	 public  void create()
	{

	Random rnd1=new Random();

	//initialize inbuilt variable	
	baseURI="http://rmgtestingserver";
	port=8084;

	//create body
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","kiran");
	jobj.put("projectName","k12350"+rnd1.nextInt(100));
	jobj.put("status","completed");
	jobj.put("teamSize",5);

		
	RequestSpecification req = given()
	.body(jobj)
	.contentType(ContentType.JSON);

	
	 Response resp = req.when().post("/addProject");
	pid=resp.body().jsonPath().get("projectId");

	 System.out.println(pid);
	
	}
	
	
	@Test
	public void get()
	{
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().pathParam("pid1",pid)
		.when().get("/projects/{pid1}").prettyPeek()
		.then().assertThat().statusCode(200).log().all();
		
	
		
		
	}

}
