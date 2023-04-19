package differntwaysofpost;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.port;

import java.io.File;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class jsonfile
{

@Test
public void post()
{
	
	baseURI="http://rmgtestingserver";
	port=8084;
	File f=new File("./jsonfile.json");
	
	given().body(f).contentType(ContentType.JSON).when().post("/addProject")
	.then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
}

	
}
