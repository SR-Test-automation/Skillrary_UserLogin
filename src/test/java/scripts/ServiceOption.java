package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.GearsPage;

public class ServiceOption extends BaseTest {
	@Test
	public void serviceOption()
	{
		GearsPage g=new GearsPage(driver);
		g.gearsOptions();
	}
}
