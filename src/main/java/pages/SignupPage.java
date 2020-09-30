package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	@FindBy(xpath="//a[.='Sign Up']")
	private WebElement signup;
	
	@FindBy(name="first_name")
	private WebElement firstnametb;
	
	@FindBy(name="last_name")
	private WebElement lastnametb;
	
	@FindBy(name="email")
	private WebElement emailaddresstb;
	
	@FindBy(name="phone")
	private WebElement phonenumbertb;
	
	@FindBy(id="password")
	private WebElement passwordtb;
	
	@FindBy(name="password_confirmation")
	private WebElement passwordConfirmationtb;
	
	@FindBy(name="captcha_type")
	private WebElement tryNumberCaptchaButton;
	
	@FindBy(name="recaptcha_response")
	private WebElement cpatchtb;
	
	@FindBy(xpath="//button[.='Sign Up ']")
	private WebElement signUpbtn;

	
	public SignupPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void signupElements(String firstname,String lastname,String email,String phone,String password,String confirmpassword)
	{
		signup.click();
		firstnametb.sendKeys(firstname);
		lastnametb.sendKeys(lastname);
		emailaddresstb.sendKeys(email);
		phonenumbertb.sendKeys(phone);
		passwordtb.sendKeys(password);
		passwordConfirmationtb.sendKeys(confirmpassword);
		tryNumberCaptchaButton.click();
		cpatchtb.click();
		signUpbtn.click();
		
		
	}
	

}
