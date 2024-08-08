package Day_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axces {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&deoia=1&jlou=Afe2x6C5HaAWumepAJDIFLFqjGHRSmF_uaIlUiYug3N5P5K8w97Ci1SfXd3dqZU6f9gBkTvkpJcWCbBJYYoD-ziNdvTz3AvoGPbKym57hcgNjA&smuh=17356&lh=Ac-d75AhXLju9i_22o4");
		
		List <WebElement> ele =driver.findElements(By.xpath("//*[@id=\'email\']//following::*"));
		
		System.out.println("The total no element "+ele.size());
		
		for(WebElement i : ele)
		{
			System.out.println(i.getText());
		}
		
		List <WebElement> elem =driver.findElements(By.xpath("//*[@id=\'email\']//ancestor::*"));
		
		System.out.println("The total no element "+elem.size());

		driver.close();

	}

}
