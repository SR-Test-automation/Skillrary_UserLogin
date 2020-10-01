package scripts;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import generic.BaseTest;
import generic.Propertyfile;
import pages.SignupPage;

public class Signup extends BaseTest {
	@Test
	public void signup()
	{
		logger= report.createTest("Signup");
		logger.log(Status.PASS,"Test method is successful");
		logger.info("open the browser");
		logger.info("Enter the URL of SkillRary.com");
		logger.info("Click on Signup button");
		SignupPage s=new SignupPage(driver);
		s.signupElements(Propertyfile.getdatapropertyfile("Firstname"), Propertyfile.getdatapropertyfile("Lastname"),Propertyfile.getdatapropertyfile("Email"), Propertyfile.getdatapropertyfile("Phonenumber"), Propertyfile.getdatapropertyfile("Password"), Propertyfile.getdatapropertyfile("ConfirmPassword"));
		logger.info("First name is entered");
		logger.info("Last name is entered");
		logger.info("Email name is entered");
		logger.info("Phone Number name is entered");
		logger.info("Password name is entered");
		logger.info("Confimed Password name is entered");
		logger.info("Captch was entered");
		logger.info("Account was creted successfully");
	}

}
