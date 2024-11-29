package testscript;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.Admin_UserAdd;
import pages.Login_Page;
import pages.Search_User;

public class Searchuser_Test extends Baseproject{
  @Test
  @Parameters({"username","password","usernamefield"})
    public void adminAbleToSearchUser(String username, String password, String usernamefield) {
	  Login_Page signin=new Login_Page(driver);
	  signin.userAbleToLoginSuccessfullyUsernamefield(username);
	  signin.userAbleToJoinSuccessfullyPasswordfield(password);
	  signin.userAbleToJoinSuccessfullyLogin();
	  Admin_UserAdd adduser=new Admin_UserAdd(driver);
	  adduser.adminUserPage();
	  Search_User usersearch=new Search_User(driver);
	  usersearch.adminAbleToSearchUserDetails();
	  usersearch.adminAbleToEnterUsername(usernamefield);
	  usersearch.adminAbleToSelectUserType();
	  usersearch.adminAbleToSearchWithDetails();
	  boolean searchuser=usersearch.adminAbleToViewSearchedDetails();
	  assertTrue(searchuser, "not able to search user");
	  
	  
  }
}
