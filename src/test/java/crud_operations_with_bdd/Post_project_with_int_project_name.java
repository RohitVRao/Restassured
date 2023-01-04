package crud_operations_with_bdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtilities.JavaUtility;
import io.restassured.http.ContentType;

public class Post_project_with_int_project_name
{
	@Test
	public void postmethod()

	{
		  
			JavaUtility z = new JavaUtility();
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "Rohit");
			jobj.put("projectName", "188"+z.getRandomNumber());
			jobj.put("status", "On Going");
			jobj.put("teamSize", 8);
			baseURI="http://localhost";
			port=8084;
					
			
			given()
			.body(jobj.toJSONString())
			.contentType(ContentType.JSON)
			.when()
			.post("http://localhost:8084/addProject")
			.then()
			.assertThat().contentType(ContentType.JSON).log().all()
			.assertThat().contentType(ContentType.JSON);
			
		      
	}
}
