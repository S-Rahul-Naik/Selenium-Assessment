package Assessment.Day_3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase_1 {
	public static void main(String[] args) throws InterruptedException {
		// Handle Notification popups
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		// Create an instance of Chrome browser
		WebDriver driver=new ChromeDriver(option);
		// Maximize the browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Navigate to easymytrip application.
		driver.get("https://www.easemytrip.com/");
		// Select One Way
		driver.findElement(By.xpath("//li[@id='oway']")).click();
		Thread.sleep(2000);
		// Enter any state  in the From field and select a valid suggestion.
		driver.findElement(By.xpath("//input[@id='FromSector_show']")).click();
		Thread.sleep(2000);
		WebElement dd = driver.findElement(By.xpath("//input[@id='a_FromSector_show']"));
		dd.sendKeys("Mumbai");
		dd.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[@onchange=\"ChangeCabin();\"]/descendant::span[@id=\"spnNavi Mumbai\"]")).click();
		Thread.sleep(2000);
		//Enter another state  in the To field and select a valid suggestion.
		driver.findElement(By.xpath("//input[@id=\"a_Editbox13_show\"]")).sendKeys("Banglore");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id=\"spnMysuru\"]")).click();
		Thread.sleep(2000);
		// Select any available future date from the calendar.
		driver.findElement(By.xpath("//li[@id=\"trd_3_16/09/2026\"]")).click();
		Thread.sleep(2000);
		//Click Traveller & Class.
		driver.findElement(By.xpath("//span[@id=\"spnTraveller\"]")).click();
		Thread.sleep(2000);
		// Select 2 Adults
		driver.findElement(By.xpath("//button[@id=\"add\"]")).click();
		Thread.sleep(2000);
		//Click Search.
		driver.findElement(By.xpath("//input[@value=\"Search\" and @tabindex=\"1\"]")).click();
		Thread.sleep(2000);
		//Verify that the flight-results page is displayed.
		if(driver.getTitle().contains("EaseMyTrip.com Lowest Airfare, Flight Tickets, Cheap Air Tickets – EaseMyTrip.com")) {
			System.out.println("Flight-Results page is displayed.");
		}else {
			System.out.println("flight-results page is not displayed.");
		}
		
		Thread.sleep(4000);
		// Close the browser
		driver.quit();
		
	}
}
