package Testpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import facebookpage.Featurespage;
import facebookpage.Loginpage;
import facebookpage.Massengerpage;


public class testclass2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Library Tools\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Loginpage loginpage = new Loginpage(driver);
		loginpage.massengerlink();
		
		Massengerpage massengerpage = new Massengerpage(driver);
		massengerpage.clickOnFeatures();
		
		Featurespage features = new Featurespage(driver);
		features.returntomassenger();
		
		// Actual result
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/")&& title.equals("Messenger"))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
	}
}
