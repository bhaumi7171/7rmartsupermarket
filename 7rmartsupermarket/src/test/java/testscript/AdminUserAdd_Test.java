package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Admin_UserAdd;
import pages.Login_Page;

public class AdminUserAdd_Test extends Baseproject {
  @Test
  @Parameters({"username","password"})
  public void adminAbleToLogin(String username,String password)
  {
	  Login_Page signin=new Login_Page(driver);
	  signin.userAbleToLoginSuccessfullyUsernamefield(username);
	  signin.userAbleToJoinSuccessfullyPasswordfield(password);
	  signin.userAbleToJoinSuccessfullyLogin();
	  Admin_UserAdd adduser=new Admin_UserAdd(driver);
	  adduser.adminUserPage();
	  adduser.adminUserAdd();
	  adduser.enterUsername();
	  adduser.enterPassword();
	  adduser.userTypeDropdown();
	  adduser.saveUser();
	  boolean alertmessage=adduser.alertmessage();
	  assertTrue(alertmessage, "alertmessage not shown");
  }
  
}