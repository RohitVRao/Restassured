package crud_operations_with_bdd;

import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Upload_photo 
{
	@Test
	public void FileUpload()
	{
		
		File f=new File("C:\\Users\\Rohit V Rao\\eclipse-workspace\\RestAssured\\847323.jpg");
		given().multiPart("file",f,"multipart/form-data")
		.post("https://the-internet.herkuapp.com/upload")
		.thenReturn().then().log().all();
	}
}
