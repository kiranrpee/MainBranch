package differntwaysofpost;

import java.util.HashMap;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class post_with_Hashmap 
{

@Test
public void postwithhashmap()
{
	baseURI="http://rmgtestingserver";
	port=8084;
	
	HashMap<String,Object> map=new HashMap<String,Object>();
	map.put("createdBy", "kiran406");
	map.put("projectName","aaaa");
	map.put("status", "ongoing");
	map.put("teamSize",5);
	
	given().body(map).contentType(ContentType.JSON).when().post("/addProject")
	.then().assertThat().contentType(ContentType.JSON).statusCode(201).log().all();
	
}
	
}
