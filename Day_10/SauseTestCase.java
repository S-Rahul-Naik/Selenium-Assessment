package Assessment.Day_10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SauseTestCase extends SauceBaseClass {

    @Test
    public void loginTest() throws EncryptedDocumentException, IOException, InterruptedException {

        // Verify Product Page
        if (driver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html")) {
        	Reporter.log("------------------------Product Page is displayed--------------------------------",true);
        } else {
        	Reporter.log("_________________________Product Page is Not displayed________________________",true);
        }


        // Add product to cart
        ProductPom p = new ProductPom(driver);
        Thread.sleep(2000);
        p.getAddcart();
        Thread.sleep(1000);


        // Go to cart
        p.getCartClick();
        Thread.sleep(1000);


        // Verify product in cart
        CartPom cp = new CartPom(driver);
        if (cp.getProduct().isDisplayed()) {
        	Reporter.log("-----------------Sauce Labs Backpack is displayed in the cart----------------------",true);
        } else {
        	Reporter.log("-------------------Sauce Labs Backpack is not displayed in the cart-------------------",true);
        }

        Thread.sleep(1000);
        // Click Checkout     
        cp.getCheckout();
        Thread.sleep(1000);


        // Read data from Excel
        FileInputStream fis = new FileInputStream("./src/test/java/Assessment/Day_10/sause.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        String fname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        String Lname = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        String pin = String.valueOf((int) wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue());

        // Enter checkout information
        CheckOutPom co = new CheckOutPom(driver);
        co.getFname().sendKeys(fname);
        Thread.sleep(1000);
        co.getLname().sendKeys(Lname);
        Thread.sleep(1000);
        co.getPincode().sendKeys(pin);
        Thread.sleep(1000);
        co.getContinue();
        wb.close();
        fis.close();
    }
    
    @Test
    public void orderPlacementTest() throws EncryptedDocumentException, IOException, InterruptedException {

        


        // Add product to cart
        ProductPom p = new ProductPom(driver);

        // Go to cart
        p.getCartClick();
        Thread.sleep(2000);

        // Verify product in cart
        CartPom cp = new CartPom(driver);
        Thread.sleep(2000);
        // Click Checkout     
        cp.getCheckout();
        Thread.sleep(1000);

        // Read data from Excel
        FileInputStream fis = new FileInputStream("./src/test/java/Assessment/Day_10/sause.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        String fname = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
        String Lname = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
        String pin = String.valueOf((int) wb.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue());

        // Enter checkout information
        CheckOutPom co = new CheckOutPom(driver);
        co.getFname().sendKeys(fname);
        Thread.sleep(1000);
        co.getLname().sendKeys(Lname);
        Thread.sleep(1000);
        co.getPincode().sendKeys(pin);
        Thread.sleep(1000);
        co.getContinue();
        wb.close();
        fis.close();
        checkoutstep cs = new checkoutstep(driver);
        cs.getFinish();
        verificationmsgpom v = new verificationmsgpom(driver);
        if(v.getVerify().isDisplayed()) {
        	Reporter.log("---------------------Message is displayed---------------------------",true);
        }else {
        	Reporter.log("----------------Message is not displayed-----------------------------",true);
        }
        
    }
    

}