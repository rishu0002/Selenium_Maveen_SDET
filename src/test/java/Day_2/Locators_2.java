package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_2{

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?");
		driver.findElement(By.id("search_query_top")).sendKeys("top");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
	
		//driver.close();
	}

}
