package Assessment.Final_Assessment.Assessment_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePom {
	WebDriver driver;
	public HomePagePom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()=\"Buzz\"]")
	private WebElement buzzlink;
	
	public void getBuzzlink() {
		 buzzlink.click();;
	}
	
}
