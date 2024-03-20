package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Login_page;
import page_objects.Registration;
import page_objects.account_page;
import test_base.Base_class;
import utilities.DataProviders;

public class Login_DDtest extends Base_class{
  @Test(dataProvider="LoginData",dataProviderClass=DataProviders.class)
  public void Login_testdata(String email, String password, String exp_result) {
	  
	  logger.info("***** Starting Execution of Login_DDtest *****");
		logger.debug("logging of debug logs");
		
		try {
		//signup_page
		Registration reg = new Registration(driver);
		
		reg.click_on_myaccount();
		logger.info("clicked on myaccount");
		
		reg.login();
		logger.info("selected login and clicked on login ");
		
		//Login_page
		logger.info("Entering the Login details");
		
		Login_page login = new Login_page(driver);
		
		login.username_input(email);
		logger.info("Entered the username");
		
		login.password_input(password);
		logger.info("Entered the password");
		
		login.click_on_login();
		logger.info("clicked on login");
		
		//myaccount_page
		logger.info("logged in successfully");
		
		account_page my_acc = new account_page(driver);		
		boolean my_acc_page = my_acc.isMyAccountPageExists();
		
		if(exp_result.equalsIgnoreCase("Valid")) {
			if(my_acc_page==true) {
				my_acc.clickLogout();
				Assert.assertTrue(true);
				logger.info("logged out successfully");
			}
			else {
				Assert.assertTrue(false);
			}
		}
		if(exp_result.equalsIgnoreCase("Invalid")) {
			if(my_acc_page==true) {
				my_acc.clickLogout();
				Assert.assertTrue(false);
				logger.info("logged out successfully");
			}
			else {
				Assert.assertTrue(true);
			}
		}
	
		}
		catch(Exception e){
			Assert.fail("An exception occurred: " + e.getMessage());
		}
		
		logger.info("*****  Execution of Login_DDtest is completed *****");	
  }
 
}
