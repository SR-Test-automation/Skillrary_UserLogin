package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	public WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement productrangedd;

	public WebElement getProductrangedd() {
		return productrangedd;
	}

	@FindBy(xpath="(//a[@title='Faded Short Sleeve T-shirts'])[2]")
	private WebElement dress;
	
	
	@FindBy(id="layered_id_attribute_group_3")
	private WebElement sizecb;
	
	@FindBy(id="layered_id_attribute_group_24")
	private WebElement colorcb;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement deliverybtn;
	
	public ProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	public AddtocartPage selectingdress()
	{
		dress.click();
		return new AddtocartPage(driver);
	}
	
	public void delivery()
	{
		sizecb.click();
		colorcb.click();
		deliverybtn.click();
	}
	
	
	
	
	
	
	
	

}
