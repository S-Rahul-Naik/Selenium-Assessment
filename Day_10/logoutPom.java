package Assessment.Day_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logoutPom {
	WebDriver driver;

	public logoutPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	



	@FindBy(xpath="//button[@id=\"react-burger-menu-btn\"]")
	private WebElement ham;
	
	
	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement logout;

	public void getHam() {
		 ham.click();
	}


	public void getLogout() {
		 logout.click();;
	}
	
}
