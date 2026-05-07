package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseClass;

public class CheckoutStepTwoPage extends BaseClass {

    @FindBy(id = "finish")   WebElement finishButton;

    @FindBy(xpath = "//h2[@class='complete-header']") WebElement confirmationMessage;

    public CheckoutStepTwoPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickFinish() {
        finishButton.click();
    }

    public String getConfirmationText() {
        return confirmationMessage.getText();
    }
}