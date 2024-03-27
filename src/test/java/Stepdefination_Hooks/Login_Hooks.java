package Stepdefination_Hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Hooks {
	
	WebDriver driver;
	@Before(order=1)
	public void setup() {
		
		String systempath = System.getProperty("user.dir");
		System.out.println("The system path is :" + systempath);
		System.setProperty("webdriver,gecko,driver", systempath + "/src/test/resources/drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("The browser is open before test");
	}
	
	// multiple before
	
	@Before(order=0)
	public void setup2() {
		System.out.println("we use multiple Before so I can execte firest because it given by order");
		
	}
	
	
	@After
	public void teardown() {
		System.out.println("This teardown method excute after the test");
		driver.quit();
	}
	
	@BeforeStep
	public void setup1() {
		System.out.println("execute before each step");
	}
	
	@AfterStep
	public void tear1() {
		System.out.println("execute after each step");
	}
	
	
	
	
	
	@Given("User open the browser and enter the application URL")
	public void user_open_the_browser_and_enter_the_application_url() {
		System.out.println("The application browser open");
		driver.get("https://example.testproject.io/web/");
	}

	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {
		System.out.println("User on login page");
	}

	@When("User enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
	}

	@When("User click on login button")
	public void user_click_on_login_button() {
	}

	@Then("User navigate to homepage dashboard")
	public void user_navigate_to_homepage_dashboard() {
	}

}
