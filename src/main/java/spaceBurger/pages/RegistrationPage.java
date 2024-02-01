package spaceBurger.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import spaceBurger.BasePage;
import spaceBurger.HomePage;

public class RegistrationPage extends BasePage {
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

   @FindBy(xpath = "//input[@placeholder='Name']")
   WebElement nameInput;
   @FindBy(xpath = "//input[@placeholder='email']")
   WebElement inputEmail;
   @FindBy(xpath = "//input[@placeholder='password']")
   WebElement inputPassword;

   public void register(String name, String email, String password) {
      type(nameInput, name);
      type(inputEmail, email);
      type(inputPassword, password);
   }

   public WebElement getnameInput() {
      return nameInput;
   }

   public WebElement getinputEmail() {
      return inputEmail;
   }

   public WebElement getinputPassword() {
      return inputPassword;
   }

}