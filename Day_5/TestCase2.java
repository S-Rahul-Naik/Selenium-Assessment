package Assessment.Day_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// Load test data from the Excel file
		FileInputStream fis = new FileInputStream("./src/test/java/Assessment/Day_5/TestCase2_ExcelFile.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		// Read browser, URL, username and password from Excel
		String browser = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String url = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();		
		String username = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();	
		String password = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		
		WebDriver driver = null;
		// Launch the Chrome browser
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		// Locate the Username field and enter the username
		driver.findElement(By.name("username")).sendKeys(username);
		// Locate the Password field and enter the password
		driver.findElement(By.name("password")).sendKeys(password);
		Thread.sleep(1000);
		// Locate and click the Login button
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		// Locate the Dashboard text to verify successful login
		WebElement text = driver.findElement(By.xpath("//h6[text()='Dashboard']"));	
		if(text.isDisplayed())
			System.out.println("login successfull");
		else
			System.out.println("login unsuccessfull");
		// Close the browser
		Thread.sleep(3000);
		driver.quit();
		
	}

}
