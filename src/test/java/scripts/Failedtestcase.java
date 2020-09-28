package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excelfile;
import pages.HomePage;
import pages.LoginPage;

public class Failedtestcase extends BaseTest{
	@Test
	public void failtc()
	{
		LoginPage l=new LoginPage(driver);
		HomePage h = l.logincreditails(Excelfile.getexceldata("Sheet1",1,0),Excelfile.getexceldata("Sheet1",1,1));
		
	}

}
