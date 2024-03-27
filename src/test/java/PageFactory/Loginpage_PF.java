package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpage_PF {

	WebDriver driver;

	@FindBy(id = "name")
	@CacheLookup
	WebElement txt_username;

	@FindBy(how=How.ID,using="password")
	@CacheLookup
	WebElement txt_password;

	@FindBy(id = "login")
	WebElement btn_login;
	
	public Loginpage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	public void enterUsername(String Username) {
		txt_username.sendKeys(Username);
	}
	public void enterPassword(String Password) {
		txt_password.sendKeys(Password);
	}
	public void clicklogin() {
		btn_login.click();
	}

}
