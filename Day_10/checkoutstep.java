package Assessment.Day_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutstep {
	WebDriver driver;
	public checkoutstep(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@id='finish']")
	private WebElement finish;
	public void getFinish() {
		finish.click();
	}
}
