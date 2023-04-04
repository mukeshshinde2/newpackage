package facebookpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Featurespage {

	// variable webelement
	
	@FindBy(xpath="//img[@class='_1-kh _93s6 img']")
	private WebElement returnMassenger;
	
	@FindBy(xpath="//a[text()='Desktop app']")
	private WebElement clickdesktop;
	
	// constructor
	
	public Featurespage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	// action method
	
	public void returntomassenger()
	{
		returnMassenger.click();
	}
	
	public void clickdesktop()
	{
		clickdesktop.click();
	}
	
}
