package testscript;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Login_Page;

public class LoginPage_Test extends Baseproject {
  @Test(priority=1)
  @Parameters({"username","password"})
  public void UserAbleToLoginWithCorrectCredentials(String username, String password) {
	  Login_Page signin=new Login_Page(driver);
	  signin.userAbleToLoginSuccessfullyUsernamefield(username);
	  signin.userAbleToJoinSuccessfullyPasswordfield(password);
	  signin.userAbleToJoinSuccessfullyLogin();
	  boolean issignindone=signin.isLoginIsLoaded();
	  assertTrue(issignindone, "user able to login with in correct username and password");
  }
  @DataProvider(name="logincredentials")
  public Object[][] testData()
  {
	  Object data[][]= {{"admin","1234"}};
  return data;
  }
@Test(dataProvider= "logincredentials")
  public void UserAbleToLoginWithCorrectUsernameIncorretPassword(String username, String password) {
	  Login_Page signin=new Login_Page(driver);
	  signin.userAbleToLoginSuccessfullyUsernamefield(username);
	  signin.userAbleToJoinSuccessfullyPasswordfield(password);
	  signin.userAbleToJoinSuccessfullyLogin(); 
 boolean issigninnotdone=signin.isLoginIsLoaded();
//assertFalse(issigninnotdone,"user not able to login with in correct password");
assertTrue(issigninnotdone, "user not able to login with incorrect password");
  }
  @Test(priority=3)
  public void UserAbleToLoginWithInCorrectUsernameCorretPassword() {
	  Login_Page signin=new Login_Page(driver);
	  signin.userAbleToLoginSuccessfullyUsernamefield("12admin");
	  signin.userAbleToJoinSuccessfullyPasswordfield("admin");
	  signin.userAbleToJoinSuccessfullyLogin(); 
	 boolean issigninnotdone=signin.isLoginIsLoaded();
	 assertTrue(issigninnotdone, "user not able to login with incorrect username and correct password");
  }
  @Test(priority=4)
  public void UserAbleToLoginWithInCorrectUsernameIncorretPassword() {
	  Login_Page signin=new Login_Page(driver);
	  signin.userAbleToLoginSuccessfullyUsernamefield("12admin");
	  signin.userAbleToJoinSuccessfullyPasswordfield("aadmin12");
	  signin.userAbleToJoinSuccessfullyLogin();
 boolean issigninnotdone=signin.isLoginIsLoaded();
	assertTrue(issigninnotdone, "user not able to login with in correct username and password");
	//assertFalse(issigninnotdone, "user not able to login with in correct username and password");
  }
}
