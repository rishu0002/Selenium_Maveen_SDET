package Page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver ;
	// constructor
	//locate element
	// Actions -- method
	LoginPage(WebDriver driver){
		
		this.driver = driver;
	}
	
	// Locate Element
	
	By user_name = By.xpath("//input[@placeholder='Username']");
	By pass =By.xpath("//input[@placeholder='Password']");
	By button =By.xpath("//button[normalize-space()='Login']");
	By logo =By.xpath("//img[@alt='company-branding']");
	
	// Actions
	
	public void setusername(String username) 
	{
		
	
		driver.findElement(user_name).sendKeys(username);
	}
	
	public void setpassword(String password)
	{
		driver.findElement(pass).sendKeys(password);
	}
	
	public void buttonclick () 
	{
		driver.findElement(button).click();;
	}
	
	public Boolean logo() {
		Boolean logodisplay = driver.findElement(logo).isDisplayed();
		return logodisplay;
	}
}
