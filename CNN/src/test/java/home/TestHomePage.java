package home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {
    HomePage homePage;
    @BeforeMethod
    public void initElements() {
        homePage = PageFactory.initElements(driver, HomePage.class); }
    @Test
    public void testClickOnTravelIcon() {
        homePage.TravelTabClickable(); }
    @Test
    public void HeadLinesNewsCLicks() {
        homePage.HeadLineNewIsClickable(); }
    @Test
    public void testClickOnWorldIcon() {
        homePage.clickOnWorldIcon(); }
    @Test
    public void OtionTabFunction() {
        homePage.optionTabClicks(); }
    @Test
    public void LogoShouldBeDisplayedSuccessfully() {
        homePage.logShouldBeDisplayed(); }
    @Test
    public void LiveTvShouldBeClickedandTakeInput() throws InterruptedException {
        homePage.liveTvClickInput(); }
    @Test
    public void testSearchButton() {
        homePage.clickOnSearchButton(); }}