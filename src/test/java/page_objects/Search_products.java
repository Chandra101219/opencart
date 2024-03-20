package page_objects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search_products extends BasePOM{
	public Search_products(WebDriver driver)
	{
		super(driver);
	}	
		@FindBy(xpath="//*[@id='content']/div[3]//img")
		List<WebElement> searchProducts;
				
		@FindBy(name="quantity")
		WebElement quantity;
		
		@FindBy(xpath="//button[@id='button-cart']")
		WebElement addToCart;
		
		@FindBy(xpath="//div[contains(text(),'Success: You have added')]")
		WebElement cnf_Msg;
		
		public boolean isProductExist(String productName)
		{
			boolean flag=false;
			for(WebElement product:searchProducts)
			{				
				if(product.getAttribute("title").equals(productName))
				{
				flag=true;
				break;
				}
			}
			
			return flag;
		
		}
		
		public void selectProduct(String productName)
		{
			for(WebElement product:searchProducts)
			{				
				if(product.getAttribute("title").equals(productName))
				{
					product.click();
				}
			}
		
		}
		
		public void setQuantity(String qty)
		{
			quantity.clear();
			quantity.sendKeys(qty);
		}
		
		public void addToCart()
		{
			addToCart.click();
		}
		
		public boolean checkConfMsg()
		{
			try
			{
			return cnf_Msg.isDisplayed();
			}
			catch(Exception e)
			{
				return false;
			}
		}
}