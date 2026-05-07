package Test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.BaseClass;
import Page.LoginPage;

public class LoginPageTest extends BaseClass {
	LoginPage login;

	@BeforeMethod
	public void setup() {
		openUrl();
		login = new LoginPage();
	}

	@Test
	public void verifyLoginTest() {
		String actualUrl = login.verifyLogin();
		String expectedUrl = "https://www.saucedemo.com/inventory.html";
		Assert.assertEquals(actualUrl, expectedUrl);

	}

	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
