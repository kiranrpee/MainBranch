package apip01;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class getproject
{

@Test
public void getResponse()
{
	
	 Response body = RestAssured.get("http://rmgtestingserver:8084/projects");
	 body.getBody();
	body.prettyPrint();
	body.then().assertThat().statusCode(200);
	
}
	
}
