package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home_Page {
	public WebDriver driver;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@data-toggle='dropdown']")
	WebElement adminuserr;
	@FindBy(xpath = "/html/body/div/nav/ul[2]/li/div/a[2]")
	WebElement loggout;
	@FindBy(xpath = "//div[@class='card-body login-card-body']")
	WebElement loginbody;
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[1]/div/a")
	WebElement adminuser;
	@FindBy(xpath = "//a[@onclick='click_button(2)']")
	WebElement search;
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[3]/div/a")
	WebElement category;
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[5]/div/a")
	WebElement managecontact;
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[9]/div/a")
	WebElement newspage;
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[10]/div/a")
	WebElement footerpage;
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div[4]/div/a")
	WebElement subcategory;
	@FindBy(xpath = "//html/body/div/div[1]/section/div/div/div[11]/div/a")
	WebElement managecategorypage;

	public Home_Page UserAbleToLogoutSuccessfully() {
		adminuserr.click();
		return this;
	}

	public Home_Page LogoutButtonn() {
		loggout.click();
		return this;
	}

	public void logout() {
		String title = "";
		if (title.equals("Login | 7rmart supermarket")) {
			loginbody.isDisplayed();
		}
	}

	public Admin_UserAdd adminUserPage() {
		adminuser.click();
		return new Admin_UserAdd(driver);
	}

	public Search_User adminAbleToSearchUserDetails() {
		search.click();
		return new Search_User(driver);
	}

	public AdminAdd_Category categoryPage() {
		category.click();
		return new AdminAdd_Category(driver);
	}

	public Manage_Contact userAbleToManageContact() {
		managecontact.click();
		return new Manage_Contact(driver);
	}

	public Manage_News userAbleToGetNewsPage() {
		newspage.click();
		return new Manage_News(driver);
	}

	public Manage_Footer userAbleToGetFooterPage() {
		footerpage.click();
		return new Manage_Footer(driver);
	}

	public Sub_Category AdminAbleToGetSubCategoryPage() {
		subcategory.click();
		return new Sub_Category(driver);
	}

	public Manage_Category adminAbleToManageCategory() {
		managecategorypage.click();
		return new Manage_Category(driver);
	}
}
