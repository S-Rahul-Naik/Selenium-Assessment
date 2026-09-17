package Assessment.Day_10;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPom {
	WebDriver driver;

	public LoginPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	private WebElement usernameField;
	
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement pwdField;
	
	@FindBy(xpath="//input[@id=\"login-button\"]")
	private WebElement lgnbtn;

	public WebElement getUsernameField() {
		return usernameField;
	}

	public WebElement getPwdField() {
		return pwdField;
	}

	public WebElement getLgnbtn() {
		return lgnbtn;
	}
	
}
