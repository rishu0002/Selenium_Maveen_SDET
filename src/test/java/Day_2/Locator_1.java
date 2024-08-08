package Day_2;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_1 {
	//There requirement:
	//How many total number no of slider on the page.
	//find the total no of images available on the screen.
	//find the total no of links available on the page.

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.automationpractice.pl/index.php?");
		
		List <WebElement> slider =driver.findElements(By.className("homeslider-container"));
		
		System.out.println("The total no of slider are "+slider.size());
		
		List <WebElement> image = driver.findElements(By.tagName("img"));
		
		System.out.println("The total no of images are "+image.size());
		
		List <WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println("The total no of links are "+link.size());

		driver.close();
	}

}
