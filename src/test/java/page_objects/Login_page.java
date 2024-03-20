package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Login_page extends BasePOM{
 

	public Login_page(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[text()=\"Login\"]")
	WebElement login;
	
	public void username_input(String email_id) {
		
		username.sendKeys(email_id);
	}
	
	public void password_input(String pswd) {
		
		password.sendKeys(pswd);
	}
	
	public void click_on_login() {
		
		login.click();
	}
}
