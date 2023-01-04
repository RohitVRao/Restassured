package different_ways_to_post;

import java.util.HashMap;

import org.testng.annotations.Test;

import genericUtilities.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class using_hashmap
{
	@Test
	public void addProject() {
		
		
		HashMap map = new HashMap<Object, Object>();
		map.put("createdBy", "Prathap");
		map.put("projectName", "Tyss"+new JavaUtility().getRandomNumber());
		map.put("status", "ongoing");
		map.put("teamSize", 4);
		baseURI="http://localhost";
		port=8084;
		
		given()
		          .body(map)
		          .contentType(ContentType.JSON)
	   .when()
		          .post("/addProject")
	   .then()
	              .log().all()
		          .assertThat()
		          .contentType(ContentType.JSON)
		          .header("Content-Type", "application/json");
	}
}
