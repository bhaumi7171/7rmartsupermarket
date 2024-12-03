package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Page {

	public WebDriver driver;
	public Home_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//a[@data-toggle='dropdown']") WebElement adminuserr;
	@FindBy(xpath="/html/body/div/nav/ul[2]/li/div/a[2]") WebElement logout;
	@FindBy(xpath="//div[@class='card-body login-card-body']") WebElement loginbody;
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a") WebElement adminuser;
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement search;
	
	
	public Home_Page UserAbleToLogoutSuccessfully()
	{
		adminuserr.click();
		return this;
	}
	public Home_Page LogoutButton()
	{
		logout.click();
		return this;
	}
	/*public boolean Loginpage()
	{
		return loginbody.isDisplayed();
	}*/
	public void  logout()
	{
		String title="";
	
		if(title.equals("Login | 7rmart supermarket" ))
		{
			 loginbody.isDisplayed();
		}
	
	}
	public Admin_UserAdd adminUserPage()
	{

		adminuser.click();
		return new Admin_UserAdd(driver);
	
	}
	public Search_User adminAbleToSearchUserDetails()
	{
		search.click();
		return new Search_User(driver);
	}
}
