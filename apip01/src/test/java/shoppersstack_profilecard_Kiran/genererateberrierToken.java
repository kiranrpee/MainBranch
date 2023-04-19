package shoppersstack_profilecard_Kiran;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class genererateberrierToken
{

@Test
public void post()
{
	
	baseURI="https://www.shoppersstack.com/shopping";
	
	JSONObject ob=new JSONObject();
	ob.put("email","kiranhosamani007@gmail.com");
	ob.put("password","1Nh12cs406@");
	ob.put("role","SHOPPER");
	
	given().body(ob).contentType(ContentType.JSON)
	.when().post("/users/login")
	.then().assertThat().statusCode(200).log().all();
}
	
}
