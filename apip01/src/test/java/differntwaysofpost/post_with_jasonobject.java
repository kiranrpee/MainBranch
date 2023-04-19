package differntwaysofpost;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.Random;

import org.json.simple.JSONObject;
import org.junit.Test;

import io.restassured.http.ContentType;

public class post_with_jasonobject
{

	@org.testng.annotations.Test
	public void post()
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
