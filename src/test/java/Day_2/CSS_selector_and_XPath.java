package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selector_and_XPath {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
//		Tag & ID -----> tag#ID
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("MacBook");

//		Tag & Attributes
		//driver.findElement(By.cssSelector("button.button-1")).click();
		
//		Tag & 
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("MacBook");
		driver.findElement(By.cssSelector("button.button-1")).click();
	
		
	}

}
