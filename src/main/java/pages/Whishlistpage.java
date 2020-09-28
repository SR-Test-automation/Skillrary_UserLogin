package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Whishlistpage {
	public WebDriver driver;
	@FindBy(id="name")
	private WebElement nametb;
	
	@FindBy(xpath="//span[.='Save']")
	private WebElement savebtn;
	
	public  Whishlistpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public void savethename(String name)
	{
		nametb.sendKeys(name);
		savebtn.click();
	}
	
	

}
