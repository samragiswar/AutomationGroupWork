package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestLoginPage extends CommonAPI{
    LoginPage login;
    @BeforeMethod
    public void init(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        login = PageFactory.initElements(driver, LoginPage.class); }
    //login = PageFactory.initElements(driver, LoginPage.class);
    @Test //loginwithworngcred
    public void checkLoginNegetive() {
        login.loginNegative();
    }

}
