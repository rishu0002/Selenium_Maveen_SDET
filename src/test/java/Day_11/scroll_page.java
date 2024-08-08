package Day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_page {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");

		JavascriptExecutor js = driver;
		js.executeScript("window.scrollBy(0,300)", " ");
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		WebElement text = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/section[3]/div[4]/div/div[1]/div[2]/div/h2"));
		js.executeScript("arguments[0].scrollIntoView();", text);
		
	
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}

}
