package Tests;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactUsPage;

import java.util.concurrent.TimeUnit;

public class ContactUsTest {
    public static WebDriver driver;
    public static ContactUsPage contactUsPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        contactUsPage = new ContactUsPage(driver);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://ipninja.io/#contact");
    }

    @Test
    public void Test() {
        contactUsPage.inputName("test");
        contactUsPage.inputEmail("test@gmail.com");
        contactUsPage.inputPrefix("+1");
        contactUsPage.inputPhone("1358-99-04");
        contactUsPage.clickButton();
        //driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        try {
            Thread.sleep(2000);
        }
        catch (InterruptedException e) {
        String messageCheck = contactUsPage.getMessageText();
        Assert.assertEquals("Thank you for your message. It has been sent.", messageCheck);
    }

}
    @AfterClass
    public static void tearDown(){

        driver.quit();
    }

}
