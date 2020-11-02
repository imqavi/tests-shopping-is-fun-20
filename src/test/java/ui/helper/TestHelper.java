package ui.helper;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHelper {

    private static WebDriver driver;

    @BeforeClass
    public static void setDriver() {
        //open browser
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }

    @AfterClass
    public static void teardown() {
    driver.close();

    }

}
