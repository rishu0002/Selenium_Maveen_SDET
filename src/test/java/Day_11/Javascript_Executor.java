package Day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		JavascriptExecutor js = driver;
		
		WebElement inputbox = driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','Rishabh')", inputbox);
		
		WebElement radio = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click();", radio);
	}

}
