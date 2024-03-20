package test_cases;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Registration;
import page_objects.Signup_page;
import test_base.Base_class;

public class Registration_logs extends Base_class{
	/*
	@Test
	public void verify_registration() throws InterruptedException {
		
		logger.info("**** starts executing Registraion_logs test case");
		
		//logger.debug("application logs started......");
		try {
		Registration reg = new Registration(driver);
		
		reg.click_on_myaccount();
		
		logger.info("clicked on myaccount");
		
		reg.register();
		logger.info("selected register and clicked on Register ");
		
		
		logger.info("Entering the required details for signup ");
		Signup_page signup = new Signup_page(driver);
		
		signup.first_name("Chandra");
		signup.last_name("Ch");
		signup.email_id("tes1777890@gmail.com");
		signup.password("abcd@1234");
		signup.check_box();
		
		signup.confirm();
		
		Thread.sleep(3000);
		String conf_msg=signup.getConfirmationMsg();
		System.out.println(conf_msg);
		
		logger.info("validating the successfull registartion ");
		
		Assert.assertEquals(conf_msg, "Your Account Has Been Created!", "test passed");
	}
	catch(Exception e)
	{
		logger.error("test failed..");
		logger.debug("debug logs....");
		Assert.fail();
	}
	
	logger.debug("application logs end.......");
	logger.info("**** finished executing Registration_logs test case  *****");
	
	}*/
	
	
	@Test(groups= {"regression","master"})
	public void verify_registration() throws InterruptedException {
		
		logger.info("**** starts executing Registraion_logs test case");
		
		//logger.debug("application logs started......");
		try {
		Registration reg = new Registration(driver);
		
		reg.click_on_myaccount();
		
		logger.info("clicked on myaccount");
		
		reg.register();
		logger.info("selected register and clicked on Register ");
		
		
		logger.info("Entering the required details for signup ");
		Signup_page signup = new Signup_page(driver);
		
		signup.first_name(randomeString().toUpperCase());
		signup.last_name(randomeString().toUpperCase());
		signup.email_id(randomeString()+"@gmail.com");
		
		String password=randomAlphaNumeric();
		signup.password(password);
		//signup.setConfirmPassword(password);
		
		
		signup.check_box();
		
		signup.confirm();
		
		Thread.sleep(3000);
		String conf_msg=signup.getConfirmationMsg();
		System.out.println(conf_msg);
		
		logger.info("validating the successfull registartion ");
		if(conf_msg.equals("Your Account Has Been Created!")) {
		
			logger.info("successfull registration message matched ");
			Assert.assertTrue(true);
		}
		else {
			logger.info("successfull registration message not matched ");
			Assert.fail();
		}
		
	}
	
	catch(Exception e)
	{
		logger.error("test failed..");
		//logger.debug("debug logs....");
		Assert.fail();
	}
	
	//logger.debug("application logs end.......");
	logger.info("**** finished executing Registration_logs test case  *****");
	
	}
}
