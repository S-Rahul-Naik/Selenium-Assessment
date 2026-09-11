package Assessment.Day_5;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Duration;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws IOException, ParseException, InterruptedException, Throwable  {
		// Load test data from the JSON file
		FileReader fir = new FileReader("./src/test/java/Assessment/Day_5/TestCase3_JSONFile.json");
		JSONParser j = new JSONParser();
		Object obj = j.parse(fir);
		JSONObject json = (JSONObject)obj;
		// Read data from JSON file
		String browser = (json.get("browser").toString());
		String url = (json.get("url").toString());
		String name = (json.get("name").toString());
		String email = (json.get("email").toString());
		String password = (json.get("password").toString());
		
		WebDriver driver = null;
		// Launch the Chrome browserO
		if(browser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		// Set implicit wait for locating elements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
		// Locate the Name field and enter the registration details
		driver.findElement(By.id("name")).sendKeys(name,Keys.TAB,email,Keys.TAB,password);
		
		Thread.sleep(2000);
		// Locate and click the Register button
		driver.findElement(By.xpath("//button[text()='Register']")).click();
		Thread.sleep(3000);
		
		// Close the browser
		driver.quit();
	}

}
