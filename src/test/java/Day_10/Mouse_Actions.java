package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Actions {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://demo.nopcommerce.com/");
		
	WebElement comp = driver.findElement(By.xpath("(//a[normalize-space()='Computers'])[1]"));
	WebElement desk = driver.findElement(By.xpath("(//a[normalize-space()='Desktops'])[1]"));
		Actions act = new Actions(driver);
	
		//act.moveToElement(comp).moveToElement(desk).click().build().perform();
		act.moveToElement(comp).moveToElement(desk).click().perform();
		System.out.println(driver.getTitle());
	}

}
