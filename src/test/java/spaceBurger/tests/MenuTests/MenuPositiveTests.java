package spaceBurger.tests.MenuTests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import spaceBurger.BasePage;
import spaceBurger.pages.MenuPage;
import spaceBurger.tests.TestBase;

public class MenuPositiveTests extends TestBase {
   private BasePage basePage;
   private MenuPage menuPage;

   @BeforeMethod
   public void precondition() {
      basePage = new BasePage(driver);
      menuPage = new MenuPage(driver);
      basePage.goToPage(MenuPage.MenupageURL());
      basePage.isCurrentPage(MenuPage.MenupageURL(), true);
   }

   @Test
   public void MenuTests() {
      menuPage.MenupageURL();
      menuPage.clickmenuSpanButton();
      basePage.isCurrentPage(MenuPage.MenupageURL(), true);

   }

}
