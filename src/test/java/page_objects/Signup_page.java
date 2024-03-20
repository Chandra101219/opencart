package page_objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup_page extends BasePOM{

	public Signup_page(WebDriver driver) {
		super(driver);
		
	}
	
	//Elements in signup page
	@FindBy(xpath = "//input[@name = 'firstname']") 
	WebElement firstname;
	
	@FindBy(xpath = "//input[@name = 'lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@name = 'email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name = 'password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name = 'agree']")
	WebElement checkbox;
	
	@FindBy(xpath = "//button[@type = 'submit']")
	WebElement submit;
	
	@FindBy(xpath = "//h1[text()= 'Your Account Has Been Created!']")
	WebElement confirmation;
	
	//actions to be performed
	public void first_name(String f_name) {
		
		firstname.sendKeys(f_name);
	}

	public void last_name(String l_name) {
		
		lastname.sendKeys(l_name);
	}
	
	
	public void email_id(String mail) {
	
	email.sendKeys(mail);
	}

	public void password(String pwrd) {
	
	password.sendKeys(pwrd);
	}

	public void check_box() {
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", checkbox);
	}
	
	public void confirm() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", submit);
	}
	
	public String getConfirmationMsg() {
		try {
			return (confirmation.getText());
		}
		catch (Exception e) {
			return (e.getMessage());
		}

	}


}
