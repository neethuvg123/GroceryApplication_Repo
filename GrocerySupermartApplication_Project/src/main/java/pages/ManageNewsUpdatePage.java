package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;


public class ManageNewsUpdatePage {
	
	public WebDriver driver;
	public ManageNewsUpdatePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath="//div[@class='row']//div[7]//a") WebElement moreinfo;
	
	@FindBy(xpath="//a[@onclick='click_button(2)']") WebElement searcbutton;
	
	@FindBy(xpath="//input[@class='form-control']") WebElement textbox;
	
	@FindBy(xpath="//button[@name='Search']") WebElement searcbutton2;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/news/edit?edit=7758&page_ad=1' and @class='btn btn-sm btn btn-primary btncss']") WebElement actionbutton;
	
	@FindBy(xpath="//textarea[@id='news']")WebElement textareanews;
	
	@FindBy(xpath="//button[text()='Update']")WebElement updatebutton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']") WebElement alerts;
	
	
	public void moreInfo() {
		moreinfo.click();
	}
	
	
	public void searcButtonClick()
	{
		searcbutton.click();
	}

	
	public void enterSearcMsg(String msgs)
	{
	textbox.sendKeys(msgs);
	}
	
	public void searcButtonClicks()
	{
		searcbutton2.click();
	}
	
	
	
	public void actionButonClick()
	{
		
		//actionbutton.click();
		PageUtility page=new PageUtility();
		page.click(driver, actionbutton);
	}
	
	public void enterTextMsg(String msgs)
	{
		textareanews.clear();
	textareanews.sendKeys(msgs);
	}
	
	public void clickUpdateButon()
	{
		updatebutton.click();
	}
	
	
	public boolean alertMsgDisplay()
	{
		return alerts.isDisplayed();
	}
}
