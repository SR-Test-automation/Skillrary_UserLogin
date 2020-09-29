package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GearsPage {
	@FindBy(xpath="//a[.=' GEARS ']")
	private WebElement gerasTab;
	
	@FindBy(xpath="(//a[.=' SkillRary Whiteboard'])[2]")
	private WebElement skillraryWhiteboard;
	
	@FindBy(xpath="(//a[.=' SkillRary Essay'])[2]")
	private WebElement skillraryEssay;
	
	@FindBy(xpath="(//a[.=' SkillRary Compilers'])[2]")
	private WebElement skillraryComplier;
	
	@FindBy(xpath="(//a[.=' HTML Editor'])[2]")
	private WebElement htmlEditor;
	
	@FindBy(xpath="(//a[.=' Typing Speed Test'])[2]")
	private WebElement typingSpeedTest;
	
	@FindBy(xpath="(//a[.=' SQL Editor'])[2]")
	private WebElement sqlEditor;
	
	@FindBy(xpath="(//a[.=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoAPI;
	
	@FindBy(xpath="(//a[.=' CGPA Calculator'])[2]")
	private WebElement cgpaCalculator;
	
	@FindBy(xpath="(//a[@href='https://assess.skillrary.com/api-testing'])[2]")
	private WebElement apiTesting;
	
	public GearsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void gearsOptions()
	{
		gerasTab.click();
		skillraryWhiteboard.click();
		skillraryEssay.click();
		skillraryComplier.click();
		htmlEditor.click();
		typingSpeedTest.click();
		sqlEditor.click();
		skillraryDemoAPI.click();
		apiTesting.click();
		cgpaCalculator.click();
	}
	
	
	

}
