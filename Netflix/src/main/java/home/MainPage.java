package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class MainPage extends CommonAPI {
    @FindBy(xpath = "//a[@class='authLinks redButton']")
    public static WebElement signInbttn;

    public void siginClickable() {
        signInbttn.click();
    }

    @FindBy(xpath = "//div[@class='our-story-card-footer-text']//span[@class='hero-cta-btn-txt'][contains(text(),'TRY 30 DAYS FREE')]")
    public static WebElement try30bttn;

    public void try30clickable() {
        try30bttn.click();
    }

    @FindBy(xpath = " //span[contains(text(),'FAQ')]")
    public static WebElement FAQbttn;

    public void FAQClickable() {
        FAQbttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Investor Relations')]")
    public static WebElement investorsRelations;

    public void investorClickable() {
        investorsRelations.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Ways to Watch')]")
    public static WebElement waysToWatchbttn;

    public void waysToWatchClickbale() {
        waysToWatchbttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Corporate Information')]")
    public static WebElement corporateInfobttn;

    public void corporateInfoClick() {
        corporateInfobttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Netflix Originals')]")
    public static WebElement netflixOrigins;

    public void netflixOriginsClickable() {
        netflixOrigins.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Help Center')]")
    public static WebElement helpCenterBttn;

    public void helpCenterClick() {
        helpCenterBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Jobs')]")
    public static WebElement jobsBttn;

    public void jobsfunctionality() {
        jobsBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Terms of Use')]")
    public static WebElement termsOfUseBttn;

    public void termsOfUseClickable() {
        termsOfUseBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Contact Us')]")
    public static WebElement contactUsBttn;

    public void contactUsFunctionality() {
        contactUsBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    public static WebElement accountBttn;

    public void accountFunctionality() {
        accountBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Redeem Gift Cards')]")
    public static WebElement redeemGiftCardBttn;

    public void redeemGiftCardFunctioning() {
        redeemGiftCardBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Privacy')]")
    public static WebElement privacyBttn;

    public void privacyFunctionality() {
        privacyBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Speed Test')]")
    public static WebElement speedTestBttn;

    public void speedTestFunctionality() {
        speedTestBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Media Center')]")
    public static WebElement medicaCenterBttn;

    public void medicaCenterClcikable() {
        medicaCenterBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Buy Gift Cards')]")
    public static WebElement buyGiftCardsBttn;

    public void buyGiftCardsClickable() {
        buyGiftCardsBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Cookie Preferences')]")
    public static WebElement cookiesPrefBttn;

    public void cookiesPrefClickable() {
        cookiesPrefBttn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Legal Notices')]")
    public static WebElement legalNoticeBttn;

    public void legalNoticeClick() {
        legalNoticeBttn.click();
    }

    @FindBy(xpath = "//a[@class='footer-top-a']")
    public static WebElement footerTopBttn;

    public void footerTopClick() {
        footerTopBttn.click();
    }

    @FindBy(xpath = "//h1[contains(text(),'Frequently Asked Questions')]")
    public static WebElement frequent;

    public void frequentSelect() {
        frequent.isSelected();
    }

    @FindBy(xpath = "//button[contains(text(),'What is Netflix?')]")
    public static WebElement whatIsNetflix;

    public void whatIsFunctionality() {
        whatIsNetflix.click();
    }

    @FindBy(xpath = "//button[contains(text(),'How much does Netflix cost?')]")
    public static WebElement netflixCost;

    public void netflixCostFunctioning() {
        netflixCost.click();
    }

    @FindBy(xpath = "//button[contains(text(),'Where can I watch?')]")
    public static WebElement whereCanIWatch;

    public void whereCanIWatchFunctioning() {
        whereCanIWatch.click();
    }

    @FindBy(xpath = "//button[contains(text(),'How do I cancel?')]")
    public static WebElement cancelBttn;

    public void howToCancelFunctioning() {
        cancelBttn.click();
    }

    @FindBy(xpath = "//button[contains(text(),'What can I watch on Netflix?')]")
    public static WebElement watchOnNetflixbtth;

    public void whatCanIWatchFunction() {
        watchOnNetflixbtth.click();
    }

    @FindBy(xpath = "//button[contains(text(),'How does the free trial work?')]")
    public static WebElement freeTrialBttn;

    public void freeTrialFunction() {
        freeTrialBttn.click();
    }

    @FindBy(xpath = "//a[@class='login-help-link']")
    public static WebElement needHelp;

    public void needHelpFunction() {
        needHelp.click();
    }

    @FindBy(xpath = "//span[@class='login-remember-me-label-text']")
    public static WebElement rememberMe;

    public void rememberMeClick() {
        rememberMe.click();
    }

    @FindBy(xpath = "//span[@class='fbBtnText']")
    public static WebElement loginWithFBbttn;

    public void logInWithFBFunction() {
        loginWithFBbttn.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Sign up now')]")
    public static WebElement signUpNowBttn;

    public void signUpNowClickable() {
        signUpNowBttn.click();
    }

    @FindBy(id = "id_userLoginId")
    WebElement emailTextField;
    @FindBy(id = "id_password")
    WebElement passTextField;
    @FindBy(xpath = "//button[contains(text(),'Sign In')]")
    WebElement signIn;

    public void logIn(String email, String password) {
        this.emailTextField.sendKeys(email);
        this.passTextField.sendKeys(password);
        this.signIn.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Add Profile')]")
    public static WebElement aDDProfiles;

    public void addprofile() {
        aDDProfiles.click();
    }

    @FindBy(xpath = "//span[contains(text(),'samragi')]")
    public static WebElement clickprofile;

    public void setprofile() {
        clickprofile.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Abiral')]")
    public static WebElement clickAbiralProfile;

    public void setsecondprofile() {
        clickAbiralProfile.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Mom')]")
    public static WebElement clickMomProfile;

    public void setthirdprofile() {
        clickMomProfile.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Dad')]")
    public static WebElement clickDadProfile;

    public void setfourthprofile() {
        clickDadProfile.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Kids')]")
    public static WebElement clickKidsProfile;

    public void setfifthprofile() {
        clickKidsProfile.click();
    }

    @FindBy(xpath = "//a[@class='current active']")
    public static WebElement firstProfilePage;

    public void samragiHomePage() {
        firstProfilePage.click();
    }

    @FindBy(xpath = "//a[contains(text(),'TV Shows')]")
    public static WebElement firstProfileTVShow;

    public void samragiTVShow() {
        firstProfileTVShow.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Movies')]")
    public static WebElement firstProfileMovies;

    public void samragiMovies() {
        firstProfileMovies.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Recently Added')]")
    public static WebElement firstProfileRecentlyAdded;

    public void samragiRecent() {
        firstProfileRecentlyAdded.click();
    }

    @FindBy(xpath = "//a[contains(text(),'My List')]")
    public static WebElement firstProfileMyList;

    public void samragiMyList() {
        firstProfileMyList.click();
    }

    @FindBy(xpath = "//span[@class='icon-button-notification']")
    public static WebElement firstProfileNotification;

    public void samragiNotification() {
        firstProfileNotification.click();
    }

    @FindBy(xpath = "//div[@class='account-dropdown-button']")
    public static WebElement firstProfileDropDownButton;

    public void samragiDropDown() {
        firstProfileDropDownButton.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Abiral')]")
    public static WebElement samragiProfileDropDownAbiral;

    public void samragiProfileDropDown() {
        samragiProfileDropDownAbiral.click();

    }

    @FindBy(xpath = "//span[contains(text(),'Mom')]")
    public static WebElement samragiProfileDropDownMom;

    public void samragiProfileDropDownmom() {
        samragiProfileDropDownMom.click();
    }

    @FindBy(xpath = "//li[@class='sub-menu-item dvd-link']//a[contains(text(),'DVD')]")
    public static WebElement samragiProfileDropDownDVD;

    public void samragiProfileDropDownDvd() {
        samragiProfileDropDownDVD.click();

    }

    @FindBy(xpath = "//span[contains(text(),'Dad')]")
    public static WebElement samragiProfileDropDownDad;

    public void samragiProfileDropDowndom() {
        samragiProfileDropDownDad.click();
    }

    @FindBy(xpath = "//span[contains(text(),'Kids')]")
    public static WebElement samragiProfileDropDownKids;

    public void samragiProfileDropDownkid() {
        samragiProfileDropDownKids.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Account')]")
    public static WebElement accountPageClick;

    public void samragiAccountPage() {
        accountPageClick.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Help Center')]")
    public static WebElement helpCenter;

    public void samragiHelpCenter() {
        helpCenter.click();
    }

    @FindBy(xpath = "//a[contains(text(),'Sign out of Netflix')]")
    public static WebElement signOut;

    public void signOutOfNetflix() {
        signOut.click();
    }

    @FindBy(xpath = "//div[@class='account-dropdown-button']")
    public static WebElement managePSamragi;

    public void samragiManagePage() {
        managePSamragi.click();
    }

    @FindBy(xpath = "//a[@class='bob-jaw-hitzone']")
    public static WebElement bobPlaymovie;

    public void bobMovie() {
        bobPlaymovie.click();
    }

    @FindBy(xpath = "//span[@class='icon-search']")
    public static WebElement samragisearchtab;

    public void searchbutton() {
        samragisearchtab.click();
    }

    @FindBy(className = "row-header-title")
    public static WebElement samragipopulartab;

    public void popular() {
        samragipopulartab.click();
    }

    @FindBy(className = "row-header-title")
    public static WebElement samragitrendingnowtab;

    public void trending() {
        samragitrendingnowtab.click();
    }

    @FindBy(className = "row-header-title")
    public static WebElement samraginetflixoriginaltab;

    public void netflixoriginal() {
        samraginetflixoriginaltab.click();
    }
    @FindBy(className = "row-header-title")
    public static WebElement samragicomediestab;

    public void comedy() {
        samragicomediestab.click();
    }
    @FindBy(className = "row-header-title")
    public static WebElement samraginewreleasestab;

    public void newrelease() {
        samraginewreleasestab.click();
    }
    @FindBy(className = "row-header-title")
    public static WebElement samragiexcitingtvshowstab;

    public void excitingtvshows() {
        samragiexcitingtvshowstab.click();
    }
    @FindBy(className = "row-header-title")
    public static WebElement samragitvdramastab;

    public void tvdrama() {
        samragitvdramastab.click();
    }
    @FindBy(xpath = "//div[@class='social-links']//a[1]")
    public static WebElement samragisociallinkstab;

    public void sociallinks() {
        samragisociallinkstab.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Mom')]")
    public static WebElement selectMomProfile;

    public void thirdprofile() {
        selectMomProfile.click();
    }
    @FindBy(xpath = "//span[contains(text(),'Mom')]")
    public static WebElement thirdProfilePage;

    public void momHomePage() {
        thirdProfilePage.click();
    }
}