package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant {
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
	System.setProperty(key, value);
	driver=new ChromeDriver();
	driver.get(Propertyfile.getdatapropertyfile("url"));
	
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
