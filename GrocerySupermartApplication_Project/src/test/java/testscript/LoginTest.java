package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base{
	@Test()
	public void verifyUserIsAbleToLoginUsingValidCredentials() throws IOException
	{
		//String username="admin";
		//String password="admin";
		
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1,1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		
		boolean homepage=loginpage.isdashboardView();
		 
	     Assert.assertTrue(homepage);
	}
	
	@Test
	public void verifyUserIsAbleToLoginUsingInvalidCredentials() throws IOException
	{
		//String username="abcde";
		//String password="qwerty";
		String username=ExcelUtility.getStringData(4, 0, "LoginPage");
		String password=ExcelUtility.getStringData(4, 1, "LoginPage");
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickSignin();
		
		boolean alertmsg=lp.alertmessage();
		Assert.assertTrue(alertmsg);
	}
	@Test

	public void verifyUserisAbleToLoginWithInvalidUsername() throws IOException
	{
		
		//String username="abcde";
		//String password="admin";
		
		String username=ExcelUtility.getStringData(2, 0, "LoginPage");
		String password=ExcelUtility.getStringData(2, 1, "LoginPage");
		
		
		LoginPage lp=new LoginPage(driver);
		
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickSignin();
		
		boolean alertmsg=lp.alertmessage();
		Assert.assertTrue(alertmsg);
		
	}
	
	@Test
	
	public void verifyUserIsAbletoLoginUsingInvalidPassword() throws IOException
	{
		//String username="admin";
		//String password="123456";
		
		String username=ExcelUtility.getStringData(3, 0, "LoginPage");
		String password=ExcelUtility.getIntegerData(3, 1, "Loginpage");
		
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(username);
		lp.enterPassword(password);
		lp.clickSignin();
		
		boolean alertmsg=lp.alertmessage();
		Assert.assertTrue(alertmsg);
		
	}
	
	
	
	
	

}
