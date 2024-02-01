package spaceBurger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spaceBurger.BasePage;
import spaceBurger.HomePage;

public class LoginPage extends BasePage {

   public LoginPage(WebDriver driver) {
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
}


