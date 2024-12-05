package testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Baseproject {

  public WebDriver driver;
  
  @BeforeMethod
 
  public void beforeMethod() {
		 driver= new ChromeDriver();
		 driver.get("https://groceryapp.uniqassosiates.com/admin/login");
		 driver.manage().window().maximize();
		 //driver.manage().wait()
  }
  
  @AfterMethod
  public void afterMethod() {
	  //driver.quit();
  }

}
