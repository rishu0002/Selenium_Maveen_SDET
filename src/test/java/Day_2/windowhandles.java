package Day_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement( By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]/a")).click();
		
		Set <String> idd=	driver.getWindowHandles();
		System.out.println(idd);
		
		ArrayList<String> all= new ArrayList(idd);
		
		String parentwindowid = all.get(0);
		
		String childWindowid = all.get(1);
		driver.switchTo().window(childWindowid);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium - Wikipedia")) {
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium in biology']")).click();
		Set<String> Idd1 = driver.getWindowHandles();
		ArrayList<String> all1 = new ArrayList(Idd1);
		String childWindowid1 = all1.get(1);
		driver.switchTo().window(childWindowid1);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium in biology - Wikipedia")) {
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium (software)']")).click();
		Set<String> Idd2 = driver.getWindowHandles();
		ArrayList<String> all2 = new ArrayList(Idd2);
		String childWindowid2 = all2.get(1);
		driver.switchTo().window(childWindowid2);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium (software) - Wikipedia")) {
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium disulfide']")).click();
		Set<String> Idd3 = driver.getWindowHandles();
		ArrayList<String> all3 = new ArrayList(Idd3);
		String childWindowid3 = all3.get(1);
		driver.switchTo().window(childWindowid3);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium disulfide - Wikipedia")) {
			driver.close();	
		}
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[normalize-space()='Selenium dioxide']")).click();
		Set<String> Idd4 = driver.getWindowHandles();
		ArrayList<String> all4 = new ArrayList(Idd4);
		String childWindowid4 = all4.get(1);
		driver.switchTo().window(childWindowid4);
		System.out.println(driver.getTitle());
		if (driver.getTitle().equals("Selenium dioxide - Wikipedia")) {
			driver.close();	
		}
		driver.quit();
	}
}	

		
		        
	

