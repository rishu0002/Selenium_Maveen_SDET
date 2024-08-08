package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class paralleldemo {
	WebDriver driver ;

	
	@BeforeClass
	@Parameters("browser")

	void setup(String br ) 
	{
		switch(br) {
		case "chrome"  : driver = new ChromeDriver();
		break;
		case "firefox": driver = new FirefoxDriver();
        break;
        case "edge": driver = new EdgeDriver();
         break;
        default: System.out.println("Invalid Broswer");
        	return;
		}
	//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority = 1)
	void logo() throws InterruptedException 
	{
		Thread.sleep(3000);
		Boolean logo = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(logo) {
			Assert.assertTrue(true);
		}
		else {
			Assert.fail();
		}
	}
	
	@Test(priority = 2)
	void Login() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("(//input[@placeholder='Password'])")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String exp = "OrangeHRM";
		  String act = driver.getTitle();
		  
		  Assert.assertEquals(exp, act,"test is failed");
	}
	
	@AfterClass
	void teradown()
	{
		driver.close();
	}
}
