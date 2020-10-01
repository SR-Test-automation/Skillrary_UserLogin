package scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import generic.BaseTest;
import pages.GearsPage;

public class GearsOption extends BaseTest{
	@Test
	public void gearsOption()
	{
		ExtentTest test= extent.createTest("Successful");
		test.log(Status.PASS,"Test method is successful");
		GearsPage g=new GearsPage(driver);
		g.gearsOptions();
		String handle = driver.getWindowHandle();
	}

}
