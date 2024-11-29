package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;
	public Login_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[text()='Sign In']") WebElement signin;
	@FindBy(xpath="//a[text()=' Admin']") WebElement admin;
	
	public void userAbleToLoginSuccessfullyUsernamefield(String usernamefield)
			{
		username.sendKeys(usernamefield);
		}
	public void userAbleToJoinSuccessfullyPasswordfield(String passwordfield)
	{
		password.sendKeys(passwordfield);
	}
	public void userAbleToJoinSuccessfullyLogin()
	{
		signin.click();
	}
	public boolean isLoginIsLoaded()
	{
		return admin.isDisplayed();
				}
	
}
