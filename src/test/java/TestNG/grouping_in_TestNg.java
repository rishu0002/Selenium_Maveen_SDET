package TestNG;

import org.testng.annotations.Test;

public class grouping_in_TestNg {

	@Test(priority = 1,groups = {"sanity","regression",})
	void loginByEmail() 
	{
		System.out.println("This is login by email");
	}

	@Test(priority = 2,groups = {"sanity"})
	void loginByFacebook() 
	{
		System.out.println("This is login by facebook ");
	}

	@Test(priority = 3,groups = {"regression"})
	void loginByTwitter()
	{
		System.out.println("This is login by twitter ");
	}
	
	@Test(priority = 4,groups = {"sanity","regression","functional"})
	void signupByemail() 
	{
		System.out.println("This is Signup by Email ");
	}
	
	@Test(priority = 5,groups = {"regression"})
	void signupByfacebook() 
	{
		System.out.println("This is Signup by twitter ");
	}
	
	@Test(priority = 6,groups = {"regression"})
	void signupBytwitter() 
	{
		System.out.println("This is Signup by twitter ");
	}
	
	@Test(priority = 7,groups = {"sanity","regression","functional"})
	void logoutByemail() 
	{
		System.out.println("This is Logout by Email ");
	}
	
	@Test(priority = 8,groups = {"sanity"})
	void logoutByfacebook() 
	{
		System.out.println("This is Logout by twitter ");
	}
	
	@Test(priority = 9,groups = {"sanity"})
	void logoutBytwitter() 
	{
		System.out.println("This is Logout by twitter ");
	}
}
