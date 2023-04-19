package headervalidation;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class getbodymethod 
{

@Test
public void getb()
{
	
	baseURI="http://rmgtestingserver";
	port=8084;
	
	Response responsebody = when().get("/projects");
	//System.out.println(responsebody.getBody().toString());
	
	//when().get("/projects").prettyPrint();
	
	when().get("/projects").prettyPeek();
	//System.out.println(when().get("/projects").asString());

//	responsebody.jsonPath().get

}
	
}
