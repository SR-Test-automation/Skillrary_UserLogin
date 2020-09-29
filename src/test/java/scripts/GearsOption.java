package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.GearsPage;

public class GearsOption extends BaseTest{
	@Test
	public void gearsOption()
	{
		GearsPage g=new GearsPage(driver);
		g.gearsOptions();
		String handle = driver.getWindowHandle();
	}

}
