package spaceBurger.tests.loginTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import spaceBurger.BasePage;
import spaceBurger.HomePage;
import spaceBurger.pages.LoginPage;
import spaceBurger.pages.LogoutPage;
import spaceBurger.tests.TestBase;

public class LogoutNegativeTests extends TestBase {

   private BasePage basePage;
   private LoginPage loginPage;
   private LogoutPage logoutPage;

   @BeforeMethod
   public void precondition() {
      basePage = new BasePage(driver);
      loginPage = new LoginPage(driver);
      logoutPage = new LogoutPage(driver);
      basePage.goToPage(LoginPage.loginPageURL());
      basePage.isCurrentPage(LoginPage.loginPageURL(), true);

   }

   @Test
   public void logoutPositiveTests() {
      loginPage.login("Romasp221@gmail.com", "384054R.");
      loginPage.clickEinloggenButton();
      logoutPage.clickabmeldenButton();
      basePage.isCurrentPage(HomePage.homePageURL(), false);
   }
}
