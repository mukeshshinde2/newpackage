package Testpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Setup.Base;
import facebookpage.Featurespage;
import facebookpage.Loginpage;
import facebookpage.Massengerpage;

public class VerifyToDesktop extends Base{
	
	WebDriver driver;
	Loginpage loginpage;
	Massengerpage massengerpage;
	Featurespage features;
	SoftAssert soft;
	
	@Parameters ("browser")
	@BeforeTest
	public void Browserlunch(String browserName)
	{
		if(browserName.equals("Chrome"))
		{
			driver = openChromeBrowser();
		}
	
//	    if(browserName.equals("Firefox"))
//	    {
//	    	driver = openFriefoxBrowser();
//	    }
	    
	    if(browserName.equals("Msedge"))
	    {
	    	driver = openmsedgeBrowser();
	    }
	
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	   
	}
	
	@BeforeClass
	public void POMObject ()
	{
		 loginpage = new Loginpage(driver);
		 massengerpage = new Massengerpage(driver);
		 features = new Featurespage(driver);
		 

	}
	
	@BeforeMethod
	public void OpenToFeatures () throws InterruptedException
	{
        driver.get("https://www.facebook.com/");
		loginpage.massengerlink();
		massengerpage.clickOnFeatures();
		soft = new SoftAssert();
	}
	
	@Test
	public void verifyTofeatures() throws InterruptedException
	{
        features.returntomassenger();
		
		// Actual result
		
	    String url = driver.getCurrentUrl();
		String title = driver.getTitle();
				
//		soft.assertEquals(url, "https://www.messenger.com/");
//		soft.assertEquals(title, "Messenger");
//		soft.assertAll();
	}
	
	@Test
	public void VerifyToDesktopTab()
	{
        features.clickdesktop();
		
		// Actual result
		
	    String url = driver.getCurrentUrl();
		String title = driver.getTitle();
				
		soft.assertEquals(url, "https://www.messenger.com/desktop");
		soft.assertEquals(title, "Messenger");
	//	soft.assertAll();
	}
	
	@AfterMethod
	public void LogOutApplication()
	{
		System.out.println("logout");
	}
	
	@AfterClass
	public void ClearObject ()
	{
		System.out.println("afterclass");
		loginpage = null;
		massengerpage = null;
		features = null;
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver = null;
		System.gc();
	}

	
}
