package authentications;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class bearer_token {
	@Test
	public void bearer_auth() {
		given().auth().oauth2("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")

				.when().get(" https://api.github.com/user/repos").then().assertThat().statusCode(200).log().all();

	}
}
