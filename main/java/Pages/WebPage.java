package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class WebPage extends TestBase {
		
		//object repository
		
		@FindBy(xpath="//a[text()='December 17, 2021 (United States)']")private WebElement getIMDBDate;
		@FindBy(xpath="//a[text()='India']")private WebElement getIMDBCountry;
		@FindBy(xpath="(//div[@class=\"plainlist\"])[4]")private WebElement  getDateWiki;
		@FindBy(xpath="//td[text()=\"India\"]")private WebElement getCountryWiki;
		
		// constructor
		
		public WebPage()
		{
			PageFactory.initElements(driver, this);
		}
		
		public String verifymovieDateWiki() throws Exception
		{
			String wikiDate = getDateWiki.getText();
			
			Thread.sleep(1500);
			return wikiDate;
			
		}
		public String verifymovieDateIMDI() throws Exception
		{
			driver.navigate().to("https://www.imdb.com/title/tt9389998/");
			String IMDBDate=getIMDBDate.getText();
			Thread.sleep(1500);
			return IMDBDate;
		}
		
		public String verifyMovieCountryWiki() throws Exception
		{
			String WikiCountry=getCountryWiki.getText();
			Thread.sleep(1500);
			return WikiCountry;
		}
		public String verifyMovieCountryIMDI() throws Exception
		{
			driver.navigate().to("https://www.imdb.com/title/tt9389998/");
			String IMDICountry=getIMDBCountry.getText();
			Thread.sleep(1500);
			return IMDICountry;
		}
			
			
			
			
		
		

	}


