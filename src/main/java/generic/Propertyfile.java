package generic;

import java.io.FileInputStream;
import java.util.Properties;

import org.testng.Reporter;

public class Propertyfile implements AutoConstant{
	
	public static String getdatapropertyfile(String key)
	{
		Properties p=new Properties();
		try {
		p.load(new FileInputStream(propertyfilepath));
		p.getProperty(key);
		}
		catch(Exception e)
		{
			Reporter.log("data is not freteched",true);
		}
		return key;
	
		
	}
}
