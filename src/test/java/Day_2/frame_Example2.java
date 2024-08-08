package Day_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_Example2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://ui.vision/demo/webtest/frames/");
		 
		 Thread.sleep(3000);
		 //
	 WebElement frame1=driver.findElement(By.xpath("/html/frameset/frame[1]"));	
	 
	 driver.switchTo().frame(frame1);
		 driver.findElement(By.name("mytext1")).sendKeys("11111");
		
		 driver.switchTo().defaultContent();
		 WebElement frame2=driver.findElement(By.xpath("/html/frameset/frameset/frame[2]"));
		 driver.switchTo().frame(frame2);
		 driver.findElement(By.name("mytext3")).sendKeys("123465");
		 driver.switchTo().frame(0);
		 driver.findElement(By.xpath("//*[@id=\"mG61Hd\"]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div[1]/div/span/div/div[2]/label/div/div[2]/div/span")).click();
			driver.switchTo().defaultContent();
			
			WebElement frame5 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
			driver.switchTo().frame(frame5);
			driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("55555");
			driver.close();

	}

}
