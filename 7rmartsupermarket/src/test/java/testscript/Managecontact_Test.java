package testscript;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.Test;

import constants.Constant;
import pages.Home_Page;
import pages.Login_Page;
import pages.Manage_Contact;
import utilities.Excel_Utility;

public class Managecontact_Test extends Baseproject {
	public Home_Page homepage;
	public Manage_Contact contact;

	@Test
	public void userAbleToUpdateContactDetails() throws IOException {
		String username = Excel_Utility.readStringData(1, 0, "Login_Page");
		String password = Excel_Utility.readStringData(1, 1, "Login_Page");
		String phonedetails = Excel_Utility.readIntegerData(1, 0, "Manage_Contact");
		String emaildetails = Excel_Utility.readStringData(1, 1, "Manage_Contact");
		String addressdetails = Excel_Utility.readStringData(1, 2, "Manage_Contact");
		String deliverydetails = Excel_Utility.readIntegerData(1, 3, "Manage_Contact");
		String chargedetails = Excel_Utility.readIntegerData(1, 4, "Manage_Contact");
		Login_Page signin = new Login_Page(driver);
		signin.userAbleToLoginSuccessfullywithlogindetails(username, password);
		homepage = signin.userAbleToJoinSuccessfullyLogin();
		contact = homepage.userAbleToManageContact();
		contact.userAbleToeditDetails();
		contact.userAbleToAddPhoneContacts(phonedetails);
		contact.userAbleToAddEmailContacts(emaildetails);
		contact.userAbleToAddAddress(addressdetails);
		contact.userAbleToAddDeliveryTime(deliverydetails);
		contact.userAbleToAddDeliveryCharge(chargedetails);
		contact.userAbleToUpdate();
		boolean contacts = contact.isUserAbleToEditDetails();
		assertTrue(contacts, Constant.ERRORMESSAGEFOREDITCONTACT);

	}
}
