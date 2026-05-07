package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class CheckoutPage extends BaseClass {
    @FindBy(id = "first-name")   WebElement firstNameField;
    @FindBy(id = "last-name")   WebElement lastNameField;
 @FindBy(id = "postal-code")    WebElement zipCodeField;
   @FindBy(id = "continue") WebElement continueButton;
    @FindBy(id = "cancel")  WebElement cancelButton;

    public CheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    public void enterInformation(String fname, String lname, String zip) {
        firstNameField.sendKeys(fname);
        lastNameField.sendKeys(lname);
        zipCodeField.sendKeys(zip);
        continueButton.click();
    }

    public String getPageUrl() {
        return driver.getCurrentUrl();
    }
}