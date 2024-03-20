package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration extends BasePOM{
	//WebDriver driver;
	
	public Registration(WebDriver driver)
	{
		super(driver);
	}
	
	//Elements in HomePage
	@FindBy(xpath="//span[text()='My Account']") 
	WebElement myaccount;

	@FindBy(xpath="//a[text()='Register']") 
	WebElement register;
	
	@FindBy(linkText="Login")
	WebElement login;
	
	@FindBy(xpath="//input[@placeholder='Search']")  //For Search Product Test
	WebElement txtSearchbox;

	@FindBy(xpath="//div[@id='search']//button[@type='button']") //For Search Product Test
	WebElement btnSearch;
	
	//Actions to be performed on Web Elements
	public void click_on_myaccount() {
		
		myaccount.click();
	}
	
	public void register() {
		
		register.click();
	}
	
	public void login() {
		
		login.click();
	}
	public void enterProductName(String pName)   //For Search Product Test
	{
		txtSearchbox.sendKeys(pName);
	}

	public void clickSearch()  //For Search Product Test
	{
		btnSearch.click();
	}



}
