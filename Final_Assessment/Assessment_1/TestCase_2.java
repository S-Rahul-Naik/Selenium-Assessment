package Assessment.Final_Assessment.Assessment_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase_2 {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 //Navigate to DemoApps Qspyder
		 driver.get("https://demoapps.qspiders.com/ui/slider?sublist=0");
		
		 WebElement slider = driver.findElement(By.id("slide"));

		 Actions actions = new Actions(driver);

		 actions.moveToElement(slider, 100, 0).click().build().perform();
		 
		 WebElement verify = driver.findElement(By.xpath("//h3[normalize-space()='Mens Cotton Jacket...']"));
		 if(verify.isDisplayed()) {
			 System.out.println("Mens Cotton Jacket is Displayed");
		 }else {
			 System.out.println("Mens Cotton Jacket is not Displayed");
		 }
		 
		Thread.sleep(3000);
		driver.quit();
	}
}
