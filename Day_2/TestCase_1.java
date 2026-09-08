package Assessment.Day_2;

/*
Testcase 1

1.Navigate to the facebook application.
2.Click on create new account button.
3.Verify that fistname and surname textfields are aligned in same line or not.

*/


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_1 {

	public static void main(String[] args) throws InterruptedException {
		// Create an instance of Chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Navigate to Myntra application.
		driver.get("https://www.facebook.com/");
		//clicking on the create new account button
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();
		
		//locate the first name input field
		WebElement fname = driver.findElement(By.xpath("//input[@id=\"_R_1cl2p4jikacppb6amH1_\"]"));

		//locate the last name input field
		WebElement lname = driver.findElement(By.xpath("//input[@id=\"_R_1kl2p4jikacppb6amH1_\"]"));
	
		//Verify that fistname and surname textfields are aligned in same line or not.
		if(fname.getLocation().getY()==lname.getLocation().getY()) {
			System.out.println("Firstname and Surname textfields are aligned in same line Because both the elements have Y-axis value is same.\n"+"Y-axis of First name is : "+fname.getLocation().getY()+"\nY-axis of Last name is :"+lname.getLocation().getY());
		}else {
			System.out.println("Firstname andSurname textfields are Not aligned in same line");
		}
		Thread.sleep(3000);
		driver.quit();
		

	}

}
