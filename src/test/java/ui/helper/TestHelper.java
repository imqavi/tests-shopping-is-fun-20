package ui.helper;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestHelper {
    public static WebDriver driver;

    @Before
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);

    }

    /*@AfterClass
    public static void teardownDriver() {
        driver.quit();
    }*/
}
