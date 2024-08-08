package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text_vs_attributes {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.automationpractice.pl/index.php?");

		WebElement contactUsLink = driver.findElement(By.linkText("Contact us"));

		// Using getText() to retrieve the visible text content of the element
		String visibleText = contactUsLink.getText();
		System.out.println("Visible Text: " + visibleText);
		
		
		// Using getAttribute() to retrieve the value of a specific attribute of the element
		String attributeValue = contactUsLink.getAttribute("attributeName");
		System.out.println("Attribute Value: " + attributeValue);


		driver.quit();
	}
}



