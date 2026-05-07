package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePage extends BaseClass {
@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']") WebElement addToCartBackpackButton;
@FindBy(xpath = "//a[@data-test='shopping-cart-link']") WebElement cartCount;
@FindBy(xpath = "//a[@class='shopping_cart_link']") WebElement cartIcon;
@FindBy(xpath = "//button[text()='Checkout']") WebElement checkButton;
public HomePage() {
	PageFactory.initElements(driver, this);
}

	public String addProductsToCart() {
		
	addToCartBackpackButton.click();	
	
	 return cartCount.getText();
	
	}
	public String cartIcon() {
		 cartIcon.click();
		 
		return driver.getCurrentUrl();
		
	}
	
	public String checkButtons() {
		checkButton.click();
		return driver.getCurrentUrl();
	}
}
