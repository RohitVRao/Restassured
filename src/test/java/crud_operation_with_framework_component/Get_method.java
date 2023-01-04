package crud_operation_with_framework_component;

import org.testng.annotations.Test;

import genericUtilities.Endpointslibrary;
import static io.restassured.RestAssured.*;
public class Get_method 
{
	@Test
	public void addProject() {
				
		given()
						.spec(requestSpecification)	
		.when()
						.get(Endpointslibrary.getAllProject)
		.then()
						.log().all()
						.assertThat()
						.statusCode(200);
		
	}

	
}
