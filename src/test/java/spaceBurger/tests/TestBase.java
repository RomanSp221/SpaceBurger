package spaceBurger.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import spaceBurger.HomePage;

import java.io.IOException;
import java.time.Duration;

public class TestBase {

   public static WebDriver driver;


   @BeforeMethod
   public void setUp() {
      driver = new ChromeDriver();
      driver.get(HomePage.homePageURL());
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }

   @AfterMethod (enabled = false)
   public void tearDown() {
      driver.quit();
      try {
         Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
      } catch (IOException ignored) {
      }
   }
}

