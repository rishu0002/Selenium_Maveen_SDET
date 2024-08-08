package Day_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_Dropdown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		//driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		List <WebElement> drpdwn=	driver.findElements(By.xpath("//ul[@class='multiselect-container dropdown-menu']//li"));
		 System.out.println(drpdwn.size());
		 
		 for(WebElement dpwn : drpdwn){
			 System.out.println(dpwn.getText());
			
			 String options = dpwn.getText();
			 if(options.equals("Java")|| options.equals("Python")) {
				 dpwn.click();
			 }
		 }
		
		 

	}

}
