package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Page_Utility;

public class Admin_UserAdd {
	public WebDriver driver;

	public Admin_UserAdd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newuser;
	@FindBy(xpath = "id(\"username\")")
	WebElement usernamefield;
	@FindBy(xpath = "id(\"password\")")
	WebElement passwordfield;
	@FindBy(xpath = "id(\"user_type\")")
	WebElement usertype;
	@FindBy(xpath = "//button[@name='Create']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public Admin_UserAdd adminUserAdd() {
		newuser.click();
		return this;
	}

	public Admin_UserAdd enterusernameclick() {
		usernamefield.click();
		return this;
	}

	public Admin_UserAdd enterUsername(String username) {
		usernamefield.sendKeys(username);
		return this;
	}

	public Admin_UserAdd enterpasswordclick() {
		passwordfield.click();
		return this;
	}

	public Admin_UserAdd enterPassword(String password) {
		passwordfield.sendKeys(password);
		return this;
	}

	public Admin_UserAdd userTypeDropdown() {
		Page_Utility page = new Page_Utility();
		page.selectbytext(usertype, "Staff");
		return this;
	}

	public Admin_UserAdd saveUser() {
		save.click();
		return this;
	}

	public boolean alertmessage() {
		return alert.isDisplayed();
	}

}
