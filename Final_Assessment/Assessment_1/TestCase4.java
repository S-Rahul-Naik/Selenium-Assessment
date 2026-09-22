package Assessment.Final_Assessment.Assessment_1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestCase4 {

	@Test
	public void shop_stacker() throws InterruptedException
	{
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		d.get("https://www.shoppersstack.com/");
		Thread.sleep(3000);
		d.findElement(By.xpath("(//div[@class='MuiPaper-root MuiCard-root featuredProducts_productCard__xe40f MuiPaper-elevation1 MuiPaper-rounded aos-init aos-animate'])[3]")).click();
		Thread.sleep(2000);
		d.findElement(By.name("Check Delivery")).sendKeys("583103");
		WebElement ref = d.findElement(By.cssSelector("#Check"));
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.elementToBeClickable(ref));
		ref.click();
		String text = d.findElement(By.id("Check Delivery-helper-text")).getText();
		System.out.println(text);
		d.quit();
	}
}