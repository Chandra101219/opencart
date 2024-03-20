package test_cases;

import org.testng.annotations.Test;

import page_objects.Registration;
import page_objects.Signup_page;
import test_base.Base_class;

public class Registration_test extends Base_class {
 
	@Test
	public void verify_registration() throws InterruptedException {
		
		Registration reg = new Registration(driver);
		
		reg.click_on_myaccount();
		
		reg.register();
		
		
		Signup_page signup = new Signup_page(driver);
		
		signup.first_name(p.getProperty("f_name"));
		signup.last_name(p.getProperty("l_name"));
		signup.email_id(p.getProperty("email"));
		signup.password(p.getProperty("passwd"));
		signup.check_box();
		
		signup.confirm();
		
		Thread.sleep(3000);
		String conf_msg= signup.getConfirmationMsg();
		
		System.out.println(conf_msg);
	}
	
}
