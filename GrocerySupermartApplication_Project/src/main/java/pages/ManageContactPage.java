package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	
	public WebDriver driver;
	public ManageContactPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
  @FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']") WebElement moreinfo;
  
  @FindBy(xpath="//i[@class='fas fa-edit']") WebElement actionbutton;
	
	@FindBy(xpath="//input[@type='text' and @id='phone']") WebElement phone;
	
	@FindBy(xpath="//input[@type='text' and @id='email']") WebElement email;
	
	@FindBy(xpath="//textarea[@name='address' and @id='content']") WebElement address;
	
	@FindBy(xpath="//textarea[@name='del_time' and @id='content']") WebElement delivtime;
	
	@FindBy(xpath="//input[@type='text' and @name='del_limit']") WebElement delivcharge;
	
	@FindBy(xpath="//button[@type='submit']") WebElement buton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alerts;
	
	public void clickmoreinfo()
	{
		moreinfo.click();
	}
	
	public void clickAction()
	{
		actionbutton.click();
	}
	
	
	public void updatePhone(String phonno)
	
	{
		phone.clear();
		
	
		phone.sendKeys(phonno);
	}
	
	public void updateEmail(String emailid)
	{
		email.clear();
		email.sendKeys(emailid);
	}
	
	public void updateAddress(String add)
	{
		address.clear();
		address.sendKeys(add);
	}
	public void updateDeliveryTime(String time)
	{
		delivtime.clear();
	delivtime.sendKeys(time);
	}

	public void updateDeliveryCharge(String charges)
	{
	delivcharge.clear();
	delivcharge.sendKeys(charges);
}
	
	public void clickUpdate()
	{
		PageUtility page=new PageUtility();
		page.click(driver, buton);
	}
	
	public boolean viewAlert()
	{
		return alerts.isDisplayed();
	}

}
