package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenHRMDemo {
	ChromeDriver driver;
	@Test(priority=1)
	void tearup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(priority=2)
	void logo() throws InterruptedException
	{
		Thread.sleep(3000);
	Boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(logo) {
			System.out.println("The logo is Displayed");
		}
		else {
			System.out.println("The logo is not displayed");
		}
	}
	
	@Test(priority=3)
	void Login() throws InterruptedException 
	{
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  Thread.sleep(3000);
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  Thread.sleep(3000);
		  driver.findElement(By.className("oxd-button")).click();
		  Thread.sleep(3000);
	}
	
	@Test(priority=4)
	void teardown() throws InterruptedException
	{
		
	}
}
