package Assessment.Day_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// Load test data from the properties file
		FileInputStream fis = new FileInputStream("./src/test/java/Assessment/Day_5/TestCase_1PropertyFile.properties");
		Properties p = new Properties();
		p.load(fis);
		// Read browser, URL, email, and password from the properties file
		String browser = p.getProperty("browser");
		String url = p.getProperty("url");
		String email = p.getProperty("email");
		String password = p.getProperty("password");
		
		WebDriver driver = null;
		// Launch the browser based on the configuration
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		// Maximize the browser window
		driver.manage().window().maximize();
		// Navigate to the application 
		driver.get(url);
		// Set implicit wait for locating web elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Locate and click the Login link
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		// Locate the Email field and send data
		driver.findElement(By.id("Email")).sendKeys(email);
		//locate password tf and send data
		driver.findElement(By.id("Password")).sendKeys(password);
		Thread.sleep(1000);
		//locate login button and click
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		//close the browser
		driver.quit();
	}

}
