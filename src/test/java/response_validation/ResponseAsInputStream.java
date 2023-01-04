package response_validation;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ResponseAsInputStream 
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
		
		InputStream responseAsInputStream = res.asInputStream();
		
		byte[] responseAsInputStreamInBytes = new byte[(responseAsInputStream).available()];
		
		responseAsInputStream.read(responseAsInputStreamInBytes);
		
		File targetFileforinputstream = new File("src/main/resources/targetFileforinputstream.json");
		
		com.google.common.io.Files.write(responseAsInputStreamInBytes, targetFileforinputstream);
		
}
}
