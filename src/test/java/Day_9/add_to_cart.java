package Day_9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class add_to_cart {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("lenovo");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='item-grid']//div[1]//div[1]//div[2]//div[3]//div[2]//button[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@title='Close']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[2]")).getText().contains("1"));
//		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		//driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		//driver.findElement(By.xpath("//button[@normalize-space()='Go to cart']")).click();
		
	}

}
