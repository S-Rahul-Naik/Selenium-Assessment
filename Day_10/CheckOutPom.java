package Assessment.Day_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPom {
	WebDriver driver;

	public CheckOutPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement Fname;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement Lname;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement pincode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement Continue;

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public void getContinue() {
		 Continue.click();
	}
	
}
