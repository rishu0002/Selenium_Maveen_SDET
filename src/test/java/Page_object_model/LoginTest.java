package Page_object_model;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	LoginPage lp ;
	
	@BeforeClass
	void setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	void login() {
		lp.setusername("Admin");
		lp.setpassword("admin123");
		lp.buttonclick();
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@Test(priority = 1)
	void checklogo()
	{
		lp = new LoginPage(driver);
		
		//System.out.println(lp.logo());
		Assert.assertEquals(lp.logo().booleanValue(),true);
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}
}
