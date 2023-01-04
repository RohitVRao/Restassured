package crud_operations_with_bdd;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtilities.JavaUtility;
import io.restassured.http.ContentType;

public class Put_project_with_bdd
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
			baseURI="http://localhost";
			port=8084;
		
			given()
			.body(jobj)
			.contentType(ContentType.JSON)
			.when()
			.put("http://localhost:8084/projects/TY_PROJ_214")
			.then()
			.assertThat().contentType(ContentType.JSON).log().all()
			.assertThat().contentType(ContentType.JSON);
   }
}
