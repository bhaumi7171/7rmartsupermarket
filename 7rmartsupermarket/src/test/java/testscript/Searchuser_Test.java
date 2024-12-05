package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Admin_UserAdd;
import pages.Home_Page;
import pages.Login_Page;
import pages.Search_User;
import utilities.Excel_Utility;

public class Searchuser_Test extends Baseproject {
	public Home_Page homepage;
	public Admin_UserAdd adminuser;
	public Search_User search;
	@Test
	public void adminAbleToSearchUser() throws IOException {
		String username = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password = Excel_Utility.readStringData(1, 1, "Login_Page");
		String searchusername = Excel_Utility.readStringData(1, 0, "Searchuser_Test");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);
		homepage = signin.userAbleToJoinSuccessfullyLogin();
		adminuser = homepage.adminUserPage();
		search = homepage.adminAbleToSearchUserDetails();
		search.adminAbleToClickOnSearchUsernameField();
		search.adminAbleToEnterUsername(searchusername);
		search.adminAbleToSelectUserType();
		search.adminAbleToSearchWithDetails();
		boolean searchtableuser = search.adminAbleToViewSearchedDetailstext();
		assertTrue(searchtableuser, Constant.ERRORMESSAGEFORUSERSEARCH);
	}
}
