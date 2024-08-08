package Day_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_checkbox {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.findElement(By.xpath("//input[@id='monday']")).click();
		
		List <WebElement> checkbox =driver.findElements(By.xpath("//*[@class='form-check-input'and @type='checkbox']"));
		
		
// Question 1. select the all check-boxes
		
		//first Method -------->
		
//		for (WebElement chk:checkbox)
//		{
//			chk.click();
//		}
	
		//Second Method -------->
		
//		for (int i = 0 ; i<checkbox.size();i++) {
//			checkbox.get(i).click();
//		}

// Question 2. Select the last three check-boxes
	
//		for (int i = 4 ; i<checkbox.size();i++) {
//			checkbox.get(i).click();
//		}
	
// Question 3. Select the first three check-box
		
//		for (int i = 0 ; i<3;i++) {
//			checkbox.get(i).click();
//		}		
		
// Question 4.Unselected the selected check-box	
		
		for (int i = 0 ; i<3;i++) {
			checkbox.get(i).click();
		}
		
		Thread.sleep(5000);

		for (int i = 0 ; i<checkbox.size();i++) {

			if(checkbox.get(i).isSelected()) {
				checkbox.get(i).click();
			}
		}
	
	
}

}
