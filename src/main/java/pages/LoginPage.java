package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage {
	@FindBy(xpath="//a[.='Sign In']")
	private WebElement signIn;
	
	@FindBy(id="email")
	private WebElement emailAddresstb;
	
	@FindBy(name="password")
	private WebElement passwordTb;
	
	@FindBy(name="captcha_type")
	private WebElement trynumbercaptch;
	
	@FindBy(xpath="//button[.=' Submit ']")
	private WebElement sumbitbtn;
	
	
	
	
	


}