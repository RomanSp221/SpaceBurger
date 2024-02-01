package spaceBurger;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class BasePage {

   public WebDriver driver;

   public BasePage() {

   }

   public BasePage(WebDriver driver) {
      this.driver = driver;
      PageFactory.initElements(driver, this);
   }

   public void click(WebElement element) {
      element.click();
   }

   public void type(WebElement element, String text) {
      if (text != null) {
         click(element);
         element.clear();
         element.sendKeys(text);
      }
   }

   public void goToPage(String pageURL) {
      driver.get(pageURL);
   }

   public void isCurrentPage(String expctedURL, boolean expactedPage) {
      String currentURL = driver.getCurrentUrl();
      if (currentURL.endsWith("/")) {
         currentURL = currentURL.substring(0,currentURL.length() - 1);
      }
      boolean isCurrent = currentURL.equals(expctedURL);
      Assert.assertEquals(isCurrent,expactedPage,"Current page is not expected URL");
   }
}
