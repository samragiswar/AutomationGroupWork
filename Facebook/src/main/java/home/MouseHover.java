package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MouseHover extends CommonAPI {
    @FindBy(xpath = "//a[contains(text(),'Facebook Lite')]")
    public static WebElement FBLite;

    @FindBy(xpath ="//button[@id='u_0_19']")
    public static WebElement signUpbttnn;
}
