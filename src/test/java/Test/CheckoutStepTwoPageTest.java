package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BaseClass;
import Page.HomePage;
import Page.LoginPage;
import Page.CheckoutPage;
import Page.CheckoutStepTwoPage;

public class CheckoutStepTwoPageTest extends BaseClass {

    LoginPage login;
    HomePage home;
    CheckoutPage checkout;
    CheckoutStepTwoPage stepTwo;

    @BeforeMethod
    public void setup() {
        openUrl();
        login = new LoginPage();
        home = new HomePage();
        checkout = new CheckoutPage();
        stepTwo = new CheckoutStepTwoPage();
        login.verifyLogin();
    }

    @Test
    public void completeOrderTest() {
        home.addProductsToCart();
        home.cartIcon();
        home.checkButtons();
        
        checkout.enterInformation("Aman", "Kumar", "110001");

        stepTwo.clickFinish();
        
        String actualMsg = stepTwo.getConfirmationText();
        String expectedMsg = "Thank you for your order!";
        Assert.assertEquals(actualMsg, expectedMsg);
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
//            driver.quit();
        }
    }
}