package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest2 implements AutoConstant {
	public WebDriver driver;
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest extenttest;
	public WebDriver driver
	@BeforeClass
	public void beforeclass()
	{
		ExtentHtmlReporter
	}
	@BeforeMethod
	public void openapp()
	{
	System.setProperty(key1, value);
	driver=new ChromeDriver();
	driver.get(Propertyfile.getdatapropertyfile("Url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeapp(ITestResult r)
	{
		int status = r.getStatus();
		String tcname = r.getName();
		if(status==2)
		{
		Photo.getphoto(driver,photopath, tcname);
		}
		driver.close();
	}

}
