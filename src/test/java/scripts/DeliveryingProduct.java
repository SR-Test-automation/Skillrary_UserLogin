package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excelfile;
import generic.Propertyfile;
import generic.Utilies;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class DeliveryingProduct extends BaseTest{
	@Test
	public void productdelivery()
	{
		LoginPage l=new LoginPage(driver);
		HomePage h = l.logincreditails(Excelfile.getexceldata("Sheet1",1,0),Excelfile.getexceldata("Sheet1",1,1));
		
		Utilies.mousehover(driver,h.getDressestab());
		 ProductPage p = h.eveingdresstab();
		 p.delivery();
		 Assert.assertEquals(driver.getTitle(),Propertyfile.getdatapropertyfile("deliverytitle"));
	}

}
