package Data_Driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calculator1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
		
		
		String file = System.getProperty("user.dir") + "\\Testing Data\\Calculator1.xlsx";
		
		//String file= "C:\\Users\\Rishabh Patel\\eclipse-workspace\\Selenium_Maveen_SDET\\Testing Data\\CITIBank.xlsx" ;
//		String file= "C:\\Users\\Rishabh Patel\\eclipse-workspace\\Selenium_Maveen_SDET\\Testing Data\\Calculator1.xlsx";
		
		int rows = ExcelUtils.getRowCount(file, "Sheet1");
		
		for(int i = 1; i<=rows; i++) 
		{
			String Ini_Depo_Amut = ExcelUtils.getCellData(file, "Sheet1", i , 0);
			String length_of_gd = ExcelUtils.getCellData(file, "Sheet1", i , 1);
			String rate = ExcelUtils.getCellData(file, "Sheet1", i , 2);
			String comp = ExcelUtils.getCellData(file, "Sheet1", i , 3);
			String exp_worth = ExcelUtils.getCellData(file, "Sheet1", i , 4);
			
			
			WebElement amount = driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]"));
			amount.clear();
			amount.sendKeys(Ini_Depo_Amut);
			
			WebElement length = driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]"));
			length.clear();		
			length.sendKeys(length_of_gd);
			
			WebElement interestofrate = driver.findElement(By.xpath("//*[@id=\"mat-input-2\"]"));
			interestofrate.clear();
			interestofrate.sendKeys(rate);
			//Thread.sleep(5000);
			
//			WebElement dropdown = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));
//			dropdown.click();
//			
//			WebElement option = driver.findElement(By.xpath("//span[@class='mat-option-text'][normalize-space()='Compounded Monthly']"));
//			option.click(); 
			
			JavascriptExecutor js = driver;
			WebElement dropdown = driver.findElement(By.xpath("//mat-select[@id='mat-select-0']"));
			js.executeScript("arguments[0].click();",dropdown);
			WebElement option = driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span"));
			js.executeScript("arguments[0].click();",option);
			System.out.println(option);
			
			WebElement calbutton = driver.findElement(By.xpath("//button[@id='CIT-chart-submit']"));
			calbutton.click();
			
	
			String act_mvalue=driver.findElement(By.xpath("//*[@id=\"displayTotalValue\"]")).getText();
			System.out.println(act_mvalue);
			

			if(exp_worth.equals(act_mvalue))
			

			{
			
					System.out.println("Test Passed");	
					ExcelUtils.setCellData(file , "Sheet1", i, 6, "PASS");
					ExcelUtils.fillGreenColor(file, "Sheet1", i, 6);
			}
			else
			{
				System.out.println("Test Fail");	
				ExcelUtils.setCellData(file, "Sheet1", i, 6, "FAIL");
				ExcelUtils.fillRedColor(file, "Sheet1", i, 6);
			}
			

		}

	}

}
