package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage {
	
	@FindBy(xpath="//span[.='login with facebook']")
	private WebElement facebookbtn;
	
	

}
