package crud_operations_without_bdd;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import genericUtilities.JavaUtility;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Get_project

{
	@Test
	public void getmethod() {
		// Action
		Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_003");
		response.then().log().all();
	}
}