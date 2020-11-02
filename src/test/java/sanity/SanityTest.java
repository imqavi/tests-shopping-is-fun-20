package sanity;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityTest {
    public WebDriver driver;

    @Before
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }
    @Test
    public void ShoppingLogDashboard() {
        String expectedHeader = "Contact us";
        String actualHeader = driver.findElement(By.cssSelector("[title='Contact Us']")).getText();
        Assert.assertEquals("Dashboard header title doesn't match",expectedHeader,actualHeader);

    }

}
