package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactUsPage {

    public ContactUsPage( WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver driver;


    @FindBy(xpath = "//form/span[1]/input")
    private WebElement nameField;

    @FindBy(xpath = "//form/span[2]/input")
    private WebElement emailField;

    @FindBy(xpath = "//form/span[3]/input")
    private WebElement prefixField;

    @FindBy(xpath = "//form/span[4]/input")
    private WebElement phoneField;

    @FindBy(xpath = "//form/input[5]")
    private WebElement sendButton;

    @FindBy (xpath = "//form/div[2]")
    private WebElement getMessage;

    public void inputName(String name) {
        nameField.sendKeys(name);
    }

    public void inputEmail(String email) {
        emailField.sendKeys(email);
    }

    public void inputPrefix (String prefix) {
        prefixField.sendKeys(prefix);
    }

    public void inputPhone (String phone){
        phoneField.sendKeys (phone);
    }


    public void clickButton() {
        sendButton.click();
    }
    public String getMessageText() {
            String Message = getMessage.getText();
            return Message;
    }
}
