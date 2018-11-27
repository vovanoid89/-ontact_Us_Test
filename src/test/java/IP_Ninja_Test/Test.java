package IP_Ninja_Test;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactUsPage;


public class Test {
    public static WebDriver driver;
    public static ContactUsPage;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        ContactUsPage = new ContactUsPage(driver);





    }

}
