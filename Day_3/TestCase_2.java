package Assessment.Day_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {
	public static void main(String[] args) throws InterruptedException 
	{
		// Launch the Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		 // Set an implicit wait to allow elements time to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Navigate to the Date Picker application
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		Thread.sleep(2000);
		
		// Click on the date input field to open the date picker
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		Thread.sleep(2000);
		
		// Click on the button to navigate to the required month
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(2000);	
		
		// Select the required date from the date picker
		driver.findElement(By.xpath("//div[text()='14']")).click();
		Thread.sleep(2000);
		
		// Locate the date field and retrieve the selected date value
		WebElement df=driver.findElement(By.xpath("//input[@value='14/10/2026']"));
		System.out.println(df.getAttribute("value"));
		
		// Verify whether the expected date is displayed
		if(df.getAttribute("value").contains("14/10/2026"))
			System.out.println("Selected date is displayed");
		else
			System.out.println("Selected date is not displayed");
		
		Thread.sleep(2000);
		
		// Close the browser
		driver.quit();
	}
}
