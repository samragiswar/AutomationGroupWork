package home;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNetflix extends MainPage {
    @BeforeMethod
    public void initialize() {
        MainPage NetflixMainpage = PageFactory.initElements(driver, MainPage.class);
    }

    @Test
    public void Mainpage() {
        driver.get("https://www.netflix.com");
    }

    @Test
    public void SignIn() {
        siginClickable();
    }

    @Test
    public void Try30() {
        try30clickable();
    }

    @Test
    public void faq() {
        FAQClickable();
    }

    @Test
    public void Invester() {
        investorClickable();
    }

    @Test
    public void Wayatowatch() {
        waysToWatchClickbale();
    }

    @Test
    public void Corporate() {
        corporateInfoClick();
    }

    @Test
    public void Netflixorigin() {
        netflixOriginsClickable();
    }

    @Test
    public void Helpcenter() {
        helpCenterClick();
    }

    @Test
    public void Jobfunctionality() {
        jobsfunctionality();
    }

    @Test
    public void Termsofuse() {
        termsOfUseClickable();
    }

    @Test
    public void Contactus() {
        contactUsFunctionality();
    }

    @Test
    public void Account() {
        accountFunctionality();
    }

    @Test
    public void Redeemgiftcard() {
        redeemGiftCardFunctioning();
    }

    @Test
    public void Privacy() {
        privacyFunctionality();
    }

    @Test
    public void Speedtest() {
        speedTestFunctionality();
    }

    @Test
    public void Mediacenter() {
        medicaCenterClcikable();
    }

    @Test
    public void Buygiftcard() {
        buyGiftCardsClickable();
    }

    @Test
    public void Cookies() {
        cookiesPrefClickable();
    }

    @Test
    public void Legalnotice() {
        legalNoticeClick();
    }

    @Test
    public void Footer() {
        footerTopClick();
    }

    @Test
    public void Frequent() {
        frequentSelect();
    }

    @Test
    public void Whatis() {
        whatIsFunctionality();
    }

    @Test
    public void Netflixcost() {
        netflixCostFunctioning();
    }

    @Test
    public void WhereCanIwatch() {
        whereCanIWatchFunctioning();
    }

    @Test
    public void HowtoCancel() {
        howToCancelFunctioning();
    }

    @Test
    public void WhatcanIwatch() {
        whatCanIWatchFunction();
    }

    @Test
    public void Freetrail() {
        freeTrialFunction();
    }

    @Test
    public void Needhelp() {
        siginClickable();
        needHelpFunction();
    }

    @Test
    public void RemenberMe() {
        siginClickable();
        rememberMeClick();
    }

    @Test
    public void SignUp() {
        siginClickable();
        logInWithFBFunction();
    }

    @Test
    public void test32() {
        siginClickable();
        signUpNowClickable();
    }

    @Test
    public void testsuccessfulLogin() {
        siginClickable();
        MainPage siginn = PageFactory.initElements(driver, MainPage.class);
        siginn.logIn("samragigrandonswar@gmail.com", "123456789#");
    }

    @Test
    public void addProfileinput() {
        testsuccessfulLogin();
        addprofile();
    }

    @Test
    public void clicksamragi() {
        testsuccessfulLogin();
        setprofile();
    }

    @Test
    public void clickAbiralshouldtakeinput() {
        testsuccessfulLogin();
        setsecondprofile();
    }

    @Test
    public void clickMomshouldtakeinput() {
        testsuccessfulLogin();
        setthirdprofile();
    }

    @Test
    public void clickDadshouldtakeinput() {
        testsuccessfulLogin();
        setfourthprofile();
    }

    @Test
    public void clickKidsshouldtakeinput() {
        testsuccessfulLogin();
        setfifthprofile();
    }

    @Test
    public void clickSamragihome() {
        testsuccessfulLogin();
        setprofile();
        samragiHomePage();
    }

    @Test
    public void clickSamragiTV() {
        testsuccessfulLogin();
        setprofile();
        samragiTVShow();
    }

    @Test
    public void clickSamragiMovie() {
        testsuccessfulLogin();
        setprofile();
        samragiMovies();
    }

    @Test
    public void clickSamragiRecentTab() {
        testsuccessfulLogin();
        setprofile();
        samragiRecent();
    }

    @Test
    public void clickSamragiMyListTab() {
        testsuccessfulLogin();
        setprofile();
        samragiMyList();
    }

    @Test
    public void clickSamragiNotificationTab() {
        testsuccessfulLogin();
        setprofile();
        samragiNotification();
    }

    @Test
    public void clickSamragiDropDownTab() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
    }

    @Test
    public void clickSamragiDropDown() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
    }

    @Test
    public void FirstProfileDropDown() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        samragiProfileDropDown();
    }

    @Test
    public void FirstProfileDropDownmom() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        samragiProfileDropDownmom();
    }

    @Test
    public void FirstProfileDropDowndvdpagee() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        samragiProfileDropDownDvd();
    }

    @Test
    public void FirstProfileDropDowndad() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        samragiProfileDropDowndom();
    }

    @Test
    public void FirstProfileDropDownkidspage() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        samragiProfileDropDownkid();
    }

    @Test
    public void accountPageFunction() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        samragiAccountPage();
    }

    @Test
    public void samragiHelpCenterPage() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        samragiHelpCenter();
    }

    @Test
    public void signOutOfNetflixSuccess() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        signOutOfNetflix();
    }

    @Test
    public void samragiManagePagefunctioning() {
        testsuccessfulLogin();
        setprofile();
        samragiDropDown();
        samragiManagePage();
    }

    @Test
    public void clickonBobPlaymovie() {
        testsuccessfulLogin();
        setprofile();
        samragiMyList();
        bobMovie();
    }

    @Test
    public void clickonSearchTab() {
        testsuccessfulLogin();
        setprofile();
        searchbutton();
    }

    @Test
    public void clickonPopularTab() {
        testsuccessfulLogin();
        setprofile();
        popular();
    }

    @Test
    public void clickonTrendingTab() {
        testsuccessfulLogin();
        setprofile();
        trending();
    }

    @Test
    public void clickonNetflixOriginalTab() {
        testsuccessfulLogin();
        setprofile();
        netflixoriginal();
    }

    @Test
    public void clickonComediesTab() {
        testsuccessfulLogin();
        setprofile();
        comedy();
    }

    @Test
    public void clickonNewReleaseTab() {
        testsuccessfulLogin();
        setprofile();
        newrelease();
    }

    @Test
    public void clickonExcitingTvShowsTab() {
        testsuccessfulLogin();
        setprofile();
        excitingtvshows();
    }

    @Test
    public void clickonTvDramaTab() {
        testsuccessfulLogin();
        setprofile();
        tvdrama();
    }

    @Test
    public void clickonSocialLinksTab() {
        testsuccessfulLogin();
        setprofile();
        sociallinks();
    }

    @Test
    public void clickMom() {
        testsuccessfulLogin();
        thirdprofile();
    }

    @Test
    public void clickMomhome() {
        testsuccessfulLogin();
        thirdprofile();
        momHomePage();
    }
}