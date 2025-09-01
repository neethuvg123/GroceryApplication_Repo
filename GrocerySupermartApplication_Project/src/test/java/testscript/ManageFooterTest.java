package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterPage;
import utilities.ExcelUtility;

public class ManageFooterTest extends Base{
	

	@Test
	
	public void verifyUserIsAbletoClickManageFooter() throws IOException
	{
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1,1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		
		ManageFooterPage mfp=new ManageFooterPage(driver);
		mfp.clickMoreInfo();
		mfp.clickButton();
		
		String address=ExcelUtility.getStringData(2, 0, "ManageFooterPage");
		String email=ExcelUtility.getStringData(2,1, "ManageFooterPage");
		String phone=ExcelUtility.getIntegerData(2,2, "ManageFooterPage");
		
		
		mfp.updateAddress(address);
		mfp.updateEmail(email);
		mfp.updatePhone(phone);
		
		mfp.clickUpdateButton();
		
		boolean msg=mfp.alertViewAlertMessage();
		Assert.assertTrue(msg);
	}
	

	
	
}
