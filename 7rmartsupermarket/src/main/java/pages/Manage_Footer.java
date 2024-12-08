package pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Page_Utility;
import utilities.Wait_Utility;

public class Manage_Footer {
	public WebDriver driver;

	public Manage_Footer(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[2]/div[2]/table/tbody/tr[1]/td[4]/a")
	WebElement editfooter;
	@FindBy(xpath = "//textarea[@placeholder='Enter the Address']")
	WebElement editfooteraddress;
	@FindBy(xpath = "//input[contains(@name,'email')]")
	WebElement editfooteremail;
	@FindBy(xpath = "//input[@name='phone']")
	WebElement editfooterphone;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement editfooterupdate;
	@FindBy(xpath = "//i[@class='icon fas fa-check']")
	WebElement alert;

	public Manage_Footer userAbleToeditFooterDetails() {
		editfooter.click();
		return this;
	}

	public Manage_Footer userAbleToeditFooterAddress(String address) throws AWTException {
		editfooteraddress.click();
		Page_Utility select = new Page_Utility();
		select.selectDetails();
		editfooteraddress.sendKeys(address);
		return this;
	}

	public Manage_Footer userAbleToeditFooterEmail(String email) throws AWTException {
		//Wait_Utility wait = new Wait_Utility();
		//wait.waitForElementToBeClickable(driver, editfooteremail);
		editfooteremail.click();
		  Page_Utility select=new Page_Utility();
		  select.Selection(editfooteremail);
		 editfooteremail.sendKeys(email);
		return this;
	}

	public Manage_Footer userAbleToeditFooterPhone(String phone) throws AWTException {
		editfooterphone.click();
		/*
		 * Page_Utility select=new Page_Utility(); select.selectDetails();
		 */
		editfooterphone.sendKeys(phone);
		return this;
	}

	public Manage_Footer userAbleToUpdateFooterDetails() {
		editfooterupdate.click();
		return this;
	}

	public boolean isAlertmessageDisplayed() {
		return alert.isDisplayed();
	}
}