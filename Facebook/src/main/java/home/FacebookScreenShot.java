package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookScreenShot extends CommonAPI {


    @FindBy(xpath = "//*[@id=\"email\"]") //passed
    public static WebElement username;
    public void signInnn() {
        username.sendKeys("samragigrandonswar@gmail.com");
        try {
            takeScreenShot();
        } catch (Exception e) {
        }
    }
    @FindBy(xpath = "//*[@id=\"u_0_2\"]") //passed
    public static WebElement logonCapture;
    public void LogonCapture(){
        logonCapture.click();
        try {
            takeScreenShot();
        } catch (Exception e) {
        }
    }
}

