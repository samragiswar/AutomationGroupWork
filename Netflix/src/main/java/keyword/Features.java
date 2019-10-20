package keyword;

import common.CommonAPI;
import dataSource.DataSource;
import home.HomePage;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import reporting.TestLogger;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class Features extends CommonAPI {


    HomePage homePage= PageFactory.initElements(driver,HomePage.class);

    public void signIn() throws InterruptedException {
        HomePage.getClickOnSignInWebElement();
    }
    public void gifts(){
        homePage.buyGiftCardsClickable();
    }
    public void button30(){
        homePage.try30clickable();
    }
    public void cookies(){
        homePage.cookiesPrefClickable();
    }
    public void selectFeatureBySwitchCase(String featureName) throws InterruptedException {
        switch(featureName){
            case "signIn":
                signIn();
                break;
            case "gifts page":
                gifts();
                break;
            case "button30":
                button30();
                break;
            case "world":
                cookies();
                break;
            default:
                throw new InvalidArgumentException("Invalid features choice");
        }
    }
    public void selectFeatures()throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<String> list = Arrays.asList(DataSource.getDataFromExcelFileForFeaturesChoice());
        for (int i = 0; i < list.size(); i++) {
            selectFeatureBySwitchCase(list.get(i));
        }
    }

}


