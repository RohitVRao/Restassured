package crud_operation_with_framework_component;

import org.testng.annotations.Test;

import genericUtilities.BaseClassWithSpecifications;
import genericUtilities.Endpointslibrary;
import static io.restassured.RestAssured.*;

import java.sql.SQLException;

import io.restassured.response.Response;
import junit.framework.Assert;
import pojo_for_project.pojocls2;

public class Create_project_and_validate extends BaseClassWithSpecifications
{
	 
	 
	 @Test
	  public void addProject() throws SQLException
	  {
		 
		 
		 pojocls2 pLib = new pojocls2("Rohit", "Sephora"+jLib.getRandomNumber(), "Created","8");
		 
		  Response resp = given()
				  .spec(requestSpec)
		    .body(pLib)
		    
		    .when()
		      		.post(Endpointslibrary.createProject);
		   
				  
		  String expdata = rLib.getJsonData(resp, "projectId");
		  System.out.println(expdata);
		  
		  String query = "select * from project;";
		  String actdata = dLib.executeQueryAndGetData(query, 1, expdata);
		  
		  Assert.assertEquals(actdata,expdata);
		  
		  
				  
				 
	  }
}
