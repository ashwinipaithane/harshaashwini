package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.WebPage;
import Utility.Screenshot;


public class WebPageTest extends TestBase{

	public WebPage IMDI;
	@BeforeMethod
	public void setup()
	{
		initializationSourabh();
		IMDI =new WebPage();
	}
	@Test(priority=2)
	public void verifymovieDateTestcase() throws Exception
	{
		String WikiTest = IMDI.verifymovieDateWiki();
		String IMDITest=IMDI.verifymovieDateIMDI();
		Assert.assertEquals(WikiTest, IMDITest);
		System.out.println(WikiTest);
		System.out.println("-----------------------");
		System.out.println(IMDITest);
	}
	
	@Test(priority=1)
	public void verifyMovieCountryTestCase() throws Exception {
		String wikiCountry = IMDI.verifyMovieCountryWiki();
		String IMDICountry = IMDI.verifyMovieCountryIMDI();
		Assert.assertEquals(wikiCountry, IMDICountry);
		System.out.println(wikiCountry);
		System.out.println("-------------------------------");
		System.out.println(IMDICountry);
		

	}
	
	@AfterMethod
	public void closeBrowser(ITestResult it) throws Exception  //ITestResult is a interface and it is a reference variable
	 {
		 if(ITestResult.FAILURE==it.getStatus())
		 {
			 Screenshot.screenshot(it.getName()); //(screenshot is a page name)
		 }
		 
		 driver.close();
	 }
	}
	


