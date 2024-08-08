package Assignment_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart_test {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

       
        driver.manage().window().maximize();

        //Get the title of the page
        String actualTitle = driver.getTitle();
        String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        
        // Validate the title of the page
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Validation Passed!");
        } else {
            System.out.println("Title Validation Failed!");
            System.out.println("Actual Title: " + actualTitle);
        }

        // Get the URL of the current page
        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://www.flipkart.com/";
       
        // Validate the URL of the current page
        if (actualURL.equals(expectedURL)) {
            System.out.println("URL Validation Passed!");
        } else {
            System.out.println("URL Validation Failed!");
            System.out.println("Actual URL: " + actualURL);
        }

        // Get the page source of the web page
        String pageSource = driver.getPageSource();
       
        // Validate that the page title is present in the page source
        if (pageSource.contains(expectedTitle)) {
            System.out.println("Page Source Validation Passed!");
        } else {
            System.out.println("Page Source Validation Failed!");
        }

        driver.quit();
    }
}