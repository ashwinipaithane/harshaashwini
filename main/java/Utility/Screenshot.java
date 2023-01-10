package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class Screenshot extends TestBase{
	
	public static void screenshot(String name) throws Exception
	{
		
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File desc=new File("C:\\Users\\ashwi\\eclipse-workspace\\Sourabh_Company_Project\\Screenshot\\photo"+name+".jpg");
		FileHandler.copy(source, desc);
	}

}
