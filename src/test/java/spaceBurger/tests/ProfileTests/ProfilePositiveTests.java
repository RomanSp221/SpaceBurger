package spaceBurger.tests.ProfileTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import spaceBurger.BasePage;
import spaceBurger.pages.ProfilePage;
import spaceBurger.pages.RegistrationPage;
import spaceBurger.tests.TestBase;

import java.time.Duration;

public class ProfilePositiveTests extends TestBase {
   private BasePage basePage;
   private ProfilePage profilePage;
   private static final Duration WAIT_SECONDS = Duration.ofSeconds(10);

   @BeforeMethod
   public void precondition() {
      basePage = new BasePage(driver);
      profilePage = new ProfilePage(driver);
      basePage.goToPage(RegistrationPage.registerPageURL());
      basePage.isCurrentPage(RegistrationPage.registerPageURL(), true);
   }

   @Test
   public void ProfileFillinginfields() {
      profilePage.clickhiDefaultLinkButton();
   }
}
