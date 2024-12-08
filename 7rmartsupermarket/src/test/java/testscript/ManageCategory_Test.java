package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constant;
import pages.Home_Page;
import pages.Login_Page;
import pages.Manage_Category;
import utilities.Excel_Utility;

public class ManageCategory_Test extends Baseproject {
	Home_Page homepage;
	Manage_Category managecategory;

	@Test
	public void userAbleTomanageCategory() throws IOException {
		String username1 = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password1 = Excel_Utility.readStringData(1, 1, "Login_Page");
		String cat = Excel_Utility.readStringData(1, 0, "Category_Page");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username1, password1);
		homepage = signin.userAbleToJoinSuccessfullyLogin();
		managecategory = homepage.adminAbleToManageCategory();
		managecategory.adminAbleToSearchCategory().adminAbleToEnterCategoryName(cat).adminAbleToClickOnSearch();
		boolean result = managecategory.isSearchDetailsDisplayed();
		assertTrue(result, Constant.ERRORMESSAGEFORSEARCHCATEGORY);
	}
}
