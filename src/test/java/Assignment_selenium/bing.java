package Assignment_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class bing {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com");

		// Locate the dropdown element (might need adjustments based on HTML structure)
		WebElement dropdown = driver.findElement(By.id("market"));

		// Check if the element is a select element (traditional dropdown)
		if (dropdown.getTagName().equalsIgnoreCase("select")) {
		    Select select = new Select(dropdown);
		    List<WebElement> options = select.getOptions();

		    int numberOfOptions = options.size();
		    System.out.println("Number of options: " + numberOfOptions);

		    for (WebElement option : options) {
		        String optionText = option.getText();
		        System.out.println("Option text: " + optionText);
		    }
		} else {
		    // Handle cases where the dropdown is not a traditional select element
		    System.out.println("Dropdown might be dynamic and require different handling");
		}

		driver.quit();

	}

}
