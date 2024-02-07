package spaceBurger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spaceBurger.BasePage;
import spaceBurger.HomePage;

public class MenuPage extends BasePage {
   BasePage basePage;

   public MenuPage(WebDriver driver) {
      super(driver);
      this.basePage = new BasePage(driver);
   }

   @FindBy(xpath = "//span[text()='Menü']")
   private static WebElement menuSpan;

   public static void clickmenuSpanButton() {
      menuSpan.click();
   }

   public static String MenupageURL() {
      return  "https://space-burger-six.vercel.app/menu";
   }
}
