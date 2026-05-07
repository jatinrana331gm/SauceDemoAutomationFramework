package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.HomePage;
import Page.LoginPage;

public class HomePageTest extends BaseClass {

	LoginPage login;
	HomePage home;

	@BeforeMethod
	public void setup() {
		openUrl();
		login = new LoginPage();
		home = new HomePage();
		login.verifyLogin();
	}

	@Test
	public void addProductsToCartTest() {
		String actualCount = home.addProductsToCart();
		String expectedCount = "1";
		Assert.assertEquals(actualCount, expectedCount);

	}

	public void cartIconTest() {

		String actualUrl = home.cartIcon();
		String expectedUrl = "https://www.saucedemo.com/cart.html";
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	public void checkButtonsTest() {
		String actualUrl = home.checkButtons();
		String expectedUrl = "https://www.saucedemo.com/checkout-step-one.html";
		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
