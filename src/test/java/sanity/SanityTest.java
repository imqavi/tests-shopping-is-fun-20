package sanity;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.helper.TestHelper;

public class SanityTest extends TestHelper {
    public static WebDriver driver;

    @Test
    public void clickOnSigninLink() {
        driver.findElement(By.cssSelector("[title='Log in to your customer account']")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("shoppingtest@gmail.com");
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("shopping123");
        driver.findElement(By.id("SubmitLogin")).click();

        //Sign Out
        driver.findElement(By.cssSelector("[title='Log me out']")).click();

        //Verify My Account links
        driver.findElement(By.cssSelector("[title='Orders']")).click();
    }

}

