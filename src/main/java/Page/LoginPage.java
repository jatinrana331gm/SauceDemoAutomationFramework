package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(xpath = "//input[@id='user-name']") WebElement userName;
	@FindBy(xpath = "//input[@id='password']") WebElement passWord;
	@FindBy(xpath = "//input[@id='login-button']") WebElement loginButton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String  verifyLogin() {
		userName.sendKeys("standard_user");
		passWord.sendKeys("secret_sauce");
		loginButton.click();
		return driver.getCurrentUrl();
	}
	
}
