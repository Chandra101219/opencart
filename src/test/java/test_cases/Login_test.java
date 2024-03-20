package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Login_page;
import page_objects.Registration;
import page_objects.account_page;
import test_base.Base_class;

public class Login_test extends Base_class{
  
	@Test(groups= {"sanity","master"})
	public void Login_testcase() {
		logger.info("***** Starting Execution of Login_test *****");
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
		
		login.username_input(p.getProperty("email_id"));
		logger.info("Entered the username");
		
		login.password_input(p.getProperty("pswd"));
		logger.info("Entered the password");
		
		login.click_on_login();
		logger.info("clicked on login");
		
		//myaccount_page
		logger.info("logged in successfully");
		account_page my_acc = new account_page(driver);		
		boolean my_acc_page = my_acc.isMyAccountPageExists();
		
		Assert.assertEquals(my_acc_page, true,"Login passed");
	
		}
		catch(Exception e){
			Assert.fail();
		}
		
		logger.info("*****  Execution of Login_test is completed *****");	
	}
		
}
