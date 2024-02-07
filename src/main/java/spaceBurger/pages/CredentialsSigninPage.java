package spaceBurger.pages;

import org.openqa.selenium.WebDriver;
import spaceBurger.BasePage;
import spaceBurger.HomePage;

public class CredentialsSigninPage extends BasePage {

   public CredentialsSigninPage(WebDriver driver) {
      super(driver);
   }

   public static String credentialsSigninPageURL() {
      return HomePage.homePageURL() + "api/auth/signin?error=CredentialsSignin";
   }
}
