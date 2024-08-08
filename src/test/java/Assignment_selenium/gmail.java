package Assignment_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class gmail {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.get("https://accounts.google.com/");
		
		//Explicit
		//wait<WebDriver> wait = new WebDriver(driver, Duration.ofSeconds(2));
		
		
		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"identifierId\"]")));
		
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("rishabhpatel0002@gmail.com");
		
		mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")));
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		Thread.sleep(5000);
//		mywait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//		
//		driver.findElement(By.name("password")).sendKeys("admin123");

	}

}
