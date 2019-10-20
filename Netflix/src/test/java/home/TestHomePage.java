package home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    HomePage homePage;
    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test
    public void testClickOnSigninInput() {
        homePage.getClickOnSignInWebElement();
    }
@Test
    public void tryButton30click(){
        homePage.try30clickable();
}
@Test
    public void buyGiftCardsClickablefunctions(){
        homePage.buyGiftCardsClickable();
}
    @Test
    public void cookies() {
        homePage.cookiesPrefClickable();
    }
}
