package crud_operation_with_framework_component;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.seleniumhq.jetty9.io.EndPoint;
import org.testng.annotations.Test;

import genericUtilities.BaseClassWithSpecifications;
import genericUtilities.Endpointslibrary;
import genericUtilities.JavaUtility;
import io.restassured.http.ContentType;

public class Post_method extends BaseClassWithSpecifications
{
  @Test
  public void post()
  {
	  JavaUtility z = new JavaUtility();
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rohit");
		jobj.put("projectName", "Sephora"+z.getRandomNumber());
		jobj.put("status", "On Going");
		jobj.put("teamSize", 8);
		
		
		given()
		.spec(requestSpec)
		.body(jobj)
		
		.when()
		
		.post(Endpointslibrary.createProject)
		.then().log().all();
  }
	
}
