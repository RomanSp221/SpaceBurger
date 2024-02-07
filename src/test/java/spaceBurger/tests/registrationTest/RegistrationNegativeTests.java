package spaceBurger.tests.registrationTest;

import jdk.jfr.Registered;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import spaceBurger.BasePage;
import spaceBurger.pages.RegistrationPage;
import spaceBurger.tests.TestBase;


public class RegistrationNegativeTests extends TestBase {
   private BasePage basePage;
   private RegistrationPage registrationPage;


   @BeforeMethod
   public void precondition() {
      basePage = new BasePage(driver);
      registrationPage = new RegistrationPage(driver);
      basePage.goToPage(RegistrationPage.registerPageURL());
      basePage.isCurrentPage(RegistrationPage.registerPageURL(), true);
   }

   @Test
   public void loginWithExistingAddressNegativeTests() {
      registrationPage.register("Roman", "Romasp@221gmail.com", "384054R.");
      registrationPage.checkbox("Checkbox");
      registrationPage.generally();
      registrationPage.accept();
      registrationPage.clickRegistrierenButton();
      Assert.assertNotNull(registrationPage.getErrorRegisterExistedUser(),"Text error found");
   }

   @Test
   public void loginWithIncorrectNameNegativeTests() {
      registrationPage.register("", "Romasp22@gmail.com", "384054R.");
      registrationPage.checkbox("Checkbox");
      registrationPage.generally();
      registrationPage.accept();
      registrationPage.clickRegistrierenButton();

   }

   @Test
   public void loginWithIncorrectEmailNegativeTests() {
      registrationPage.register("Roman", "Romasp221gmail.com", "384054R.");
      registrationPage.checkbox("Checkbox");
      registrationPage.generally();
      registrationPage.accept();
      registrationPage.clickRegistrierenButton();

   }

   @Test
   public void loginWithIncorrectPasswordNegativeTests() {
      registrationPage.register("Roman", "Romasp2@gmail.com", "384054");
      registrationPage.checkbox("Checkbox");
      registrationPage.generally();
      registrationPage.accept();
      registrationPage.clickRegistrierenButton();

   }
}


