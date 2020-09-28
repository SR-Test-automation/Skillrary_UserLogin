package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(id="search_query_top")
	private WebElement serachtb;
	
	@FindBy(name="submit_search")
	private WebElement go;
	
	@FindBy(xpath="//span[.='My wishlists']")
	private WebElement whishlist;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dressestab;
	
	@FindBy(xpath="(//a[@title='Evening Dresses'])[2]")
	private WebElement eveeningdress;
	
	

	public WebElement getDressestab() {
		return dressestab;
	}

	public  HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public Whishlistpage whishlistbtn()
	{
		whishlist.click();
		return new Whishlistpage(driver);
	}
	
	public ProductPage serachforthelement(String productname)
	{
		 serachtb.sendKeys(productname);
		 go.click();
		 return new ProductPage(driver);
	}
	
	public ProductPage eveingdresstab()
	{
		eveeningdress.click();
		return new ProductPage(driver);
	}

}
