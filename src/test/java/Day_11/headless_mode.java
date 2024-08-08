package Day_11;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class headless_mode {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("headless=new");
		ChromeDriver driver =new ChromeDriver(option);
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("submit")).click();

		//driver.findElement(By.name("SIGN-OFF")).click();

		String act_title = driver.getTitle();
		String exp_title = "Login: Mercury Tours";

		if(act_title.equals(exp_title)){
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("test is failed");
		}

		driver.findElement(By.linkText("SIGN-OFF")).click();


		String act_title1 = driver.getTitle();
		String exp_title2 = "Welcome: Mercury Tours";

		if(act_title1.equals(exp_title2)){
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("test is failed");
		}

	}

}

	