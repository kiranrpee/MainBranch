package apip01;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSender;

public class deleteproject
{

@Test
public void delete()
{
	Response rest = RestAssured.get("http://rmgtestingserver:8084/projects/TY_PROJ_2726");
	Response del = RestAssured.delete("http://rmgtestingserver:8084/projects/TY_PROJ_2726");
	
}
}
