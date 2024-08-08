package Day_10;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboard_demo2 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement newtab=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).click(newtab).keyUp(Keys.CONTROL).perform();
		Set <String> idd=	driver.getWindowHandles();
		System.out.println(idd);
		
		ArrayList<String> all= new ArrayList(idd);
		
		String parentwindowid = all.get(0);
		
		String childWindowid = all.get(1);
		
		// switch to child window
		driver.switchTo().window(childWindowid);
		System.out.println(driver.getTitle());
		//Action on child window 
		
		
		//switch to parent window
		driver.switchTo().window(parentwindowid);
		
		// Actions on parent window
		
		

	}

}
