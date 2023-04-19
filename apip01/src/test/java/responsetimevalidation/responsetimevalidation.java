package responsetimevalidation;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;

import java.util.concurrent.TimeUnit;


import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class responsetimevalidation
{

	@Test
	public void responsetime()
	{
		baseURI="http://rmgtestingserver";
		port=8084;

		when().get("/projects").then().assertThat().time(Matchers.lessThan(1037L),TimeUnit.MILLISECONDS).log().all();
		
	}
	
}
