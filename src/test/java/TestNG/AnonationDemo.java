package TestNG;

import org.testng.annotations.*;

public class AnonationDemo {
	
	@BeforeTest
	//@BeforeClass
	//@BeforeMethod
   void Login() 
  {
	  System.out.println("This is a Login Method");
  }
  @Test(priority = 1)
 void search()
 {
	 System.out.println("This is a search Method");
 }
  
  @Test(priority = 2)
 void AdvancedSearch() {
	 System.out.println("This is a AdvancedSearch");
 }
 
  @AfterTest
  //@AfterClass
 // @AfterMethod
 void LogOut()
 {
	 System.out.println("This is a Log Out Method");
 }
}
