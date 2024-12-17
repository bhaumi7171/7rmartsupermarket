package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_Contact {
	public WebDriver driver;

	public Manage_Contact(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//i[@class='fas fa-edit']")
	WebElement editcontact;
	@FindBy(xpath = "//textarea[@placeholder='Enter the Address']")
	WebElement address;
	@FindBy(id = "phone")
	WebElement phonecontact;
	@FindBy(id = "email")
	WebElement email;
	@FindBy(xpath = "//textarea[@placeholder='Enter Delivery Time']")
	WebElement deliverytime;
	@FindBy(id = "del_limit")
	WebElement deliverycharge;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement update;
	@FindBy(xpath = "//i[@class='icon fas fa-check']")
	WebElement alert;

	public Manage_Contact userAbleToeditDetails() {
		editcontact.click();
		return this;
	}

	public Manage_Contact userAbleToAddPhoneContacts(String number) {
		phonecontact.sendKeys(number);
		return this;
	}

	public Manage_Contact userAbleToAddEmailContacts(String mailid) {
		email.sendKeys(mailid);
		return this;
	}

	public Manage_Contact userAbleToAddAddress(String addresss) {
		address.sendKeys(addresss);
		return this;
	}

	public Manage_Contact userAbleToAddDeliveryTime(String time) {
		deliverytime.sendKeys(time);
		return this;
	}

	public Manage_Contact userAbleToAddDeliveryCharge(String charge) {
		deliverycharge.sendKeys(charge);
		return this;
	}

	public Manage_Contact userAbleToUpdate() {
		update.click();
		return this;
	}

	public boolean isUserAbleToEditDetails() {
		return alert.isDisplayed();
	}

}