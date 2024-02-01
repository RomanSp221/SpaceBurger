package spaceBurger;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {

   public HomePage(WebDriver driver) {
      super(driver);
   }
      public static String homePageURL() {
         return "https://space-burger-six.vercel.app/";
      }
   }
