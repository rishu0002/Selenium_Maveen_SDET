package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class double_click {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		WebElement frame = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"field1\"]")).sendKeys("Welcome");

		WebElement copytext =	driver.findElement(By.xpath("/html/body/button"));
		Actions act = new Actions(driver);
		act.doubleClick(copytext).perform();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field2\"]")).getAttribute("value"));

	}

}
