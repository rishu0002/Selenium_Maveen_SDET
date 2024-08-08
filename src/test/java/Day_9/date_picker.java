package Day_9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class date_picker {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			driver.get("https://jqueryui.com/datepicker/");
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("25/07/2024");
			//driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
			String year = "2026";
			String month = "December";
			String date = "12";
			
			while (true) {
			String yr =	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[2]")).getText();
			String mon =driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/span[1]")).getText();
				
				if (year.equals(yr) && month.equals(mon)){
					break;
				}
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
			
			List <WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]//table//td"));
			
			for (WebElement dates : alldates) {
				if (dates.getText().equals(date)) {
					dates.click();
					break;
				}
			}

	}

}
