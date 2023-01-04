package different_ways_to_post;

import org.junit.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.io.File;

public class json_file 
{
	@Test
	public void addProject() {
		
		File f = new File("./src/test/resources/jsonfile.json");
		baseURI="http://localhost";
		port=8084;
		
		given()
		          .body(f)
		          .contentType(ContentType.JSON)
	   .when()
		          .post("/addProject")
	   .then()
	              .log().all()
		          .and()
				  .statusLine("HTTP/1.1 201 ")
				  .header("Transfer-Encoding", "chunked");
	}
}
