package response_validation;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseAsByteArray 
{
	@Test
	  public void json_file() throws IOException 
	  {
		  
		String jsonstring =  "{\"username\":\"admin\",\"passowrd\":\"password817\"}";
		
		RequestSpecification request = RestAssured.given();
		
		request.contentType(ContentType.JSON);
		
		request.baseUri("http://restful-booker.herouapp.com/auth");
		request.body(jsonstring);
		
		Response res = request.post();
		
		byte[] responseAsByteArray = res.asByteArray();
		
		File targetFileforByteArray = new File("src/main/resources/targetFileforByteArray.json");
		
		com.google.common.io.Files.write(responseAsByteArray, targetFileforByteArray);
		
}
}
