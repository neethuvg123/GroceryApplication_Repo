package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactUpdateBtnPage;
import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.Pageutility;

public class ManageContactUpdateTest extends Base{

	@Test

	public void validateUpdateBtnInManageContact() throws IOException
	{
		
		String username=ExcelUtility.getStringData(1, 0, "LoginPage");
		String password=ExcelUtility.getStringData(1,1, "LoginPage");
		
		LoginPage loginpage=new LoginPage(driver);
		
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		

		ManageContactUpdateBtnPage mcp=new  ManageContactUpdateBtnPage(driver);
		 
		 mcp.clickmoreinfo();
		mcp.clickAction();
		
		
	PageUtility page=new PageUtility();
	page.scrollFromBottom(driver);
	
	
		boolean alertmsg=mcp.updateBtnEnabled();
		Assert.assertTrue(alertmsg);
		
	
	
}
}