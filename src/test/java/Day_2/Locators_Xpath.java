package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Xpath {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("lenovo");
		WebElement categoryDropdown = driver.findElement(By.xpath("//*[@name='category_id']"));
		driver.findElement(By.id("button-search")).click();
		
	//	driver.close();
	}

}
