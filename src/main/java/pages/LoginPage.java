package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement signinbtn;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailaddress;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement loginbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public HomePage logincreditails(String email,String passw)
	{
		signinbtn.click();
		emailaddress.sendKeys(email);
		password.sendKeys(passw);
		loginbtn.click();
		return new HomePage(driver);
	}
	

}
