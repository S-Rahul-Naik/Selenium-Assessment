package Assessment.Day_2;

/*
//Testcase 3 
1.Navigate to demowebshop
2.Identify the webelement(14.1-inch laptop)-->identify add to cart button capture the size and them click on the buuton.
3.Click on shopping cart link.
4.verify remove check box is selected or not and capture the complete information using getRect().
5.Verify Alert message is displayed or not before and after clicking on Apply coupon button
6.Take screenshot of image(Laptop).
*/

import java.io.File;
import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TestCase_3 {
	public static void main(String[] args) throws InterruptedException, IOException {
		// Create an instance of Chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Navigate to Myntra application.
		driver.get("https://demowebshop.tricentis.com/");
		
		// locate the add to cart button
		WebElement p = driver.findElement(By.xpath("//a[normalize-space()='14.1-inch Laptop']/ancestor::div[@class=\"details\"]/descendant::div[@class=\"buttons\"]"));
		//print size of the add to cart button and the click on it
		System.out.println("Size of the add to cart Button (Width,height) : "+p.getSize());
		p.click();
		Thread.sleep(5000);
		//click on the shopping cart link
		driver.findElement(By.xpath("//a[@class=\"ico-cart\"]")).click();
		
		//locate the remove check box
		WebElement checkbox = driver.findElement(By.xpath("//input[@type=\"checkbox\"]"));
		// verify remove check box is selected or not
		if(checkbox.isSelected()) {
			System.out.println("Check box is selected");
		}else {
			System.out.println("Check box is not selected");
		}
		//capture the complete information using getRect()
		System.out.println("---------------------capture the complete information using getRect()----------------------");
		System.out.println("check box height : "+checkbox.getRect().getHeight());
		System.out.println("check box Width : "+checkbox.getRect().getWidth());
		System.out.println("check box X-axis : "+checkbox.getRect().getX());
		System.out.println("check box Y-axis : "+checkbox.getRect().getY());
		
		//Alert message is displayed or not before
		System.out.println("------------------Before Apply coupon-------------------------");
		try {
		    WebElement message = driver.findElement(By.xpath("//div[@class='message']"));

		    if (message.isDisplayed()) {
		        System.out.println("Alert message is displayed");
		    } else {
		        System.out.println("Alert message is not displayed");
		    }

		} catch (NoSuchElementException e) {
		    System.out.println("Alert message is not displayed");
		}
		// click on apply coupon button
		driver.findElement(By.xpath("//input[@value=\"Apply coupon\"]")).click();
		Thread.sleep(3000);
		
		// Alert message is displayed or not after
		System.out.println("------------------After Apply coupon-------------------------");
		
		WebElement msg = driver.findElement(By.xpath("//div[@class=\"message\"]"));
		 
		if (msg.isDisplayed()) {
	        System.out.println("Alert message is displayed");
	    } else {
	        System.out.println("Alert message is not displayed");
	    }
		
		// Take screenshot of image(Laptop).
		WebElement tks = driver.findElement(By.xpath("//td[@class='product-picture']//img[@title='Show details for 14.1-inch Laptop']"));
		
		File tk= tks.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumDemo\\Ss\\Laptop.png");
		FileHandler.copy(tk, dest);
		Thread.sleep(4000);
		driver.quit();
	}
}
