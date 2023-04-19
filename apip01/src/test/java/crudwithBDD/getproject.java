package crudwithBDD;

import static io.restassured.RestAssured.*;

import org.apache.poi.xwpf.usermodel.BodyElementType;
import org.junit.Test;

import io.restassured.response.Response;

public class getproject 
{

@org.testng.annotations.Test
public void get()
{
	baseURI="http://rmgtestingserver";
	port=8084;
	when().get("/projects").getBody().prettyPrint();
	
	
}
	
}
