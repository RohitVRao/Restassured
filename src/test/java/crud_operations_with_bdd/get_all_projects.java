package crud_operations_with_bdd;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class get_all_projects {
	
	@Test
	public void getallmethod()
	{
		when()
		.get("http://localhost:8084/projects")
		.then()
		.assertThat()
		.contentType(ContentType.JSON)
		.statusCode(200)
		.log().all();
		
		
	}

}
