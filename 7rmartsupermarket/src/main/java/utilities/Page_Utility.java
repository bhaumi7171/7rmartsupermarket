package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Page_Utility {
	public WebDriver driver;
	
public void Selectbytext(WebElement dropdown, String text)
{
	Select drop=new Select (dropdown);
	drop.selectByVisibleText("Staff");
}
	
}
