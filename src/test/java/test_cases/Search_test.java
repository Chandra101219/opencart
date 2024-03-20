package test_cases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_objects.Registration;
import page_objects.Search_products;
import test_base.Base_class;

public class Search_test<SearchPage> extends Base_class{
	@Test(groups= {"master"})
	public void product_Search() throws InterruptedException {
		logger.info(" Starting Search_Product_Test Execution ");

		try {
			
			Registration reg=new Registration(driver);
			
			//hm.enterProductName("iPhone");
			reg.enterProductName("HTC");
			
			reg.clickSearch();
			
			Search_products sp=new Search_products(driver);
			sp.isProductExist("HTC Touch HD");

			Assert.assertEquals(sp.isProductExist("HTC Touch HD"),true);

		} catch (Exception e) {
			Assert.fail();
		}

		logger.info(" Finished Search_Product_Test Execution ");

	}
}
