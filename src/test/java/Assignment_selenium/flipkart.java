package Assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		 String pageTitle = driver.getTitle();

	        // Print the title of the page
	        System.out.println("Page Title: " + pageTitle);

	        driver.quit();
	}

}
