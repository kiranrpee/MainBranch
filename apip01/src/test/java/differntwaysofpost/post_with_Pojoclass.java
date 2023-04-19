package differntwaysofpost;

import static io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

import apip01.pojoclass;
import io.restassured.http.ContentType;

public class post_with_Pojoclass 
{

	@Test
	public void post()
	{
		Random rnd=new Random();
		pojoclass pojo=new pojoclass("kir","axnks90"+rnd.nextInt(100),"completed",9);
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		
		
		given().body(pojo).contentType(ContentType.JSON).when().post("/addProject")
		.then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
	}
}
