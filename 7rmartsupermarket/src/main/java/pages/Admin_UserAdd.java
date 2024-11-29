package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Admin_UserAdd {
	public WebDriver driver;
	public Admin_UserAdd(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="/html/body/div/div[1]/section/div/div/div[1]/div/a") WebElement adminuser;
	//@FindBy(xpath="//h1[text()='Admin Users']") WebElement adminuserpage;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']") WebElement newuser;
	@FindBy(xpath="id(\"username\")") WebElement usernamefield;
	@FindBy(xpath="id(\"password\")") WebElement passwordfield;
	@FindBy(xpath="id(\"user_type\")") WebElement usertype;
	@FindBy(xpath="//button[@name='Create']") WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alert;
	public void adminUserPage()
	{
		/*WebDriverWait loginwait=new WebDriverWait(driver,Duration.ofSeconds(10));
		loginwait.until(ExpectedConditions.elementToBeClickable(adminuser));*/
		adminuser.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}
	public void adminUserAdd()
	{
		newuser.click();
	}
	public void enterUsername()
	{
		usernamefield.sendKeys("Kaladevi          ");
	}
	public void enterPassword()
	{
		passwordfield.sendKeys("1234");
	}
	public void userTypeDropdown()
	{
		Select dropdown=new Select(usertype);
		dropdown.selectByVisibleText("Staff");
	}
	public void saveUser()
	{
		save.click();
	}
	/*public boolean adminUserPageloaded()
	{
		return adminuserpage.isDisplayed();
	}*/
	public boolean alertmessage()
	{
		return alert.isDisplayed();
	}

}
