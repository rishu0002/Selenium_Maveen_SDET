package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class parameterization_demo {
	ChromeDriver driver;
  @BeforeClass
  void setup() 
  {
	  driver = new ChromeDriver();
	  driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
  }
   
  
  @Test(priority = 2)
  void url()
  {
	 String exurl = driver.getCurrentUrl(); 
	 Assert.assertEquals(exurl, "https://demo.nopcommerce.com/login?returnUrl=%2F","both must be match");
  }
  
  @Test(priority = 3,dataProvider = "dp")
  void login(String email,String passwd) 
  {
	  //driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	  driver.findElement(By.id("Email")).sendKeys(email);
	  driver.findElement(By.id("Password")).sendKeys(passwd);
	  driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
	  
	  String exp = "nopCommerce demo store";
	  String act = driver.getTitle();
	  
	  Assert.assertEquals(exp, act,"test is failed");
  }
  
  @AfterClass
  void teardown() 
  {
	  driver.close();
  }
  
  @DataProvider(name = "dp")
  String[][] LoginData() {
	  String data [][] = {{"rishupatel002@gmail.com","123456"},
			  				{"raman123@gmail.com","1234"},
			  				{"nitika1995@gmail.com","abcds"},
			  				{"priya1997@gmail.com","abcds"}};
	  
	  return data;
	  
  }
}
