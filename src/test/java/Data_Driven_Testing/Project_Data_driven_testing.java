package Data_Driven_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Project_Data_driven_testing {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		
		
		String file = System.getProperty("user.dir") + "\\Testing Data\\DDT.xlsx";
	//	System.out.println(file);
		
			
		
		int rows = ExcelUtils.getRowCount(file, "Sheet1");
		
		for(int i = 1; i<rows; i++) 
		{
			String prin = ExcelUtils.getCellData(file, "Sheet1", i , 0);
			String rateofinterest = ExcelUtils.getCellData(file, "Sheet1", i , 1);
			String per1 = ExcelUtils.getCellData(file, "Sheet1", i , 2);
			String peri2 = ExcelUtils.getCellData(file, "Sheet1", i , 3);
			String frequency = ExcelUtils.getCellData(file, "Sheet1", i , 4);
			String ex_mvalue = ExcelUtils.getCellData(file, "Sheet1", i , 5);
			String  exp= ExcelUtils.getCellData(file, "Sheet1", i , 6);
			//System.out.println(ex_mvalue);
			
			driver.findElement(By.name("principal")).sendKeys(prin);
			driver.findElement(By.name("interest")).sendKeys(rateofinterest);
			driver.findElement(By.name("tenure")).sendKeys(per1);
			
			Select perdrpdwn = new Select(driver.findElement(By.name("tenurePeriod")));
			perdrpdwn.selectByVisibleText(peri2);
			
			
			Select freqdpdwn = new Select(driver.findElement(By.name("frequency")));
			freqdpdwn.selectByVisibleText(frequency );
			
			//click Calculate Button
			
			//driver.findElement(By.xpath("/html[1]/body[1]/div[12]/div[2]/div[1]/div[5]/div[1]/div[1]/div[3]/form[1]/div[2]/a[1]/img[1]")).click();
			
			JavascriptExecutor js = driver;
			WebElement calculate_btn = driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
			js.executeScript("arguments[0].click();",calculate_btn);
			
			String act_mvalue=driver.findElement(By.xpath("//*[@id=\"resp_matval\"]/strong")).getText();
			
			Thread.sleep(3000);

			if(Double.parseDouble(ex_mvalue)==Double.parseDouble(act_mvalue))
			{
			
					System.out.println("Test Passed");	
					ExcelUtils.setCellData(file , "Sheet1", i, 7, "PASS");
					ExcelUtils.fillGreenColor(file, "Sheet1", i, 7);
			}
			else
			{
				System.out.println("Test Fail");	
				ExcelUtils.setCellData(file, "Sheet1", i, 7, "FAIL");
				ExcelUtils.fillRedColor(file, "Sheet1", i, 7);
			}
			
			Thread.sleep(3000);
			//clicking clear button
			WebElement clear_btn = driver.findElement(By.xpath("//img[@class='PL5']"));
			js.executeScript("arguments[0].click();",clear_btn);
			
			Thread.sleep(3000);
		}
			
		}
		
		
	}



