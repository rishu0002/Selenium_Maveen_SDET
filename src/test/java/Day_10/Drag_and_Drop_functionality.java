package Day_10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_Drop_functionality {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement country = driver.findElement(By.xpath("//*[@id=\"box106\"]"));
		WebElement captial = driver.findElement(By.xpath("//*[@id=\"box6\"]"));
		Actions act = new Actions(driver);
		act.dragAndDrop(captial,country).perform();

	}

}
