package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constant;
import pages.Home_Page;
import pages.Login_Page;
import pages.Manage_News;
import utilities.Excel_Utility;

public class Managenews_Test extends Baseproject {
	public Home_Page homepage;
	public Manage_News news;

	@Test
	public void userAbleToAddNewNews() throws IOException {
		String username = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password = Excel_Utility.readStringData(1, 1, "Login_Page");
		String newss = Excel_Utility.readStringData(1, 0, "Manage_news");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);
		homepage = signin.userAbleToJoinSuccessfullyLogin();
		news = homepage.userAbleToGetNewsPage();
		news.userAbleToAddNewNews();
		news.userAbleToEnterTheNews(newss);
		news.userAbleToSaveNews();
		boolean newsalert = news.isAlertMessageDisplayed();
		assertTrue(newsalert, Constant.ERRORMESSAGEFORADDNEWS);
	}
}
