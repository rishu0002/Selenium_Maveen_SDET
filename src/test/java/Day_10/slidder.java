package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slidder {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		WebElement slidder = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		System.out.println("Location of Slidder Before sliding "+slidder.getLocation());
		Actions act = new Actions(driver);
		act.dragAndDropBy(slidder, 100, 0).perform();
		System.out.println("Location of Slidder after sliding "+slidder.getLocation());
		
		System.out.println();
		
		WebElement slidder1 = driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		System.out.println("Location of Slidder1 Before sliding "+slidder1.getLocation());
		act.dragAndDropBy(slidder1, -200, 0).perform();
		System.out.println("Location of Slidder1 after sliding "+slidder1.getLocation());
	}

}
