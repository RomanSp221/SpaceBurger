package spaceBurger.tests.loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import spaceBurger.BasePage;
import spaceBurger.HomePage;
import spaceBurger.pages.CredentialsSigninPage;
import spaceBurger.pages.LoginPage;
import spaceBurger.tests.TestBase;

import java.time.Duration;

public class LoginNegativeTests extends TestBase {

   private BasePage basePage;
   private LoginPage loginPage;
   private CredentialsSigninPage credentialsSigninPage;
   private static final Duration WAIT_SECONDS = Duration.ofSeconds(10);


   @BeforeMethod
   public void precondition() {
      basePage = new BasePage(driver);
      loginPage = new LoginPage(driver);
      credentialsSigninPage = new CredentialsSigninPage(driver);
      basePage.goToPage(LoginPage.loginPageURL());
      basePage.isCurrentPage(LoginPage.loginPageURL(), true);

   }

   @Test
   public void loginWithincorrectEmailNegativeTests() {
      loginPage.login("Romasp221gmail.com", "384054R.");
      loginPage.clickEinloggenButton();
      basePage.isCurrentPage(HomePage.homePageURL(), false);

   }

   @Test
   public void loginUnregisterEmailNegativeTests() {
      loginPage.login("unregister@122gmail.com", "384054R.");
      loginPage.clickEinloggenButton();
      WebElement errorMessage = driver.findElement(By.className("error"));
      Assert.assertTrue(errorMessage.isDisplayed(), "Sign in failed. Check the details you provided are correct.");
   }

   @Test
   public void loginWithoutEmailNegativeTests() {
      loginPage.login("", "384054R.");
      loginPage.clickEinloggenButton();

      WebDriverWait wait = new WebDriverWait(driver, WAIT_SECONDS);
      wait.until(ExpectedConditions.urlToBe(CredentialsSigninPage.credentialsSigninPageURL()));
   }

   @Test
   public void loginWithoutPasswordNegativeTests() {
      loginPage.login("Romasp@221gmail.com", "");
      loginPage.clickEinloggenButton();

      WebDriverWait wait = new WebDriverWait(driver, WAIT_SECONDS);
      wait.until(ExpectedConditions.urlToBe(CredentialsSigninPage.credentialsSigninPageURL()));
   }
}