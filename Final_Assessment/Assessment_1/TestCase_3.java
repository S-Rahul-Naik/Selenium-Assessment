package Assessment.Final_Assessment.Assessment_1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase_3 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=3");

        WebElement laptopCharger = driver.findElement(By.id("dragElement1"));
        WebElement mobileCover = driver.findElement(By.id("dragElement2"));
        WebElement laptopCover = driver.findElement(By.id("dragElement3"));
        WebElement mobileCharger = driver.findElement(By.id("dragElement4"));

        WebElement mobileAccessories = driver.findElement(By.id("dropZone1"));
        WebElement laptopAccessories = driver.findElement(By.id("dropZone2"));

        Actions actions = new Actions(driver);

        // Mobile Cover, Mobile Charger -> Mobile Accessories
        actions.keyDown(Keys.CONTROL).click(mobileCover).click(mobileCharger).keyUp(Keys.CONTROL).perform();

        // draging to Mobile Accessories
        actions.clickAndHold(mobileCover).moveToElement(mobileAccessories).release().perform();

        // Mobile Cover, Mobile Charger -> Mobile Accessories
        actions.keyDown(Keys.CONTROL).click(laptopCover).click(laptopCharger).keyUp(Keys.CONTROL).perform();

        // draging to Mobile Accessories
        actions.clickAndHold(laptopCover).moveToElement(laptopAccessories).release().perform();
        
        
        
    }
}