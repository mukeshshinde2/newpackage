package facebookpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	// variable webelement
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement username;
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement password;
	
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement login;
	
	@FindBy(xpath="//a[text()='Messenger']")
	private WebElement massengerlink;
	
	// constructor
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// Action
	
//	public void sendusername()
//	{
//		username.sendKeys("mukesh");
//	}
//	
//	public void sendpassword()
//	{
//		password.sendKeys("12345");
//	}
//	
//	public void loginbutton()
//	{
//		login.click();
//	}
//	
//	public void massengerlink()
//	{
//		massengerlink.click();
//	}
	
	// or action of group
	
	public void loginApplication()
	{
		username.sendKeys("mukesh");
		password.sendKeys("12345");
		login.click();
		massengerlink.click();
	}
	
}
