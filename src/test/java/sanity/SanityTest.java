package sanity;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import ui.helper.TestHelper;

public class SanityTest extends TestHelper {

    @Test
    public void VerifySanityTestPlan() {
        //Verify Sign in
        driver.findElement(By.cssSelector("[title='Log in to your customer account']")).click();
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys("shoppingtest@gmail.com");
        driver.findElement(By.id("passwd")).clear();
        driver.findElement(By.id("passwd")).sendKeys("shopping123");
        driver.findElement(By.id("SubmitLogin")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "My account - My Store";
        Assert.assertEquals("sign in does not match", expectedTitle, actualTitle);
        System.out.println(driver.getTitle());

    }
        @Test
        //Verify Sign Out Link
        public void VerifySignOutLink () {
            driver.findElement(By.cssSelector("[title='Log me out']")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Login - My Store";
            Assert.assertEquals("sign out does not match", expectedTitle, actualTitle);
            System.out.println(driver.getTitle());

        }


    //Verify My Account links

        @Test
        //Verify Order history - My Store
        public void VerifyOrderHistory() {
            driver.findElement(By.cssSelector("[title='Orders']")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Order history - My Store";
            Assert.assertEquals("title of order does not match", expectedTitle, actualTitle);
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a")).click();
        }

        @Test
        //Verify Order slip - My Store
        public void VerifyOrderSlip() {
            driver.findElement(By.cssSelector("[title='Credit slips']")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Order slip - My Store";
            Assert.assertEquals("title of order slip does not match", expectedTitle, actualTitle);
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a")).click();

        }

        @Test
        //Verify Addresses - My Store
        public void VerifyAddresses() {
            driver.findElement(By.cssSelector("[title='Addresses']")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Addresses - My Store";
            Assert.assertEquals("title of addresses does not match", expectedTitle, actualTitle);
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a")).click();

        }

        @Test
        //Verify Addresses - My Store
        public void VerifyInformation() {
            driver.findElement(By.cssSelector("[title='Information']")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Identity - My Store";
            Assert.assertEquals("title Identity does not match", expectedTitle, actualTitle);
            System.out.println(driver.getTitle());
            driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/ul/li[1]/a")).click();
        }

        @Test
        //Verify Women Evening Dresses Link
        public void VerifyDressLink() {
            Actions action = new Actions(driver);
            action.moveToElement(driver.findElement(By.linkText("WOMEN"))).build().perform();
            driver.findElement(By.linkText("Evening Dresses")).click();
            String actualTitle = driver.getTitle();
            String expectedTitle = "Evening Dresses - My Store";
            System.out.println(driver.getTitle());
            Assert.assertEquals("title of the Women does not match", expectedTitle, actualTitle);
        }

    }




