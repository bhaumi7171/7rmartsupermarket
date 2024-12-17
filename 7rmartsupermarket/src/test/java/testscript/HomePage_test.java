package testscript;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Admin_UserAdd;
import pages.Home_Page;
import pages.Login_Page;
import utilities.Excel_Utility;

public class HomePage_test extends Baseproject {
	public Home_Page homepage;

	@Test
	public void UserAbleToLogout() throws IOException {
		String title = driver.getTitle();
		String log = "Login | 7rmart supermarket";
		String username = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password = Excel_Utility.readStringData(1, 1, "Login_Page");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);
		homepage = signin.userAbleToJoinSuccessfullyLogin();
		homepage.UserAbleToLogoutSuccessfully();
		homepage.LogoutButtonn();
		homepage.logout();
		assertEquals(log, title, Constant.ERRORMESSAGEFORLOGOUT);
	}
}