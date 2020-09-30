package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Propertyfile;
import pages.SignupPage;

public class Signup extends BaseTest {
	@Test
	public void signup()
	{
		SignupPage s=new SignupPage(driver);
		s.signupElements(Propertyfile.getdatapropertyfile("Firstname"), Propertyfile.getdatapropertyfile("Lastname"),Propertyfile.getdatapropertyfile("Email"), Propertyfile.getdatapropertyfile("Phonenumber"), Propertyfile.getdatapropertyfile("Password"), Propertyfile.getdatapropertyfile("ConfirmPassword"));
	}

}
