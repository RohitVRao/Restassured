package different_ways_to_post;


import org.hamcrest.Matchers;
import org.junit.Test;

import io.restassured.http.ContentType;


import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class Post_with_pojo_class 
{

	@Test
	public void addProject() {
		
		
	    baseURI="http://localhost";
	    port =8084;
	    
	    given()
	             .body("")
	             .contentType(ContentType.JSON)
	    .when()
	             .post("/addProject")
	    .then()
	             .log().all()
	             .assertThat()
	             .header("Connection", "keep-alive")
	             .time(Matchers.lessThan(2000l),TimeUnit.MILLISECONDS);
	}
}
