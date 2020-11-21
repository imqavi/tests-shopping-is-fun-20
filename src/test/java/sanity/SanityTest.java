package sanity;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import ui.helper.TestHelper;

import javax.swing.*;

public class SanityTest extends TestHelper {

    @Test
    public void VerifyWomenEveningDressLink() {
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.linkText("WOMEN"))).build().perform();
        driver.findElement(By.linkText("Evening Dresses")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Evening Dresses - My Store";
        System.out.println(driver.getTitle());
        Assert.assertEquals("title of the does not match", expectedTitle, actualTitle);



    }
}
