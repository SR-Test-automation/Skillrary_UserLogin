package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excelfile;
import generic.Propertyfile;
import generic.Utilies;
import pages.AddtocartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class AddingProductCart extends BaseTest{
	@Test
	public void addingproductcart()
	{
		LoginPage l=new LoginPage(driver);
		HomePage h = l.logincreditails(Excelfile.getexceldata("Sheet1",1,0),Excelfile.getexceldata("Sheet1",1,1));
		ProductPage p = h.serachforthelement(Propertyfile.getdatapropertyfile("product"));
		Utilies.dropdown(p.getProductrangedd(),Propertyfile.getdatapropertyfile("sortby"));
		AddtocartPage c = p.selectingdress();
		c.plus();
		Utilies.dropdown(c.getSizedd(),Propertyfile.getdatapropertyfile("size"));
		c.addingtocart();
	}

}
