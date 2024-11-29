package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Search_User {
	public WebDriver driver;
	public Search_User(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement search;
	@FindBy(id="un") WebElement searchusernamefield;
	@FindBy(id="ut") WebElement searchusertype;
	@FindBy(xpath="//button[@name='Search']") WebElement searchdetails;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]") WebElement tabledetails;
	
	
public void adminAbleToSearchUserDetails()
{
	search.click();
}
public void adminAbleToEnterUsername(String usernamefield) {
	searchusernamefield.sendKeys(usernamefield);
}
public void adminAbleToSelectUserType()
{
	Select dropdown=new Select(searchusertype);
	dropdown.selectByVisibleText("Staff");
}
public void adminAbleToSearchWithDetails()
{
	searchdetails.click(); 
}
public boolean adminAbleToViewSearchedDetails()
{
	return tabledetails.isDisplayed();
}
}
