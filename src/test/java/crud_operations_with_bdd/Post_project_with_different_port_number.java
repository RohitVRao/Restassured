package crud_operations_with_bdd;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtilities.JavaUtility;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

class Post_project_with_different_port_number 
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
			port=8089;
			
			
					
			
			given()
			.body(jobj.toJSONString())
			.contentType(ContentType.JSON)
			.when()
			.post("/addProject")
			
			.then()
			.assertThat().contentType(ContentType.JSON).log().all()
			.assertThat().contentType(ContentType.JSON);
		      
	}
	}

