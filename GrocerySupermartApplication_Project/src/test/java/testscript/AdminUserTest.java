package testscript;

import java.io.IOException;

import org.testng.Assert;

import pages.AdminUserPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class AdminUserTest extends  Base{
	
	public void verifyUserIsAbletoClickAdminUser() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1,1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		
		
		AdminUserPage aup= new AdminUserPage(driver);
		aup.clickMoreInfo();
		aup.clickNewButton();
		
		String usernames=ExcelUtility.getStringData(2, 0, "AdminUser");
		String passwords=ExcelUtility.getIntegerData(2,1, "AdminUser");
		
	aup.updateUserame(usernames);
		aup.updatePassword(passwords);
		aup.enterOption();
		aup.clickSave();
		boolean msg=aup.viewAlertmsg();
		Assert.assertTrue(msg);
	}

}
