package crud_operations_without_bdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class delete_project {
	
	@Test
	public void deletemethod()
	{
		// Action
				Response response = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_006");
				System.out.println(response.getStatusCode());
				response.then().log().all();
			    response.then().assertThat().statusCode(204);
	}

}
