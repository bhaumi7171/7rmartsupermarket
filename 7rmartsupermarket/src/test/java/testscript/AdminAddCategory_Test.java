package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constant;
import pages.AdminAdd_Category;
import pages.Home_Page;
import pages.Login_Page;
import utilities.Excel_Utility;

public class AdminAddCategory_Test extends Baseproject {
	public Home_Page homepage;
	public AdminAdd_Category category;

	@Test
	public void UserAbleToAddCategory() throws AWTException, Exception {
		String username1 = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password1 = Excel_Utility.readStringData(1, 1, "Login_Page");
		String cat = Excel_Utility.readStringData(2, 0, "Category_Page");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username1, password1);
		homepage = signin.userAbleToJoinSuccessfullyLogin();
		category = homepage.categoryPage();
		category.userAbleToAddNewCategory();
		category.userAbleToClickOnCategoryField();
		category.userAbleToEnterCategory(cat);
		category.userAbletoSelectGroup();
		category.userAbleToUploadCategoryImage();
		category.userAbleToSaveCategory(); 
		boolean alert=category.isCategorySavedSuccessfully();
		assertTrue(alert, Constant.ERRORMESSAGEFORADDCATEGORY);
	}
}
