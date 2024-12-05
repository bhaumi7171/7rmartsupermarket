package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constant;
import utilities.Fileupload_Utility;
import utilities.Page_Utility;

public class Sub_Category {
	public WebDriver driver;

	public Sub_Category(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newsubcategory;
	@FindBy(xpath = "//select[@class='form-control selectpicker']")
	WebElement selectcategory;
	@FindBy(xpath = "//input[@placeholder='Enter the Subcategory']")
	WebElement selectsubcategory;
	@FindBy(id = "main_img")
	WebElement categoryimage;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement save;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement alert;

	public Sub_Category AdminAbleToAddNewSubCategory() {
		newsubcategory.click();
		return this;
	}

	public Sub_Category AdminAbleToSelectcategory() {
		selectcategory.click();
		Page_Utility category = new Page_Utility();
		category.selectbyindex(selectcategory, 2);
		return this;
	}

	public Sub_Category AdminAbleToAddSubCategory(String subcategory) {
		selectsubcategory.sendKeys(subcategory);
		return this;
	}

	public Sub_Category AdminAbleToUploadImage() {
		String image = Constant.TESTIMAGEFILE;
		Fileupload_Utility file = new Fileupload_Utility();
		file.sendKeysProfileUpload(categoryimage, image);
		return this;
	}

	public Sub_Category AdminAbleToSavecategory() {
		save.click();
		return this;
	}

	public boolean isAdminAbleToAddCategorySuccessfully() {
		return alert.isDisplayed();
	}
}