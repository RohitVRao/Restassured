import java.io.File;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class MultiPart
{
	public class UploadPhoto {

		@Test
		public void upload() {
			File f = new File("./src/test/resources/wallpaperflare.com_wallpaper.jpg");

			given()
			         .multiPart("file", f, "multipart/form-data")
			          .post("https://the-internet.herokuapp.com/upload")
					   .thenReturn()
					   .then()
					    .log().all();
		}
	}
}
