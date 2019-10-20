package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestMainPage extends CommonAPI{
    MainPage mainpage;

    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mainpage = PageFactory.initElements(driver, MainPage.class);
    }
    @Test
    public void testAccountLinkInput(){
        mainpage.accountLinksImput();
    }
}
