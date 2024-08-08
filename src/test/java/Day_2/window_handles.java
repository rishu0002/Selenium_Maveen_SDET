package Day_2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handles {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//a[@href='http://www.orangehrm.com']")).click();
		
	Set <String> idd=	driver.getWindowHandles();
	System.out.println(idd);
	
	ArrayList<String> all= new ArrayList(idd);
	
	String parentwindowid = all.get(0);
	
	String childWindowid = all.get(1);
	driver.switchTo().window(childWindowid);
	
	//driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[2]")).click();
			System.out.println(driver.getTitle());
			if (driver.getTitle().equals("Human Resources Management Software | OrangeHRM")) {
				driver.close();
			}
	}

}
