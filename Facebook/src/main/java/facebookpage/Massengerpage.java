package facebookpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Massengerpage {

	// variable webelement
	
	@FindBy(xpath="//a[text()='Features']")
	private WebElement Features;
	
	@FindBy(xpath="//a[text()='Desktop app']")
	private WebElement Desktopapp;
	
	@FindBy(xpath="//a[text()='Privacy and safety']")
	private WebElement privacyandsafety;
	
	// constructor

	public Massengerpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// action
	
	public void clickOnFeatures()
	{
		Features.click();
	}
	
	public void clickOnDesktApp()
	{
		Desktopapp.click();
	}
	
	public void clickOnprivacyandsafety()
	{
		privacyandsafety.click();
	}
}
