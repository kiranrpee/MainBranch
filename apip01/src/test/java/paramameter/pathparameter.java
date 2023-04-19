package paramameter;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class pathparameter 
{

	@Test
	public void pathparam()
	{
		
		baseURI="http://rmgtestingserver";
		port=8084;
		
		given().pathParam("proj","TY_PROJ_2958")
		.when().get("/projects/{proj}")
		.then().assertThat().statusCode(200).log().all();
		
		
		
	}
	
}
