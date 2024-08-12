package Day_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement drpdwn=	driver.findElement(By.xpath("(//select[@id='country'])"));
		drpdwn.click();	
		Select dropdown = new Select(drpdwn);
		Thread.sleep(3000);
		
		//select by Text----->
		dropdown.selectByVisibleText("Germany");
		
		//Select the element by attributes------>
		//dropdown.selectByValue("uk");
		
		//Select the element by Index---->
		//dropdown.selectByIndex(4);
		
		//Print Elements & Size of Element in dropdown---->
//		List <WebElement> drpdwn=	driver.findElements(By.xpath("(//select[@id='country'])//option"));
//		 System.out.println(drpdwn.size());
		
		 
//		Method 1 ----> For-each Loop
//		for (WebElement dpwn: drpdwn) {
//			System.out.println(dpwn.getText());
//		}
// 		Method 2 ----> For Loop
//		 for(int i =0;i<drpdwn.size();i++) {
//			 System.out.println(drpdwn.get(i).getText());
//		 }
		}

	}


