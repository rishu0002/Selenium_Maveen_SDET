package Day_11;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class broken_link {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");

		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		int brokenlinks = 0;//for storing the no of broken link
		for(WebElement linkElement:link) 
		{
			String hrefValue = linkElement.getAttribute("href");
			if (hrefValue == null || hrefValue.isEmpty()) 
			{
				System.out.println("href value is empty");
				continue;
			}


			// Connect to server
			URL hrefurl = new URL (hrefValue);
			HttpURLConnection conn =(HttpURLConnection) hrefurl.openConnection();
			conn.connect();
			if(conn.getResponseCode()>400)
			{
				System.out.println(hrefurl + "  "+"broken link");
				brokenlinks++;

			}
			else
			{
				System.out.println(hrefurl + " "+"not broken link");
			}
			
			
		}
		System.out.println("total no of broken links "+brokenlinks);
	}
}

