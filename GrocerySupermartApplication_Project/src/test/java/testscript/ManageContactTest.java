package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;

public class ManageContactTest extends Base{
	
	@Test

	public void verifyUserisAbleToClickManageContact() throws IOException
	{
		
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1,1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		
		
		
		String phno=ExcelUtility.getIntegerData(1, 0, "ManageContact");
		String email=ExcelUtility.getStringData(1,1, "ManageContact");
		String addres=ExcelUtility.getStringData(1,2, "ManageContact");
		String time=ExcelUtility.getIntegerData(1,3, "ManageContact");
		String charge=ExcelUtility.getIntegerData(1,4, "ManageContact");
		
		
		 ManageContactPage mcp=new  ManageContactPage(driver);
		 
		 mcp.clickmoreinfo();
		mcp.clickAction();
		 mcp.updatePhone(phno);
		 mcp.updateEmail(email);
		mcp.updateAddress(addres);
		mcp.updateDeliveryTime(time);
		mcp.updateDeliveryCharge(charge);
		mcp.clickUpdate();
		boolean alertmsg= mcp.viewAlert();
		Assert.assertTrue(alertmsg);
	}
	
	

}
