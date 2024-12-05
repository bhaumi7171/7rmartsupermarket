package pages;




import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import constants.Constant;
import utilities.Fileupload_Utility;
import utilities.Page_Utility;
import utilities.Wait_Utility;
public class AdminAdd_Category {
	public WebDriver driver;
	public AdminAdd_Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newcategory;
	@FindBy(xpath = "//input[@type='text']")
	WebElement categoryfield;
	@FindBy(id = "134-selectable")  
	WebElement selectgroup;
	@FindBy(xpath = "/html/body/div/div[1]/section/div/div/div/div/form/div/div[2]/div/div/div[2]/ul")	WebElement selectgroupdrop;
	@FindBy(xpath = "//input[contains(@name,'main_img')]")
	WebElement imageupload;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	
	@FindBy(xpath="//I[@CLASS='icon fas fa-check']") WebElement alert;
	public AdminAdd_Category userAbleToAddNewCategory() {
		newcategory.click();
		return this;
	}
	public AdminAdd_Category userAbleToClickOnCategoryField() {
		categoryfield.click();
		return this;
	}
	public AdminAdd_Category userAbleToEnterCategory(String categoryname) {
		categoryfield.sendKeys(categoryname);
		return this;
	}
	public AdminAdd_Category userAbletoSelectGroup() {
		selectgroup.click();
		return this;
	}
		public AdminAdd_Category userAbleToUploadCategoryImage() throws AWTException, InterruptedException {
		//String Testimagefile=Constant.TESTIMAGEFILE;
		String Testimagefile=Constant.TESTIMAGEFILEJEW;
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollTo(0,1000)");
		Fileupload_Utility fileupload = new Fileupload_Utility();
		fileupload.sendKeysProfileUpload(imageupload,Testimagefile);
		return this;
	}
	public AdminAdd_Category userAbleToSaveCategory() {
		save.click();
		return this;
	}
	public boolean isCategorySavedSuccessfully() {
	  { return alert.isDisplayed();
	  }
	  }
}


