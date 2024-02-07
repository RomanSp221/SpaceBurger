package spaceBurger.tests.registrationTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import spaceBurger.BasePage;
import spaceBurger.pages.RegistrationPage;
import spaceBurger.tests.TestBase;


public class RegistrationPositiveTests extends TestBase {
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
   public void loginWithValidDataPositive() {
      registrationPage.register("Romas", "Romasp220@gmail.com", "384054R.");
      registrationPage.checkbox("Checkbox");
      registrationPage.generally();
      registrationPage.accept();
      registrationPage.clickRegistrierenButton();

   }
}


