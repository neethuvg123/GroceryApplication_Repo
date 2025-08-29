package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LogOutTest extends Base{
	
@Test
	
	public void verifyUserisAbleToLout() throws IOException
	{

		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1,1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		
		
		
		
		LogOutPage lo=new LogOutPage(driver);
		lo.clickAdmin();
		lo.clickLogout();
		Boolean view=lo.viewSignin();
		Assert.assertTrue(view);
		
		
	}

}
