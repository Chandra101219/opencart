package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class account_page extends BasePOM{

	public account_page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//h2[text()='My Account']")
	WebElement my_account;
	
	@FindBy(xpath = "//div[@class='list-group mb-3']//a[text()='Logout']")
	WebElement logout;
	
	public boolean isMyAccountPageExists()
	{
		try {
			return (my_account.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void clickLogout() {
		logout.click();

	}

  
}
