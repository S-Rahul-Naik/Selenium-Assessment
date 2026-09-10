package Assessment.Day_4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_2 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		 // Set an implicit wait to allow elements time to load
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Navigate to the Date Picker application
		driver.get("https://www.zomato.com/bangalore/delivery");
		driver.findElement(By.xpath("//button[text()=\"Log in\"]")).click();
		WebElement ref = driver.findElement(By.xpath("//iframe[@id=\"auth-login-ui\"]"));
		driver.switchTo().frame(ref);
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("7672039975");
		driver.switchTo().defaultContent();
		WebElement r = driver.findElement(By.xpath("//div[text()=\"Delivery\"]"));
		if(r.isDisplayed()) {
			System.out.println(r.getText());
		}
	}
}
