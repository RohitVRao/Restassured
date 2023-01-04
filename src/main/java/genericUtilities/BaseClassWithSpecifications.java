package genericUtilities;

import java.sql.SQLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClassWithSpecifications 
{
	
	 public DatabaseUtility dLib = new DatabaseUtility();
	 public JavaUtility jLib = new JavaUtility();
	 public RestAssuredLibrary rLib = new RestAssuredLibrary();
	 public ExcelUtility eLib = new ExcelUtility();
	 
	 public RequestSpecification requestSpec;
	 public ResponseSpecification responseSpec;
	
@BeforeMethod
  public void BSconfig() throws Throwable 
  { 
	  dLib.connecttoDB();
	  RequestSpecBuilder builder = new RequestSpecBuilder();
	  builder.setBaseUri("http://localhost");
	  builder.setPort(8084);
	  builder.setContentType(ContentType.JSON);
	  requestSpec=builder.build();
  }
	
	@AfterMethod
	public void ASconfig() throws SQLException
	{
		dLib.closeDB();
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		responseSpec = builder.expectContentType(ContentType.JSON).build();
		
		
		
		
	}
	
  
  
}
