package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageContactUpdateBtnPage {
		
		public WebDriver driver;
		public ManageContactUpdateBtnPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
			
		}
		
		 @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']") WebElement moreinfo;
		  
		  @FindBy(xpath="//i[@class='fas fa-edit']") WebElement actionbutton;

		  @FindBy(xpath="//button[@type='submit']") WebElement buton;
	
		  
		  
		  
		  public void clickmoreinfo()
			{
				moreinfo.click();
			}
			
			public void clickAction()
			{
				actionbutton.click();
			}
			
			public boolean updateBtnEnabled()
			{
				return buton.isDisplayed();
			}

}

