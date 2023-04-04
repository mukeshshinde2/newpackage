package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
		
	public static WebDriver openChromeBrowser()
	{
	   System.setProperty("webdriver.chrome.driver","D:\\Selenium Library Tools\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   return driver;
    }
	
//	public static WebDriver openFriefoxBrowser()
//	{
//	   System.setProperty("webdriver.gecko.driver","D:\\Selenium Library Tools\\geckodriver-v0.32.2-win-aarch64\\geckodriver.exe");
//	   WebDriver driver = new FirefoxDriver();
//	   return driver;
//    }
		
	public static WebDriver openmsedgeBrowser()
	{
	   System.setProperty("webdriver.edge.driver","D:\\Selenium Library Tools\\edgedriver_win64\\msedgedriver.exe");
	   WebDriver driver = new EdgeDriver();
	   return driver;
    }
		
}

