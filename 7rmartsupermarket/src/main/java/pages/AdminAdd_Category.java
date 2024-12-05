package pages;


/*import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.invoke.ConstantBootstraps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;

import utilities.Excel_Utility;
import utilities.Fileupload_Utility;





public class AdminAdd_Category {
	public WebDriver driver;
	static FileInputStream f;

	public AdminAdd_Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newbtn;
	@FindBy(xpath = "//input[@placeholder='Enter the Category']")
	WebElement entercatagory;
	@FindBy(xpath = "//li[@id='134-selectable']")
	WebElement drag;
	@FindBy(xpath = "//li[@id='134-selection']")
	WebElement drop;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alert;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement save;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/div[1]/input[1]")
	WebElement choosebtn;

	public AdminAdd_Category click_Newbtn() {
		newbtn.click();
		return this;
	}

	public AdminAdd_Category catagoryInformtions() throws IOException, InterruptedException {
		String cat = Excel_Utility.readStringData(1, 0, "Category_Page");
		entercatagory.sendKeys(cat);
		String imagepath = Constant.TESTIMAGEFILE;
		
		drag.click();
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollTo(0, 9000)");
		Thread.sleep(3000);
		Fileupload_Utility file=new Fileupload_Utility();
		file.sendKeysProfileUpload(choosebtn, imagepath);
		//choosebtn.sendKeys(imagepath);
		save.click();

		return this;
	}

	public boolean isAlertDisplayed() {
		return alert.isDisplayed();
	}

}*/

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
	//@FindBy(xpath= "/html/body/div/div[1]/section/div/div/div/div/form/div/div[3]/div/label")WebElement clickk;
	//@FindBy(xpath = "//input[contains(@name,'main_img')]")
	//WebElement imageupload;
	@FindBy(xpath =
	"/html/body/div/div[1]/section/div/div/div/div/form/div/div[3]/div/input")
	WebElement imageupload;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
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
		/*Actions actions = new Actions(driver);
		actions.moveToElement(selectgroup);
		actions.doubleClick(selectgroup).perform();
		actions.dragAndDrop(selectgroup, selectgroupdrop).build().perform();
		selectgroupdrop.click();*/
		return this;
	}
		public AdminAdd_Category userAbleToUploadCategoryImage() throws AWTException, InterruptedException {
		String Testimagefile=Constant.TESTIMAGEFILE;
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("window.scrollTo(0,1000)");
//		imageupload.click();
		Fileupload_Utility fileupload = new Fileupload_Utility();
		fileupload.sendKeysProfileUpload(imageupload,Testimagefile);
		return this;
	}
	public AdminAdd_Category userAbleToSaveCategory() {
		save.click();
		return this;
	}
}
	/*
	 * public boolean isCategorySavedSuccessfully() { return }
	 */

