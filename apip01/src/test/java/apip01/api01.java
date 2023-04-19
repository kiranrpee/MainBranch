package apip01;

import java.util.Random;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class api01
{

@Test
private void pub() 
{

	Random rnd1=new Random();
	
	// TODO Auto-generated method stub
JSONObject obj =new JSONObject();
obj.put("projectName","k123500"+rnd1.nextInt(100));
obj.put("createdBy","kiran");
obj.put("status","created");
obj.put("teams",5);

RequestSpecification request = RestAssured.given();
request.body(obj);
request.contentType(ContentType.JSON);
Response respo = request.post("http://rmgtestingserver:8084/addProject");
respo.then().assertThat().contentType(ContentType.JSON).statusCode(201);
System.out.println(respo.asString());




}
	
}
