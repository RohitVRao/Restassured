package authentications;

import static io.restassured.RestAssured.given;

import static org.testng.annotations.Test.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BasicAuth_with_digest
{
	public class BasicAuth_with_preemptive
	{
		@Test
	  public void basic_auth_test()
	  {
			given()
			.auth().digest("rmgyantra", "rmgy@9999")
			.when()
			.get("http://localhost:8084/login")
			.then()
			.assertThat().statusCode(202).log().all();
		  
	  }
	}

}

