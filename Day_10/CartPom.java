package Assessment.Day_10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPom {

    WebDriver driver;

    public CartPom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[text()='Sauce Labs Backpack']")
    private WebElement product;

    public WebElement getProduct() {
        return product;
    }

    @FindBy(id="checkout")
    private WebElement checkout;

    public void getCheckout() {
        checkout.click();
    }
}