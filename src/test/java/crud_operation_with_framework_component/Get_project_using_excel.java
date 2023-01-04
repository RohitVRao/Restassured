package crud_operation_with_framework_component;

import org.testng.annotations.Test;

import genericUtilities.BaseClassWithSpecifications;
import genericUtilities.Endpointslibrary;

import static io.restassured.RestAssured.*;

public class Get_project_using_excel extends BaseClassWithSpecifications
{
	@Test
	public void getSingleProject() throws Throwable {
		
		
		String id = eLib.getDataFromExcel("Sheet1",0,0);
				given()
							.spec(requestSpec)
							.pathParam("projectid",id)
		.when()
						.get(Endpointslibrary.getSingleProject+"{projectid}")
		    .then()
		    				.log().all();
	}
}
