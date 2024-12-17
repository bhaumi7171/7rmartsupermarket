package testscript;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constant;
import pages.Home_Page;
import pages.Login_Page;
import pages.Manage_Footer;
import utilities.Excel_Utility;

public class ManageFooter_Test extends Baseproject {
	public Home_Page homepage;
	public Manage_Footer footer;

	@Test
	public void userAbleToManageFooter() throws IOException, AWTException {
		Login_Page signin = new Login_Page(driver);
		String username = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password = Excel_Utility.readStringData(1, 1, "Login_Page");
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);
		homepage = signin.userAbleToJoinSuccessfullyLogin();
		footer = homepage.userAbleToGetFooterPage();
		footer.userAbleToeditFooterDetails();
		String address = Excel_Utility.readStringData(1, 0, "Manage_Footer");
		footer.userAbleToeditFooterAddress(address);
		String email = Excel_Utility.readStringData(1, 1, "Manage_Footer");
		footer.userAbleToeditFooterEmail(email);
		String phone = Excel_Utility.readIntegerData(1, 2, "Manage_Footer");
		footer.userAbleToeditFooterPhone(phone);
		footer.userAbleToUpdateFooterDetails();
		boolean footerup = footer.isAlertmessageDisplayed();
		assertTrue(footerup, Constant.ERRORMESSAGEFORUPDATEFOOTER);
	}
}
