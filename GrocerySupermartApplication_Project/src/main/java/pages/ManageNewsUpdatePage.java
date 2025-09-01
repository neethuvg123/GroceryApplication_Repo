package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsUpdatePage {
	
	public WebDriver driver;
	public ManageNewsUpdatePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@class='row']//div[7]//a") WebElement moreinfo;
	
	@FindBy(xpath="//a[@onclick='click_button(1)']") WebElement newbutton;
	
	@FindBy(xpath="//button[text()='Save']") WebElement save;
	
	
	
	public void moreInfo() {
		moreinfo.click();
	}
	
	
	public void newButtonClick()
	{
		newbutton.click();
	}

	
	public boolean isSaveButtonEnabled()
	{
		return save.isEnabled();
	}
}
