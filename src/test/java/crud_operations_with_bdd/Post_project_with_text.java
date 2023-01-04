package crud_operations_with_bdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtilities.JavaUtility;
import io.restassured.http.ContentType;

public class Post_project_with_text 
{
	@Test
	public void postmethod()

	{
		  
			JavaUtility z = new JavaUtility();
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "Rohit");
			jobj.put("projectName", "Sephora"+z.getRandomNumber());
			jobj.put("status", "On Going");
			jobj.put("teamSize", 8);
			baseURI="http://localhost";
			port=8084;
					
			
			given()
			.body(jobj.toJSONString())
			.contentType(ContentType.TEXT)
			.when()
			.post("http://localhost:8084/")
			.then().log();
		//	.assertThat().contentType(ContentType.TEXT).log().all();
			//.contentType(ContentType.TEXT);
			//.statusCode(405)
		   // .statusLine("HTTP/1.1 405 ");
}

}
