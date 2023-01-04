package crud_operations_without_bdd;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtilities.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Put_project
{
  @Test
  public void putmethod()
  {
	// create object using json simple
		JavaUtility z = new JavaUtility();
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "Rohit");
		jobj.put("projectName", "Sephora"+z.getRandomNumber());
		jobj.put("status", "On Going");
		jobj.put("teamSize", 6);
		
		//pre request for scripts
		RequestSpecification reqspec = RestAssured.given();
		reqspec.body(jobj);
		reqspec.contentType(ContentType.JSON);
		
		//Action
		Response response = reqspec.put("http://localhost:8084/projects/TY_PROJ_003");
	  
		
		//validation
		System.out.println(response.getContentType());
		System.out.println(response.getTime());
		System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
		System.out.println(response.getSessionId());
		System.out.println(response.getCookies());
		System.out.println(response.getBody());
		System.out.println(response.getHeaders());
		System.out.println(response.getStatusLine());
		
		response.then().log().all();
		response.then().assertThat().contentType(ContentType.JSON);
		response.then().assertThat().statusCode(200);
		response.then().assertThat().statusLine("HTTP/1.1 200 ");
  }
}
