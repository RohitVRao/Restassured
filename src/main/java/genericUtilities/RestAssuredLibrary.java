package genericUtilities;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class RestAssuredLibrary 
{
	@Test
	
    public String getJsonData(Response response, String path)
    {
    String jsonData = response.jsonPath().get(path);
	return jsonData;
    }
}
