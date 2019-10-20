package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

public class HomePage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#homepage1-zone-1 > div.l-container > div > div.column.zn__column--idx-0 > ul > li:nth-child(1) > article > a")
    public static WebElement headLineNewsTab;
    public static WebElement clickOnHeadlineNewsTab() {
        return headLineNewsTab;
    }
    public void HeadLineNewIsClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickOnHeadlineNewsTab().click(); }
        @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[2]/ul")
    public static WebElement OptionTab;
    public static WebElement ClickOnOptionTab() {
        return OptionTab;
    }
    public void optionTabClicks() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ClickOnOptionTab().click(); }
        @FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/header/div/div[1]/div/a/span")
    public static WebElement clickOnLiveTv;
    public static WebElement getClickOnLiveTvWebElement() {
        return clickOnLiveTv; }
    @FindBy(how = How.CSS, using = "#nav > header > div > div.Grid-sc-1kcyc0j-0.headerstyles__NavGrid-sc-1vh4dor-3.EHnfs > div > div.Flex-sc-1sqrs56-0.branding__BrandingContainer-drmgik-0.cGmtBu > a")
    public static WebElement logoDisplay;
    public static WebElement getLogoDisplay() {
        return logoDisplay; }
    public void logShouldBeDisplayed() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getLogoDisplay().isDisplayed(); }

        public void liveTvClickInput() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getClickOnLiveTvWebElement().click();
        sleepFor(8); }
        @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[4]/ul")
    public static WebElement clickOnWorldWebElement;
    public static WebElement getClickOnWorldWebElement() {
        return clickOnWorldWebElement; }
    public void clickOnWorldIcon() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getClickOnWorldWebElement().click(); }
    @FindBy(how = How.XPATH, using = "//*[@id=\"homepage3-zone-1\"]/div[6]/div/div[11]/ul")
    public static WebElement clickOnTraveTab;
    public static WebElement getClickOnTravel() {
        return clickOnTraveTab; }
        public void TravelTabClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getClickOnTravel().click(); }
    @FindBy(how = How.CLASS_NAME, using = "search-icon")
    public static WebElement searchButtonWebElement;
    public WebElement getSearchButtonWebElement() {
        return searchButtonWebElement; }
        public void clickOnSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSearchButtonWebElement().click(); }

}
