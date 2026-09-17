package Assessment.Day_10;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SauceBaseClass {

    WebDriver driver = null;

    @BeforeSuite
    public void BS() {
    	Reporter.log("----------------------------Establish DB Connection----------------------",true);
    }

    @BeforeTest
    public void BT() {
    	Reporter.log("----------------------Pre-conditions----------------------",true);
    }

    @BeforeClass
    public void BC() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        Reporter.log("----------------------Launching the Browser----------------------",true);
    }

    @BeforeMethod
    public void BM() throws IOException, InterruptedException {

        FileInputStream fis =new FileInputStream("./src/test/java/Assessment/Day_10/commondata.properties");

        Properties p1 = new Properties();

        p1.load(fis);

        String url = p1.getProperty("url");
        String username = p1.getProperty("username");
        String password = p1.getProperty("password");

        driver.get(url);
        LoginPom l = new LoginPom(driver);
        l.getUsernameField().sendKeys(username);
        Thread.sleep(1000);
        l.getPwdField().sendKeys(password);
        Thread.sleep(1000);
        l.getLgnbtn().click();
        fis.close();
        Reporter.log("---------------------- Login Successfull ----------------------",true);
    } 
    @AfterMethod
    public void AM() {
    	logoutPom lp =new logoutPom(driver);
    	lp.getHam();
    	lp.getLogout();
    	Reporter.log("----------------------Logged Out----------------------",true);
    }
    @AfterClass
    public void AC() throws InterruptedException{
    	Thread.sleep(3000);
    	Reporter.log("----------------------Closing the Browser----------------------",true);
    	driver.quit();
    	
    }
    @AfterTest 
    public void AT() {
    	Reporter.log("----------------------Post-Conditions----------------------",true);
    	
    }
    @AfterSuite
    public void AS() {
    	Reporter.log("----------------------Disconnect the DB Connection----------------------",true);
    }
    
    
}