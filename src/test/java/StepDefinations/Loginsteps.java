package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {

	@Given("User is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is landing on the Login page");
	}

	@When("User enter the Username and Password")
	public void user_enter_the_username_and_password() {
		System.out.println("User enter the valid username and password");
	}

	@And("User clik the login button")
	public void user_clik_the_login_button() {
		System.out.println("user click on the login button ");
	}

	@Then("User is navigate to the Home page")
	public void user_is_navigate_to_the_home_page() {
		System.out.println("User should be on the home page dashboard");
	}

}
