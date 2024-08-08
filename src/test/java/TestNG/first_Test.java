package TestNG;

import org.testng.annotations.Test;

public class first_Test {
  @Test(priority=1)
  void OpenURL() 
  {
	System.out.println("This is a Open url");  
  }
  
  @Test(priority=2)
  void Login()
  {
	  System.out.println("This is a Login");   
  }
 
  @Test(priority=3)
  void Logout()
  {
	  System.out.println("This is a Logout");   
  }
}
