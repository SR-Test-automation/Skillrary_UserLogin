package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninPage {
	@FindBy(xpath="//a[.='Sign In']")
	private WebElement signinBtn;
	
	@FindBy(id="email")
	private WebElement emailAddress;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="captcha_type")
	private WebElement captch;
	
	@FindBy(xpath="//button[.=' Submit ']")
	private WebElement sumbitbtn;
	
	@FindBy(id="mycourseFilter")
	private WebElement mycoursefilter;
	
	@FindBy(xpath="//a[.=' Learning']")
	private WebElement learningTab;
	
	@FindBy(xpath="//a[.='Wishlist']")
	private WebElement wishlistTab;
	
	@FindBy(xpath="//a[.=' Assigned Course ']")
	private WebElement assignedCourseTab;
	
	@FindBy(xpath="(//a[.='Assessment'])[2]")
	private WebElement assessmentTab;
	
	@FindBy(xpath="//a[.='View Graph']")
	
	
	
	
	
	
	
	
	
	
	

}
