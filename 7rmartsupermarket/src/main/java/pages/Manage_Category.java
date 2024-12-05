package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Manage_Category

 {
	public WebDriver driver;
	public Manage_Category(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']") WebElement searchcategory;
@FindBy(xpath="//input[@placeholder='Category']") WebElement categoryname;
@FindBy(xpath="//button[@name='Search']") WebElement search;
@FindBy(xpath="//td[text()='Toys']") WebElement result;
 
 public Manage_Category adminAbleToSearchCategory()
 {
	 searchcategory.click();
	 return this;
 }
 public Manage_Category adminAbleToEnterCategoryName(String name)
 {
	 categoryname.sendKeys(name);
	 return this;
 }
 public Manage_Category adminAbleToClickOnSearch()
 {
	 search.click();
	 return this;
 }
 public boolean isSearchDetailsDisplayed()
 {
	 return result.isDisplayed();
 }
 }