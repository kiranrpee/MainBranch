package shoppersstack_profilecard_Kiran;

import static io.restassured.RestAssured.baseURI;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class getanddeletecard 
{

@Test
public void getanddelete()
{
	
	baseURI="https://www.shoppersstack.com/shopping";

	given().auth().oauth2("eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJraXJhbmhvc2FtYW5pMDA3QGdtYWlsLmNvbSBTSE9QUEVSIiwiZXhwIjoxNjgxOTM0OTEzLCJpYXQiOjE2ODE4OTg5MTN9.LK92HNPtudRdHpPblnA0HziV59tQCN7RghihXYiqq_Q")
	.when().delete("/cards/20279").prettyPeek();
}
	
}
