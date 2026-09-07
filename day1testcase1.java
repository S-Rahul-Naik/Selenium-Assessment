package Assessment;

// Day 1: Assessment

// TestCase-1

// 1. Launch SauceDemo.
// 2. Login using the valid credentials provided on the application.
// 3. On the Products page, use JavaScript Executor to scroll to the bottom of the page.
// 4. Take a screenshot of the page after scrolling.
// 5. Save the screenshot with a meaningful name such as products-page.png.


import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class day1testcase1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		d.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		WebElement username = d.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		Thread.sleep(2000);
		WebElement password = d.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		Thread.sleep(2000);
		WebElement loginButton = d.findElement(By.xpath("//input[@id='login-button']"));
		loginButton.click();
		Thread.sleep(3000);	
		WebElement bottomEle = d.findElement(By.xpath("//div[@data-test='footer-copy']"));
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("arguments[0].scrollIntoView(false)",bottomEle);
		Thread.sleep(2000);
		TakesScreenshot tks = (TakesScreenshot)d;
		File src=tks.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Ss/products-page.png");
		FileHandler.copy(src, dest);
		d.quit();
	}
}
