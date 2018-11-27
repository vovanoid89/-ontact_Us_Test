package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ContactUsPage {
    public ContactUsPage(WebDriver) {
        PageFactory.initElements(driver, this);
                this.driver = driver;
    }
    public WebDriver driver;

    @FindBy (id = "email")
    private WebElement emailField;

    @FindBy (id = "name")
    private WebElement nameField;

    @FindBy (xpath = "send")
    private WebElement sendButton ;

    public void inputEmail(String emailTest) {
        emailField.sendKeys(emailTest);
    }

    public void inputName(String name) {
        nameField.sendKeys(name);
    }

    public void clickButton() {
        sendButton.click();

    }
