package Day_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		 
		 Thread.sleep(3000);
		 driver.findElement(By.id("name")).sendKeys("Rishabh");
		
		 //Approach 1 ----> using Id or name 
		 driver.switchTo().frame("frm1");	
		 
		 
		 // Approach 2 ----->
//		 driver.switchTo().frame("frm1");
//		 WebElement frame1=driver.findElement(By.xpath("//*[@id=\"frm1\"]"));
		 WebElement drpdwn= driver.findElement(By.xpath("(//*[@id='selectnav1'])"));
		
		 Select dropdown = new Select(drpdwn);
			Thread.sleep(3000);
			
			dropdown.selectByVisibleText("- Java");
		
	

	}

}
