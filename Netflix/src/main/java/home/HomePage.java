package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = "//a[@class='authLinks redButton']")
    public static WebElement clickOnSignupBttn;

    public static WebElement getClickOnSignInWebElement() {
        return clickOnSignupBttn;
    }

    public void SinginInput() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getClickOnSignInWebElement().click();
        sleepFor(8);}

    @FindBy(xpath = "//div[@class='our-story-card-footer-text']//span[@class='hero-cta-btn-txt'][contains(text(),'TRY 30 DAYS FREE')]")
    public static WebElement Try30button;

    public void try30clickable() {
        Try30button.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Buy Gift Cards')]")
    public static WebElement buyGiftCards;

    public void buyGiftCardsClickable() {
        buyGiftCards.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Cookie Preferences')]")
    public static WebElement cookiesPrefBttn;

    public void cookiesPrefClickable() {
        cookiesPrefBttn.click();
    }
}

