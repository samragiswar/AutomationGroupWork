package home;

import common.CommonAPI;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;

public class MainPage extends CommonAPI {
    @FindBy(how = How.CLASS_NAME, using = "Header__section")
    public static WebElement headerIcon;

    public static WebElement headerClick() {
        return headerIcon;
    }

    public void headergetText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        String text = headerClick().getText();
        System.out.println(text);
    }

    @FindBy(how = How.CSS, using = "#mount > div > div.StickyTop__isStickyAd > div.Header__container.Header__isShown > div > div > div.Header__logo")
    public static WebElement headerLogo;

    public static WebElement headerLogoPresent() {
        return headerLogo;
    }

    public void headerLogoDisplay() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        headerLogoPresent().isDisplayed();
    }


}