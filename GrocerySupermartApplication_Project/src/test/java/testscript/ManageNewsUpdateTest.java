package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsUpdatePage;
import utilities.ExcelUtility;

public class ManageNewsUpdateTest extends Base {
	
	@Test
	
	public void validateSaveBtnClickManageNews() throws IOException
	{
     
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1,1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		
		
		 ManageNewsUpdatePage mnup=new  ManageNewsUpdatePage(driver);
		 mnup.moreInfo();
		 mnup.newButtonClick();
		 
		boolean allertmsg= mnup.isSaveButtonEnabled();
		Assert.assertTrue(allertmsg);

}
}