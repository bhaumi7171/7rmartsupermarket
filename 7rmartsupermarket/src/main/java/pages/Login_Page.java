package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public WebDriver driver;

	public Login_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath = "//input[@placeholder='Username']")
	WebElement username;
	@FindBy(xpath = "//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath = "//button[text()='Sign In']")
	WebElement signin;
	@FindBy(xpath = "//a[text()=' Admin']")
	WebElement admin;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alert;
	public Login_Page userAbleToLoginSuccessfullywithlogindetails(String usernamefield, String passwordfield) {
		username.sendKeys(usernamefield);
		password.sendKeys(passwordfield);
		return this;
	}
	public Home_Page userAbleToJoinSuccessfullyLogin() {
		signin.click();
		return new Home_Page(driver);
	}
	public boolean isLoginIsLoaded() {
		return admin.isDisplayed();
	}
	public boolean isAlertShown() {
		return alert.isDisplayed();
	}
}
