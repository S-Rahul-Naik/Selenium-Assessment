package Assessment.Day_4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_1 {
	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		 // Set an implicit wait to allow elements time to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Navigate to the Date Picker application
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		// Find all text fields and print their size
		List<WebElement> all = driver.findElements(By.xpath("//input/ancestor::div[@class=\"x78zum5 xdt5ytf xh8yej3\"]"));
		int t =1;
		for(WebElement ele : all) {
			System.out.println(t+". Size of the inputBox (Width,Height) is : "+ele.getSize());
			t++;
		}
	}
}
