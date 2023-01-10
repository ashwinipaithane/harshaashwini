package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;

		public void initializationSourabh()
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Pushpa:_The_Rise");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		}

}
