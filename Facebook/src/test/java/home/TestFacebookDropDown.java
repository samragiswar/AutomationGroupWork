package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestFacebookDropDown extends FacebookDropDown{
    FacebookDropDown facebookDD;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        facebookDD = PageFactory.initElements(driver, FacebookDropDown.class); }
    @Test
    public void dropDownisSelected () {
        signin();
        navigationLB(); }}
