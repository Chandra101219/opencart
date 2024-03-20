package page_objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePOM {
  WebDriver driver;
  
  public BasePOM(WebDriver driver) {
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
  }
}
