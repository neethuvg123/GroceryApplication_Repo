package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageFooterUpdateBtnPage;
import utilities.ExcelUtility;

public class ManageFooterUpdateBtnTest extends Base{
	
	@Test
	
	public void validateUpdatebtn() throws IOException
	{
		
	
	String username=ExcelUtility.getStringData(1, 0, "LoginPage");
	String password=ExcelUtility.getStringData(1,1, "LoginPage");
	
	LoginPage loginpage=new LoginPage(driver);
	
	loginpage.enterUsername(username);
	loginpage.enterPassword(password);
	loginpage.clickSignin();
	
	ManageFooterUpdateBtnPage mfp=new ManageFooterUpdateBtnPage(driver);
	mfp.clickMoreInfo();
	mfp.clickButton();
	boolean alertmsg=mfp.clickUpdateButton();
	Assert.assertTrue(alertmsg);
}
}