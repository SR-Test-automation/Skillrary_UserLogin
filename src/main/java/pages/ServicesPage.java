package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {
	@FindBy(xpath="//a[.=' SERVICES ']")
	private WebElement services;
	
	@FindBy(xpath="//a[.=' SkillRary Live']")
	private WebElement skillraryLive;
	
	@FindBy(xpath="//a[.=' SkillRary Assessments']")
	private WebElement skillraryAssessments;
	
	@FindBy(xpath="//a[.=' SkillRary Business']")
	private WebElement skillraryBussiness;
	
	@FindBy(xpath="//a[.=' SkillRary Universities']")
	private WebElement skillraryUniversities;
	
	@FindBy(xpath="//a[.=' SkillRary CodeTest']")
	private WebElement skillraryCodetest;
	
	public ServicesPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void serviceOptions()
	{
		services.click();
		skillraryLive.click();
		skillraryAssessments.click();
		skillraryBussiness.click();
		skillraryUniversities.click();
		skillraryCodetest.click();
		
	}

}
