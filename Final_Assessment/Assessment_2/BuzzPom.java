package Assessment.Final_Assessment.Assessment_2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuzzPom {
	WebDriver driver;
	public BuzzPom(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//textarea[@placeholder=\"What's on your mind?\"]")
	private WebElement textarea;
	
	public void getTextarea() {
		textarea.sendKeys("Hi Buddiess");
	}
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement post;
	
	public void getPost() {
		post.click();
	}
	
	@FindBy(xpath = "//button[normalize-space()='Most Recent Posts']")
	private WebElement Recentpost;
	
	public void getRecentpost() {
		Recentpost.click();
	}
	
	@FindBy(xpath = "//div[contains(@class,'orangehrm-buzz-post')]")
	private List<WebElement> posts;

	public Boolean profileMsg(String expectedName, String expectedMessage) {

	    for (WebElement post : posts) {
	        String name = post.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-buzz-post-emp-name\"]")).getText();
	        System.out.println(name+"name"+": "+getPname() );
	        if (name.contains(getPname())) {
	            String message = post.findElement(By.xpath("//p[@class=\"oxd-text oxd-text--p orangehrm-buzz-post-body-text\"]")).getText();
	            System.out.println(message);
	            return message.contains(expectedMessage);
	        }
	    }

	    return false;
	}
	@FindBy(xpath = "(//p)[1]")
	private WebElement pname;
	
	public String getPname() {
		return pname.getText().trim().split(" ")[0];
		
	}
	
	
}
