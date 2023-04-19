package shoppersstack_profilecard_Kiran;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class savecarddata 
{

@Test
public void createcard()
{
	baseURI="https://www.shoppersstack.com/shopping/";
	
	 File f=new File("./shoppers.json");
	 
	 given().body(f).contentType(ContentType.JSON)
	 .when().post("/cards").prettyPeek()
	 .then().assertThat().statusCode(201).log().all();
	 
	 
}
	
	
}
