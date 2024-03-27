package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage_PF {

	WebDriver driver;
	
	@FindBy(id="logout")
	WebElement btn_logout;

	public Homepage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void checklogoutisDisplayed() {
		btn_logout.isDisplayed();
	}

}
