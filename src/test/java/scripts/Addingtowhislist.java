package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excelfile;
import generic.Propertyfile;
import pages.HomePage;
import pages.LoginPage;
import pages.Whishlistpage;

public class Addingtowhislist extends BaseTest{
   @Test
	public void nametowhishlist()
	{
		
	LoginPage l=new LoginPage(driver);
	HomePage h = l.logincreditails(Excelfile.getexceldata("Sheet1",1,0),Excelfile.getexceldata("Sheet1",1,1));
	Whishlistpage w = h.whishlistbtn();
	   w.savethename(Propertyfile.getdatapropertyfile("name"));
	   
	}
}
