package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	WebDriver driver;
	By txt_username = By.id("name");
	By txt_password = By.id("password");
	By btn_login = By.id("login");
	By btn_logout=By.id("logout");
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
	}

	public void enter_username(String Username) {
		driver.findElement(txt_username).sendKeys(Username);
	}

	public void enter_password(String Password) {
		driver.findElement(txt_password).sendKeys(Password);
	}

	public void click_login_button() {
		driver.findElement(btn_login).click();
	}
	
	public void display_logout() {
		driver.findElement(btn_logout).isDisplayed();
	}
	
	public void valid_credentials(String username,String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	

}
