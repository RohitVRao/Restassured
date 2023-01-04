package crud_operations_with_bdd;

import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class get_single_project 
{
	@Test
	public void getsinglemethod()
	{
		when()
		.get("http://localhost:8084/projects/TY_PROJ_1402")
		.then()
		.assertThat()
		.contentType(ContentType.JSON)
		.statusCode(200)
		.log().all();
		
		
	}
}
