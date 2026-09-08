package Assessment.Day_2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {

	public static void main(String[] args) throws InterruptedException {
		// Create an instance of Chrome browser
		WebDriver driver = new ChromeDriver();
		// Maximize the browser window
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Navigate to Myntra application.
		driver.get("https://www.facebook.com/");
		//capture the Location create new account button
		WebElement cna = driver.findElement(By.xpath("//span[text()='Create new account']"));
		//capture the Location email
		WebElement email = driver.findElement(By.name("email"));
		//Printing the Dom Attributes before entering data in to the email text field
		System.out.println("-------------------------Before---------------------------");
		System.out.println("Dom Attribute before passing Email to the email Text Field : "+email.getDomAttribute("value"));
		System.out.println("Dom Attribute before passing Email to the email Text Field : "+email.getDomProperty("value"));
		// passing data into the email text field
		email.sendKeys("23rahul54@gmail.com");
		//Printing the Dom Attributes after entering data in to the email text field
		System.out.println("--------------------------After---------------------------");
		System.out.println("Dom Attribute After passing Email to the email Text Field : "+email.getDomAttribute("value"));
		System.out.println("Dom Attribute After passing Email to the email Text Field : "+email.getDomProperty("value"));
		//clicking on the create new account buuton
		cna.click();
		// locate and store the Submit button
		WebElement button = driver.findElement(By.xpath("//span[text()='Submit']/ancestor::div[@class=\"x3nfvp2 x1n2onr6 xh8yej3\"]"));
		//print the size of the submit button
		System.out.println("Submit Button Size is (width,height): "+button.getSize());
		
		//capture and print the css properties of sign up button (minimum 3)
		System.out.println("CssValue of Width : "+button.getCssValue("width"));
		System.out.println("CssValue of font-family : "+button.getCssValue("font-family"));
		System.out.println("CssValue of position : "+button.getCssValue("position"));
		System.out.println("CssValue of display : "+button.getCssValue("display"));
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
