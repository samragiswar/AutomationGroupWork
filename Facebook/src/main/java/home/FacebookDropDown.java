package home;
import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;
public class FacebookDropDown extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"email\"]") //passed
    public static WebElement username;
    @FindBy(xpath = "//*[@id=\"pass\"]")  //passed
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\"u_0_2\"]") //passed
    public static WebElement logInBttn;

    public void signin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        username.sendKeys("samragigrandonswar@gmail.com");
        password.sendKeys("123456789#");
        logInBttn.click(); }
    @FindBy(id = "userNavigationLabel")
    public static WebElement Dropdown;
    public void navigationLB() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Dropdown.isSelected(); }
}
