package crudwithBDD;

import org.junit.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;

public class deleteproject 
{

	@Test
	public void delete()
	{
		
		baseURI="http://rmgtestingserver";
		port=8084;
		when().delete("/projects/k1235032")
		.then().assertThat().statusCode(204).contentType(ContentType.JSON).log().all();
	}
	
}
