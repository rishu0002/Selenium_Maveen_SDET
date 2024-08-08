package Day_10;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_drag_and_dropdown {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         ChromeDriver driver = new ChromeDriver();
         driver.get("https://demo.guru99.com/test/drag_drop.html");
         Thread.sleep(3000);
         WebElement Bank = driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
         Thread.sleep(3000);

         WebElement Account = driver.findElement(By.xpath("//ol[@id='bank']//li[@class='placeholder']"));
         WebElement Price = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
         Thread.sleep(3000);

         WebElement Amount = driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
         WebElement Sales = driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
         Thread.sleep(3000);

         WebElement Amount1 = driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
         WebElement Price1 = driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
         Thread.sleep(3000);

         WebElement last = driver.findElement(By.xpath("//*[@id=\"amt8\"]"));



  		Actions act = new Actions(driver);
        Thread.sleep(3000);

		act.dragAndDrop(Bank, Account).perform();
        //Thread.sleep(3000);

		act.dragAndDrop(Price, Amount).perform();
		act.dragAndDrop(Sales, Amount1).perform();
		act.dragAndDrop(Price1, last).perform();
		 
	}

}


