package testscript;

import java.io.IOException;
import java.lang.invoke.ConstantBootstraps;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.PageUtility;

public class ManageCategoryTest extends Base {

	@Test(retryAnalyzer = retry.Retry.class, description = " User is able to access Manage Catergory Page")

	public void verifyuserIsAbleToclickManageCategory() throws IOException {
		String username = ExcelUtility.getStringData(1, 0, "LoginPage");
		String password = ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsername(username);
		loginpage.enterPassword(password);
		loginpage.clickSignin();
		String lists = ExcelUtility.getStringData(4, 0, "ManageCategoryPage");
		ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		managecategorypage.moreinfo();
		managecategorypage.newbutton();
		managecategorypage.category(lists);
		managecategorypage.groupselect();
		managecategorypage.choosefile();
		managecategorypage.clickTopMenu();
		managecategorypage.clickSowHome();
		managecategorypage.saveButton();
		boolean msg = managecategorypage.viewAlert();
		Assert.assertTrue(msg,Constant.ALERT_MSG_DISPLAY);

	}

}
