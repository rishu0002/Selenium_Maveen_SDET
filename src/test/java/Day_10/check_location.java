package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class check_location {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().fullscreen();
		WebElement location = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
		System.out.println("The location of logo before max "+location.getLocation());
		driver.manage().window().maximize();
		System.out.println("The location of logo After max "+location.getLocation());
		driver.manage().window().minimize();
		System.out.println("The location of logo After min "+location.getLocation());
		driver.manage().window().fullscreen();
		System.out.println("The location of logo After fullscreen "+location.getLocation());
		
		Point p = new Point(84,35);
		driver.manage().window().setPosition(p);
		System.out.println("The location of logo after set position "+location.getLocation());
	}

}
