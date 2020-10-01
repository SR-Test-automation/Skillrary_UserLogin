package scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import generic.BaseTest;
import pages.GearsPage;

public class ServiceOption extends BaseTest {
	@Test
	public void serviceOption()
	{
		logger= report.createTest("service option");
		logger.log(Status.PASS,"Test method is successful");
		GearsPage g=new GearsPage(driver);
		g.gearsOptions();
	}
}
