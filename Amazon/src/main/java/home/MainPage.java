package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class MainPage extends CommonAPI {
    @FindBy(xpath = "//a[@id='nav-link-accountList']//span[@class='nav-icon nav-arrow']")
    public static WebElement accountLinks;
    public void accountLinksImput() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        accountLinks.click();
    }

}
