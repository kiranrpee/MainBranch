package crudwithBDD;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

public class updateproject
{

	@Test
	public void update()
	{
		baseURI="http://rmgtestingserver";
		port=8084;

		//create body
		JSONObject jobj=new JSONObject();
		
		jobj.put("createdBy","ki");
		jobj.put("projectName","k1235032");
		jobj.put("status","created");
		jobj.put("teamSize",6);
		
		
		given().body(jobj).contentType(ContentType.JSON).when().put("/projects/TY_PROJ_78")
		.then().assertThat().statusCode(200).log().all();

	}
}
