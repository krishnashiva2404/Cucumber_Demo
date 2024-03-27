package StepDefinations;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import PageFactory.Homepage_PF;
import PageFactory.Loginpage_PF;
import io.cucumber.java.en.*;

public class LoginpageTest_PF {

	WebDriver driver;
	Loginpage_PF login;
	Homepage_PF home;

	@Given("User enter the trace project Url in the browser")
	public void user_enter_the_trace_project_url_in_the_browser() throws InterruptedException {
		String systempath = System.getProperty("user.dir");
		System.out.println("The system path is :" + systempath);
		System.setProperty("webdriver,gecko,driver", systempath + "/src/test/resources/drivers/geckodriver.exe");
		// driver=new ChromeDriver();
		driver = new FirefoxDriver();

	}

	@And("User landing on the trace project login page")
	public void user_landing_on_the_trace_project_login_page() {
		driver.get("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("User enter the valid credientials of (.*)and(.*)$")
	public void user_enter_the_valid_credientials_of_username_and_password(String Username, String Password) throws InterruptedException {
		login = new Loginpage_PF(driver);
		login.enterUsername(Username);
		login.enterPassword(Password);
		Thread.sleep(3000);

	}

	@And("User click on the login button")
	public void user_click_on_the_login_button() {
		login.clicklogin();
	}

	@Then("User navigate to the application home page dashboard")
	public void user_navigate_to_the_application_home_page_dashboard() {
		home=new Homepage_PF(driver);
		home.checklogoutisDisplayed();
		driver.quit();
	}

}
