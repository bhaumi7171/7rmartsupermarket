package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constant;
import pages.Home_Page;
import pages.Login_Page;
import pages.Sub_Category;
import utilities.Excel_Utility;

public class SubCategory_Test extends Baseproject {
	public Home_Page homepage;
	public Sub_Category subcategory;

	@Test
	public void userAbleToaddCAtegory() throws IOException {
		String username1 = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password1 = Excel_Utility.readStringData(1, 1, "Login_Page");
		String cat = Excel_Utility.readStringData(1, 0, "Category_Page");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username1, password1);
		homepage = signin.userAbleToJoinSuccessfullyLogin();
		subcategory = homepage.AdminAbleToGetSubCategoryPage();
		subcategory.adminAbleToAddNewSubCategory().adminAbleToSelectcategory().adminAbleToAddSubCategory(cat)
				.adminAbleToUploadImage().adminAbleToSavecategory();
		boolean alert = subcategory.isAdminAbleToAddCategorySuccessfully();
		assertTrue(alert, Constant.ERRORMESSAGEFORADDSUBCATEGORY);

	}
}
