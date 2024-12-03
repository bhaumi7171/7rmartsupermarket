package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import constants.Constant;
import pages.Admin_UserAdd;
import pages.Home_Page;
import pages.Login_Page;
import utilities.Excel_Utility;

public class AdminUserAdd_Test extends Baseproject {
	public Home_Page homepage;
	public Admin_UserAdd adminuser;
  @Test
  public void adminAbleToLogin() throws IOException
  {
	  String username1=Excel_Utility.readStringData(1, 0,"Login_Page");
	  String password1= Excel_Utility.readStringData(1, 1,"Login_Page"); 
	  String adminusername=Excel_Utility.readStringData(1, 0, "Adminuser_Test");
	  String adminpassword=Excel_Utility.readStringData(1, 1, "Adminuser_Test");
	  Login_Page signin=new Login_Page(driver);
	  signin.userAbleToLoginSuccessfullyUsernamefield(username1);
	  signin.userAbleToJoinSuccessfullyPasswordfield(password1);
	
	  homepage=signin.userAbleToJoinSuccessfullyLogin();
	  adminuser=homepage.adminUserPage();
	  adminuser.adminUserAdd();
	  adminuser.enterusernameclick();
	  adminuser.enterUsername(adminusername);
	  adminuser.enterpasswordclick();
	  adminuser.enterPassword(adminpassword);
	  adminuser.userTypeDropdown();
	  adminuser.saveUser();
	  //signin.userAbleToJoinSuccessfullyLogin();
	  //Admin_UserAdd adduser=new Admin_UserAdd(driver);
	  //adduser.adminUserPage();
	 // adduser.adminUserAdd();
	 // adduser.enterusernameclick();
	 // adduser.enterUsername(adminusername);
	 // adduser.enterpasswordclick();
	 // adduser.enterPassword(adminpassword);
	//  adduser.userTypeDropdown();
	//  adduser.saveUser();
	//  boolean alertmessage=adminuser.alertmessage();
	  boolean alertmessage= adminuser.alertmessage();
	  assertTrue(alertmessage, Constant.ERRORMESSAGEFORSAVEDUSER);
  }
  
}