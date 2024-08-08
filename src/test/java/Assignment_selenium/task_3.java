package Assignment_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class task_3 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		WebElement drpdwn=	driver.findElement(By.xpath("//*[@id=\"country-list\"]"));
		drpdwn.click();	
		Select dropdown = new Select(drpdwn);
		dropdown.selectByVisibleText("India");
		
		WebElement selectedOption = dropdown.getFirstSelectedOption();
        System.out.println("Selected country: " + selectedOption.getText());
	}

}
