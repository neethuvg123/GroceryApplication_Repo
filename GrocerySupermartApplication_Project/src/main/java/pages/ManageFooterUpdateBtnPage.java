package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterUpdateBtnPage {

	
	public WebDriver driver;
	public ManageFooterUpdateBtnPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']") WebElement moreinfo;
	
@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1' and @role='button']//child::i")WebElement button;

@FindBy(xpath="//button[@type='submit' and @name='Update']") WebElement updatebutton;


public void clickMoreInfo()
{
	moreinfo.click();
}

public void clickButton()
{
	button.click();

}

public boolean clickUpdateButton()
{
	return updatebutton.isEnabled();
}
}
