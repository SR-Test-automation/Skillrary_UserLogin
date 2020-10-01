package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.internal.TestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.mongodb.diagnostics.logging.Logger;

public class BaseTest implements AutoConstant {
	public WebDriver driver;
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports report;
	//public ExtentTest extenttest;
	public ExtentTest logger;
	//public ConfigDataProvider config;
	
	
	@BeforeSuite
	public void beforeclass()
	{
		htmlreporter=new ExtentHtmlReporter("./report/extent.html");
		htmlreporter.config().setEncoding("utf-8");
		htmlreporter.config().setDocumentTitle("Automation report");
		htmlreporter.config().setReportName("Automation test results");
		htmlreporter.config().setTheme(Theme.STANDARD);
		
		report=new ExtentReports();
		report.setSystemInfo("organization","SKillRary");
		report.setSystemInfo("BrowserName","chrome");
		report.attachReporter(htmlreporter);
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
	public void closeapp(ITestResult result)
	{
		int status = result.getStatus();
		String tcname = result.getName();
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("test case is passed");
	//	Photo.getphoto(driver,photopath, tcname);
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.fail("test case is failed");
		}
		
	}
	
	@AfterSuite
	public void afterclass()
	{
		driver.close();
		report.flush();
	}

}
