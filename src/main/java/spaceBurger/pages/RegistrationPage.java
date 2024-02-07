package spaceBurger.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spaceBurger.BasePage;
import spaceBurger.HomePage;

import java.time.Duration;

public class RegistrationPage extends BasePage {
   private static final Duration WAIT_SECONDS = Duration.ofSeconds(10);
   BasePage basePage;

   public RegistrationPage(WebDriver driver) {
      super(driver);
      this.basePage = new BasePage(driver);
   }

   public static String registerPageURL() {
      return HomePage.homePageURL() + "register";
   }

   @FindBy(xpath = "//button[text()='Registrieren']")
   static WebElement RegistrierenButton;

   public static void clickRegistrierenButton() {
      RegistrierenButton.click();
   }

   @FindBy(xpath = "//input[@type='checkbox']")
   static WebElement Checkbox;

   public static void checkbox(String checkbox) {
      Checkbox.click();
   }

   @FindBy(xpath = "//span[contains(text(),'Allgemeinen Geschäftsbedingungen zu')]")
   WebElement generally;

   public void generally() {
      generally.click();
   }

   @FindBy(xpath = "//button[contains(text(),'Akzeptieren')]")
   WebElement AcceptButton;

   public void accept() {
      AcceptButton.click();
   }

   @FindBy(xpath = "//div[contains(text(),'Der Benutzer mit dieser E-Mail-Adresse existiert bereits')]")
   WebElement errorRegisterExistedUser;

   public WebElement getErrorRegisterExistedUser() {
      return errorRegisterExistedUser;
   }

   @FindBy(xpath = "//input[@placeholder='Name']")
   WebElement nameInput;
   @FindBy(xpath = "//input[@type='email']")
   WebElement inputEmail;
   @FindBy(xpath = "//input[@type='password']")
   WebElement inputPassword;
   @FindBy(xpath = "//div[contains(text(),'Der Benutzer mit dieser E-Mail-Adresse existiert bereits')]")
   WebElement errorMessage;

   public void register(String name, String email, String password) {
      type(nameInput, name);
      type(inputEmail, email);
      type(inputPassword, password);

   }
}


