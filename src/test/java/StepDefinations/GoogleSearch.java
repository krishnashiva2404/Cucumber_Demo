package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearch {
	
	WebDriver driver;

	@Given("user open a browser")
	public void user_open_a_browser() {
		System.out.println("Inside-open browser");
		String systempath=System.getProperty("user.dir");
		System.out.println("The system path is :"+systempath);
		System.setProperty("webdriver,gecko,driver", systempath+"/src/test/resources/drivers/geckodriver.exe");
		//driver=new ChromeDriver();
		driver=new FirefoxDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}

	@And("user is on google page")
	public void user_is_on_google_page() {
		System.out.println("Inside- user is on google page");
		driver.get("http://www.google.com");
	}

	@When("user enter text in search feild")
	public void user_enter_text_in_search_feild() {
		System.out.println("Inside- user enter the text");
		driver.findElement(By.name("q")).sendKeys("shivakrishna");
	}

	@And("user hit the enter button")
	public void user_hit_the_enter_button() throws InterruptedException {
		System.out.println("Inside- user hit the enter button");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("user navigat to the result page")
	public void user_navigat_to_the_result_page() {
		System.out.println("Inside- user navigate to result page");
		driver.manage().timeouts().pageLoadTimeout(8,TimeUnit.SECONDS);
		
		//driver.getPageSource().contains("shivakrishna");
		
		String ExpectedTitle = driver.getTitle();
		System.out.println("current page title:" + ExpectedTitle);

		String Actual = "shivakrishna - Google Search";
		Assert.assertEquals(ExpectedTitle, Actual);
		
		driver.close();		
	}
	

}
