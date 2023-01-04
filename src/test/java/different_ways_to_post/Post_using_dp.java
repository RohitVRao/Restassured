package different_ways_to_post;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataprovider.pojowithdata;
import genericUtilities.ExcelUtility;
import genericUtilities.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Post_using_dp
{
  @DataProvider
    public Object[][] dp() throws Throwable
  {
	  ExcelUtility z = new ExcelUtility();
	 Object[][] obj = z.getDataFromExcel("request");
	  return obj;
  }
  
  @Test(dataProvider="dp")
  public void addproject(String createdBy,String projectName, String status, String teamSize) {
	  pojowithdata pojo = new pojowithdata(createdBy, projectName+new JavaUtility(), status, teamSize);
	  port = 8084;
	  given()
	  .body(pojo)
	  .contentType(ContentType.JSON)
	  .when()
	  .post("/addProject")
	  .then()
	  .log().all();
	  
  }
}


