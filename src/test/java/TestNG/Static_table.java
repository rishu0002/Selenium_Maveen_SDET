package TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Static_table {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		
        // Locate the table
        WebElement table = driver.findElement(By.xpath("//table[@name='BookTable']"));

        // 1) Find total number of rows
        List<WebElement> rows = table.findElements(By.xpath(".//tr"));
        int totalRows = rows.size();
        System.out.println("Total number of rows: " + totalRows);

        // 2) Find total number of columns
        List<WebElement> columns = table.findElements(By.xpath(".//tr[1]/th"));
        int totalColumns = columns.size();
        System.out.println("Total number of columns: " + totalColumns);

        // 3) Read specific row & column data
        // Example: 2nd row, 3rd column (assuming first row is headers)
        WebElement specificCell = table.findElement(By.xpath(".//tr[3]/td[3]"));
        System.out.println("Data at 2nd row & 3rd column: " + specificCell.getText());
        
        // 4) Read data from all the rows & columns
        System.out.println("Reading all data from the table:");
        for (WebElement row : rows) {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                System.out.print(cell.getText() + " | ");
            }
            System.out.println();
        }
     
    
     // 5) Print book names whose author is Amit
        System.out.println("Books authored by Amit:");
        for (WebElement row : rows) 
        {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            if (cells.size() > 0) 
            { 
                String author = cells.get(1).getText(); 
                System.out.println(author);
                if (author.equals("Amit")) 
                {
                    String bookName = cells.get(0).getText(); 
                    System.out.println(bookName); 
                }
            }
        }
	}
}