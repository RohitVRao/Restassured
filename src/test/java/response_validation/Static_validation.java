package response_validation;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Static_validation 
{
	
@Test
public void getallprojects()
{
	String expectedPname = "Sephora7707";
	Response response =
	when().get("http://localhost:8084/projects");
		//	.then().log().all();
	String actualPname = response.jsonPath().get("[3].projectName");

Assert.assertEquals(actualPname, expectedPname);
	
}

}
