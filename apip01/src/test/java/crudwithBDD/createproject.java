package crudwithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;//if we make it static we can access methods directly

import java.util.Random;

public class createproject 
{

@Test
public void create()
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

//step1: create preeequiste	
given()
.body(jobj)
.contentType(ContentType.JSON)

//step2:perform action
.when()
.post("/addProject")

//step 3:validation
.then().assertThat().contentType(ContentType.JSON).log().all();










}


	
}
	
