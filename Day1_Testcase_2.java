package Assessment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*


TestCase-2
1. Navigate to Myntra application.
2. Search for any product.
3. Add the product to the wishlist.
4. Verify whether it is added or not.
*/

public class Day1_Testcase_2 {

	public static void main(String[] args) throws InterruptedException {
		
		// Create an instance of Chrome browser
		WebDriver driver = new ChromeDriver();
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Navigate to Myntra application.
		driver.get("https://www.myntra.com/");
		
		
		// Locate the search box 
		WebElement a= driver.findElement(By.xpath("//input[@data-reactid='1039']"));
		Thread.sleep(2000);
		
		// Enter the product name in the search box and press Enter
		a.sendKeys("Exotica Perfume",Keys.ENTER);
		
		
		
		//  Locate the wishlist button of the required product.
		  
		WebElement a1=driver.findElement(By.xpath("(//h4[text()='Exotica Gold Eau De Parfum']/../../..)//span[@class='product-wishlistFlex product-actionsButton product-wishlist ']"));
		
		/*
		  Locate the product container element.
		  This is used to retrieve the product ID.
		 */
		WebElement pname = driver.findElement(By.xpath("(//h4[text()='Exotica Gold Eau De Parfum']/../../..)//span[@class='product-wishlistFlex product-actionsButton product-wishlist ']/../.."));
		
		// Get the ID of the product element
		String pn = pname.getDomProperty("id");
		 
		 System.out.println("Product id: "+ pn);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", a1);
		
		Thread.sleep(50000);
		// Login manual to see the product added in the wishlist 
		
		
		//clicking on the wishlist in the header page
		driver.findElement(By.xpath("//span[@data-reactid='1032']")).click();
		
		
		/*
		  Locate the product container element.
		  This is used to retrieve the product ID.
		 */
		WebElement p = driver.findElement(By.xpath("(//a[@target='_blank'])"));
		String pid = p.getDomProperty("pathname");
		
		//check the product is added or not
		if(pid.contains(pn)) {
			System.out.println("Product is added to yhe  successfully");
		}else {
			System.out.println("Product is not added");
		}
		Thread.sleep(5000);
		driver.quit();
	}
}



/*
 * 				Output :
 * 
 * 				Sept 07, 2026 11:13:05 PM org.openqa.selenium.devtools.CdpVersionFinder findNearestMatch
				WARNING: Unable to find an exact match for CDP version 152, returning the closest version; found: 151; Please update to a Selenium version that supports CDP version 152
				Product id: 22732618
				Product is not added

 */

