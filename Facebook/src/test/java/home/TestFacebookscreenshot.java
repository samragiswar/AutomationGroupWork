package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestFacebookscreenshot extends FacebookScreenShot{
    FacebookScreenShot facebookScreenShot;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        facebookScreenShot = PageFactory.initElements(driver, FacebookScreenShot.class); }
    @Test
    public void test(){
        signInnn(); }
        @Test
    public void LoginCaptured(){
        LogonCapture(); }
}
