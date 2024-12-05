package testscript;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Login_Page;
import utilities.Excel_Utility;

public class LoginPage_Test extends Baseproject {
	@Test(priority = 1)
	public void UserAbleToLoginWithCorrectCredentials() throws IOException {
		String username = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password = Excel_Utility.readStringData(1, 1, "Login_Page");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);
		signin.userAbleToJoinSuccessfullyLogin();
		boolean issignindone = signin.isLoginIsLoaded();
		assertTrue(issignindone, Constant.ERRORMESSAGEFORLOGIN);
	}

	@Test(priority = 2)
	public void UserAbleToLoginWithCorrectUsernameIncorretPassword() throws IOException {
		String username = Excel_Utility.readStringData(2, 0, "Login_Page");
		String password = Excel_Utility.readStringData(2, 1, "Login_Page");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);
		signin.userAbleToJoinSuccessfullyLogin();
		boolean isalertshown = signin.isAlertShown();
		assertTrue(isalertshown, Constant.ERRORMESSAGEFORLOGIN1);
	}

	@Test(priority = 3)
	public void UserAbleToLoginWithInCorrectUsernameCorretPassword() throws IOException {
		String username = Excel_Utility.readStringData(3, 0, "Login_Page");
		String password = Excel_Utility.readStringData(3, 1, "Login_Page");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);

		signin.userAbleToJoinSuccessfullyLogin();
		boolean isalertshown = signin.isAlertShown();
		assertTrue(isalertshown, Constant.ERRORMESSAGEFORLOGIN2);
	}

	@Test(priority = 4)
	public void UserAbleToLoginWithInCorrectUsernameIncorretPassword() throws IOException {
		String username = Excel_Utility.readStringData(4, 0, "Login_Page");
		String password = Excel_Utility.readIntegerData(4, 1, "Login_Page");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);
		signin.userAbleToJoinSuccessfullyLogin();
		boolean isalertshown = signin.isAlertShown();
		assertTrue(isalertshown, Constant.ERRORMESSAGEFORLOGIN3);

	}
}
