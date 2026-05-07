package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BaseClass;
import Page.HomePage;
import Page.LoginPage;
import Page.CheckoutPage;

public class CheckoutPageTest extends BaseClass {

    LoginPage login;
    HomePage home;
    CheckoutPage checkout;

    @BeforeMethod
    public void setup() {
        openUrl();
        login = new LoginPage();
        home = new HomePage();
        checkout = new CheckoutPage();
        login.verifyLogin();
    }

    @Test
    public void completeCheckoutFlowTest() {
        home.addProductsToCart();
        home.cartIcon();
        home.checkButtons();
        
        checkout.enterInformation("Aman", "Kumar", "110001");
        
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/checkout-step-two.html";
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}