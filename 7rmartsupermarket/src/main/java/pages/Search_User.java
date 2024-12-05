package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.Page_Utility;

public class Search_User {
	public WebDriver driver;
	public Search_User(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="/html/body/div/div[1]/section/div[2]/div/div[1]/div/div/div/div[2]/form/div/div[1]/input") WebElement searchusername;
	@FindBy(id="un") WebElement searchusernamefield;
	@FindBy(id="ut") WebElement searchusertype;
	@FindBy(xpath="//button[@name='Search']") WebElement searchdetails;
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-sm']/tbody/tr[1]") WebElement tabledetails;
	@FindBy(xpath="//td[text()='Kala']") WebElement tabletext;
	public Search_User adminAbleToClickOnSearchUsernameField()
{
	searchusername.click();
	return this;
}
public Search_User adminAbleToEnterUsername(String usernamefield) {
	searchusernamefield.sendKeys(usernamefield);
	return this;
}
public Search_User adminAbleToSelectUserType()
{
	Page_Utility page=new Page_Utility();
	page.selectbytext(searchusertype, "Staff");
	return this;
}
public Search_User adminAbleToSearchWithDetails()
{
	searchdetails.click(); 
	return this;
}
public boolean adminAbleToViewSearchedDetails()
{
	return tabledetails.isDisplayed();
}
public boolean  adminAbleToViewSearchedDetailstext()    
{
	return tabletext.isDisplayed();
}
}
