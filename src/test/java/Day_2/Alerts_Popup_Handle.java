package Day_2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Popup_Handle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alerts =driver.switchTo().alert();
		
		//Thread.sleep(3000);
		alerts.sendKeys("Hello");
		System.out.println(alerts.getText());
		alerts.accept();
	System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		
	}

}
