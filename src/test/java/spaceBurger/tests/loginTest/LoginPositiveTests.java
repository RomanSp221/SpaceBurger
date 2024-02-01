package spaceBurger.tests.loginTest;

import spaceBurger.BasePage;
import spaceBurger.pages.LoginPage;
import spaceBurger.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPositiveTests extends TestBase {

   private BasePage basePage;
   private LoginPage loginPage;

   @BeforeMethod
   public void precondition() {
      basePage = new BasePage(driver);
      loginPage = new LoginPage(driver);
      basePage.goToPage(LoginPage.loginPageURL());
      basePage.isCurrentPage(LoginPage.loginPageURL(), true);
   }

   @Test
   public void loginWithValidDataPositive() {
      loginPage.login("Romasp221@gmail.com", "384054R.");
      loginPage.clickEinloggenButton();
   }
}
