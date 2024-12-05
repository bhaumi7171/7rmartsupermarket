package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_News {
	public WebDriver driver;

	public Manage_News(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newnews;
	@FindBy(xpath = "//textarea[@placeholder='Enter the news']")
	WebElement addnews;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;

	public Manage_News userAbleToAddNewNews() {
		newnews.click();
		return this;
	}

	public Manage_News userAbleToEnterTheNews(String news) {
		addnews.sendKeys(news);
		return this;
	}

	public Manage_News userAbleToSaveNews() {
		save.click();
		return this;
	}

	public boolean isAlertMessageDisplayed() {
		return alert.isDisplayed();
	}
}
