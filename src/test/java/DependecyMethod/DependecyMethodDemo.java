package DependecyMethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependecyMethodDemo {
	
	@Test
	void openurl() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority = 1, dependsOnMethods =("openurl"))
	void Login() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2, dependsOnMethods =("Login"))
	void search()
	{
		Assert.assertTrue(true);
	}

	@Test(priority = 3, dependsOnMethods =("openurl"))
	void AdvancedSearch() {
		Assert.assertTrue(true);
	}

	@Test
	void LogOut()
	{
		Assert.assertTrue(true);
	}
}
