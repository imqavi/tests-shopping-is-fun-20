package sanity;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SanityTest {

  private static WebDriver driver;

  @BeforeClass
    public static void setDriver() {
    //open browser
    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://cognit.mynetgear.com:3000/");

  }

  //@AfterClass
  //public static void teardown() {
    //driver.close();

  //}

  @Test
  public void LoadPage() {
    driver.findElement(By.id("")).getText();

  }

}
