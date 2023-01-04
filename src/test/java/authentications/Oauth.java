package authentications;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Oauth 
{
@Test

public void authentication()
{
	
	
	Response res = given()
			.formParam("client_id", "Sephora")
			.formParam("client_secret", "11abf9b84a94e5ce383b6fd7fe67f20d")
			.formParam("grant_type", "client_credentials")
			.formParam("redirect_uri", "https://arun.com")
			.formParam("code", "authorization_code")
			
			.when()
			.post("http://coop.apps.symfonycasts.com/token");
			System.out.println(res);
	     
			String token = res.jsonPath().get("access_token");
			
			given()
			.auth().oauth2(token)
			.pathParam("User_Id",4170)
			
			.when()
			.post("http://coop.apps.symfonycasts.com/api/{User_Id}/eggs-collect")
			.then().log().all();
			
			
			
			
			
}
}
