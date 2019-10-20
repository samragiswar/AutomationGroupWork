package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMainPage extends CommonAPI {
    HomePage homePage;
    MainPage mainPage;
    SearchPage searchPage;
    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        mainPage = PageFactory.initElements(driver, MainPage.class);
        homePage.TravelTabClickable(); }
        @Test
    public void HeaderShouldTakeinput() {
        mainPage.headergetText(); }
    @Test
    public void headerLogoIsDisplayedSuccessfullly() {
        mainPage.headerLogoDisplay(); }
    @Test
    public void testSearchList() throws Exception {
        searchPage.searchListAndSubmitButton(); }
}