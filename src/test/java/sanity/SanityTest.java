package sanity;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SanityTest {

  private static WebDriver driver;

  @BeforeClass
    public static void setDriver() {
    //open browser
    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.get("http://automationpractice.com/index.php");

  }

  //@AfterClass
  //public static void teardown() {
    //driver.close();

  //}

  @Test
  public void AddEmployee() {


  }

}
