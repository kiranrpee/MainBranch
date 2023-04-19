package petstoreproject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.io.File;

public class uploadphoto 
{

	@Test
	public void uploapic()
	{
	
		
		File f=new File("C:\\Users\\Kiran\\Desktop\\pet.jpg");
		given().multiPart(f);
		
		 Response res = when().post("https://petstore.swagger.io/v2/pet/12/f");
		 
		 res.header()
		//.then().assertThat().statusCode(200).contentType(ContentType.JSON);
		
	}
	
	
	
}
