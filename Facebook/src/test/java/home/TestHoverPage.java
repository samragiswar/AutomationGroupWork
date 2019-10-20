package home;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHoverPage extends MouseHover{
    MouseHover mouseHover;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        mouseHover = PageFactory.initElements(driver, MouseHover.class); }
    @Test
    public void testMousehover() {
        Actions act = new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Facebook Lite')]"))).perform();
    }
    @AfterMethod
    public void aftermethod() {
        driver.close();
    }}
