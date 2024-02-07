package spaceBurger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spaceBurger.BasePage;
import spaceBurger.HomePage;

import java.time.Duration;

public class ProfilePage extends BasePage {
   private static final Duration WAIT_SECONDS = Duration.ofSeconds(5);

   public ProfilePage(WebDriver driver) {
      super(driver);
   }

   public static String loginPageURL() {
      return HomePage.homePageURL() + "login";
   }

   @FindBy(xpath = "//button[text()='Einloggen']")
   WebElement einloggenButton;

   public void clickEinloggenButton() {
      einloggenButton.click();
   }

   @FindBy(xpath = "//input[@type='email']")
   WebElement inputEmail;
   @FindBy(xpath = "//input[@type='password']")
   WebElement inputPassword;

   public void login(String email, String password) {
      type(inputEmail, email);
      type(inputPassword, password);

   }

   @FindBy(xpath = "//a[contains(text(), 'Hi! Default')]")
   static WebElement hiDefaultLink;


   public static void clickhiDefaultLinkButton() {
      hiDefaultLink.click();
   }
public static String ProfilePageURL(String Profile) {
   return ProfilePage.ProfilePageURL(Profile) + "profile";

   }
}
