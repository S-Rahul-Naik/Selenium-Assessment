package Assessment.Day_9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoImplementation {
	WebDriver driver;
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void open_Url() {
		driver.get("https://www.saucedemo.com/");
	}
	
	public void un() {
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	}
	
	public void pwd() {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}
	
	public void login() {
		driver.findElement(By.name("login-button")).click();
	}
	public void close_browser() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
}
