package home;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class LoginPage extends CommonAPI{
    @FindBy(xpath = "//*[@id=\"email\"]") //passed
    public static WebElement username;
    @FindBy(xpath = "//*[@id=\"pass\"]")  //passed
    public static WebElement password;
    @FindBy(xpath = "//*[@id=\"u_0_2\"]") //passed
    public static WebElement logInBttn;
    @FindBy(xpath = "//*[@id=\"js_0\"]") //passed
    public static WebElement addPictureBttn;
    @FindBy(xpath = "//div[contains(text(),'News Feed')]") //passed
    public static WebElement newsFeedBttn;
    @FindBy(xpath = "//*[@id=\"js_5\"]") ////passed (should come in as failed)
    public static WebElement status;
    @FindBy(xpath = "//*[@id=\"js_dr\"]") //passed (should come in as failed)
    public static WebElement statusPostBttn;
    @FindBy(xpath = "//button[@class='_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97']") //passed (should come in as failed)
    public static WebElement searchbutton;
    @FindBy(xpath = "//a[contains(text(),'Messenger')]")  //passed
    public static WebElement messengerbttn;
    @FindBy(xpath = "//a[contains(text(),'Facebook Lite')]")  //passed
    public static WebElement facebookLite;
    @FindBy(xpath = "//a[contains(text(),'Sign Up')]") //Passed
    public static WebElement signupbttn;
    @FindBy(xpath = "//a[contains(text(),'Home')]")  //passed
    public static WebElement homePageBttn;
    @FindBy(xpath = "//a[@class='_2s25 _606w']") //passed
    public static WebElement samProfileBttn;
    @FindBy(xpath = "//div[@class='_2n_9 f_click']") //Passed
    public static WebElement notifications;
    @FindBy(xpath = "//a[@class='_7kfu']") //passed
    public static WebElement AddToStory;
    @FindBy(xpath = "//div[contains(text(),'Welcome')]") //passed
    public static WebElement welcometab;
    @FindBy(xpath = "//a[@class='_y-c']") //passed
    public static WebElement seeMore;
    @FindBy(xpath = " //div[@class='linkWrap noCount'][contains(text(),'Events')]") //Passed
    public static WebElement eventPage;
    @FindBy(xpath = "//*[@id=\"navItem_303257506544370\"]") //passed
    public static WebElement memoriesPage;
    @FindBy(xpath = "//*[@id=\"navItem_280033845760645\"]")
    public static WebElement recentAdActivity;
    @FindBy(xpath = "//div[contains(text(),'Oculus')]") //Passed
    public static WebElement oculusPage;
    @FindBy(xpath = "//div[contains(text(),'Crisis Response')]") //Passed
    public static WebElement crisisResponse;
    @FindBy(xpath = "//div[contains(text(),'Weather')]") //Passed
    public static WebElement weatherPage;
    @FindBy(xpath = "//div[contains(text(),'Saved')]") //Passed
    public static WebElement savedPage;
    @FindBy(xpath = "//div[contains(text(),'Offers')]") //Passed
    public static WebElement offersPage;
    @FindBy(xpath = "//div[@class='linkWrap hasCount']") //Passed
    public static WebElement townHall;
    @FindBy(xpath = "//div[contains(text(),'Jobs')]") //Passed
    public static WebElement jobsPage;
    @FindBy(xpath = "//div[contains(text(),'Movies')]")//Passed
    public static WebElement moviesPage;
    @FindBy(xpath = "//div[contains(text(),'Gaming Video')]") //Passed
    public static WebElement gamingVideo;
    @FindBy(xpath = "/div[@class='linkWrap noCount'][contains(text(),'Recommendations')]") //Passed
    public static WebElement recommendations;
    @FindBy(xpath = "//div[contains(text(),'Fundraisers')]") //Passed
    public static WebElement fundraisers;
    @FindBy(xpath = "//div[contains(text(),'Videos on Watch')]") //passed
    public static WebElement videosOnWatch;
    @FindBy(xpath = "//a[@class='_41ug']") //Passed
    public static WebElement addChoices;
    @FindBy(xpath = "//a[@class='_8esh']")  //Passed
    public static WebElement creatapage;
    @FindBy(xpath = "//a[@id='findFriendsNav']")  //Passed
    public static WebElement finFriends;
    @FindBy(xpath = "//a[contains(text(),'People')]") //Passed
    public static WebElement peoplepage;
    @FindBy(xpath = "//a[contains(text(),'Pages')]") //Passed
    public static WebElement pages;
    @FindBy(xpath = " //a[contains(text(),'Page Categories')]")
    public static WebElement pageCategories;
    @FindBy(xpath = "//a[contains(text(),'Places')]") //Passed
    public static WebElement placespage;
    @FindBy(xpath = "//a[contains(text(),'Games')]") //Passed
    public static WebElement gamespage;
    @FindBy(xpath = "//a[contains(text(),'Locations')]") //Passed
    public static WebElement locationsPages;
    @FindBy(xpath = "//a[contains(text(),'Marketplace')]") //Passed
    public static WebElement marketplace;
    @FindBy(xpath = "//a[contains(text(),'Groups')]") //Passed
    public static WebElement groups;
    @FindBy(xpath = " //a[contains(text(),'Instagram')]") //Passed
    public static WebElement instagramPAge;
    @FindBy(xpath = "//a[contains(text(),'Local')]") //Passed
    public static WebElement localPage;
    @FindBy(xpath = "//a[contains(text(),'Fundraisers')]")//Passed
    public static WebElement fundraisersPage;
    @FindBy(xpath = "//a[contains(text(),'Services')]")//Passed
    public static WebElement servicesPage;
    @FindBy(xpath = "//a[contains(text(),'About')]")//Passed
    public static WebElement aboutPage;
    @FindBy(xpath = "//a[contains(text(),'Create Ad')]")//Passed
    public static WebElement createAd;
    @FindBy(xpath = "//a[contains(text(),'Create Page')]")//Passed
    public static WebElement createPage;
    @FindBy(xpath = "//a[contains(text(),'Developers')]")//Passed
    public static WebElement developers;
    @FindBy(xpath = "//a[contains(text(),'Careers')]")//Passed
    public static WebElement careers;
    @FindBy(xpath = "//a[contains(text(),'Privacy')]")//Passed
    public static WebElement privacyP;
    @FindBy(xpath = "//a[contains(text(),'Help')]")//Passed
    public static WebElement helpPage;
    @FindBy(xpath = " //a[contains(text(),'Italiano')]")//Passed
    public static WebElement italianoTab;
    @FindBy(xpath = " //a[contains(text(),'Deutsch')]")//Passed
    public static WebElement deutschTab;
    @FindBy(xpath = " //a[contains(text(),'Português (Brasil)')]")//Passed
    public static WebElement brasilTab;
    @FindBy(xpath = " //a[contains(text(),'Français (France)')]")//Passed
    public static WebElement franceTab;
    @FindBy(xpath = "//a[contains(text(),'Español')]") //Passed
    public static WebElement espanolTab;
    @FindBy(xpath = "//a[@id='privacy-link']") //Passed
    public static WebElement dataPolicy;
    @FindBy(xpath = "//a[@id='terms-link']")  //Passed
    public static WebElement termsLink;
    @FindBy(xpath = "//a[@id='cookie-use-link']") //Passed
    public static WebElement cookiesPolicy;
    @FindBy(xpath = "//a[contains(text(),'Forgot account?')]") //Passed
    public static WebElement forgotAccount;
    @FindBy(xpath = "//a[@class='_42ft _4jy0 _583_ _4jy3 _4jy2 selected _51sy']")
    public static WebElement raiseMoney;
    @FindBy(xpath = "//span[contains(text(),'Animals')]")
    public static WebElement aminalsCatageory;
    @FindBy(xpath = "//span[contains(text(),'Arts and Culture')]")
    public static WebElement artsAndCulture;
    @FindBy(xpath = "//span[contains(text(),'Community and Social Action')]")
    public static WebElement communitySocialAction;
    @FindBy(xpath = "//span[contains(text(),'Crisis Relief')]")
    public static WebElement crisisReliefPafe;
    @FindBy(xpath = "//span[contains(text(),'Faith')]")
    public static WebElement faithPage;
    @FindBy(xpath = "//div[contains(text(),'The Jenna Reynoso Memorial Scholarship Fund')]")
    public static WebElement scholarshipFundJenna;
    @FindBy(xpath = "//div[contains(text(),'Send Jem to Brazil')]")
    public static WebElement sendJemToBrazilfunding;
    @FindBy(xpath = "//a[@class='_42ft _4jy0 _4cd0 _4jy4 _517h _51sy']")
    public static WebElement shareDonationPage;
    @FindBy(xpath = "//a[contains(text(),'Discover Groups - Find groups based on your intere')]")
    public static WebElement discoverGroup;

    public void discoverGroupOfPeople() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        discoverGroup.click();
    }

    public void shareDonationPageOfFamilyMove() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        shareDonationPage.click();
    }

    public void sendJemToBrazil() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sendJemToBrazilfunding.click();
    }

    public void JennasScholarshipPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        scholarshipFundJenna.click();
    }

    public void faithPageFunctioning() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        faithPage.click();
    }

    public void artsCutlureFunctioning() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        artsAndCulture.click();
    }

    public void CommunityandSocialAction() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        communitySocialAction.click();
    }

    public void crisisRelifPagefunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        crisisReliefPafe.click();
    }

    public void animalPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aminalsCatageory.click();
    }

    public void raiseMoneyPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        raiseMoney.click();
    }

    public void clickOnFindFriends() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        finFriends.isSelected();
    }

    public void clickOnCreateaPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        creatapage.click();
    }

    public void clickOnAddChoices() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        addChoices.click();
    }

    public void signin() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        username.sendKeys("samragigrandonswar@gmail.com");
        password.sendKeys("123456789#");
        logInBttn.click();
    }

    public void clickOnAddPictureButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        addPictureBttn.click();
    }

    public void clickOnNewsFeed() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        newsFeedBttn.isSelected();
    }

    public void clikcOnSearchbttn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchbutton.click();
    }

    public void clickonMessengerbttn() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        messengerbttn.click();
    }

    public void clickonFacebookLite() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        facebookLite.click();
    }

    public void clickOnSignup() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signupbttn.click();
    }

    public void homePageMain() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        homePageBttn.isSelected();
    }

    public void samProfile() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        samProfileBttn.isSelected();
    }

    public void checkNotifications() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        notifications.isSelected();
    }

    public void addToStory() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AddToStory.isSelected();
    }

    public void welcometabselected() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        welcometab.isSelected();
    }

    public void seeMoreisSelected() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        seeMore.isSelected();
    }

    public void eventPageisSelected() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        eventPage.isSelected();
    }

    public void memoriesPageClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        memoriesPage.click();
    }

    public void recentAddActivityClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        recentAdActivity.click();
    }

    public void oculusisSelected() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        oculusPage.isSelected();
    }

    public void crisisResponseSelected() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        crisisResponse.isSelected();
    }
    public void savedSelected() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        savedPage.isSelected();
    }

    public void offers() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        offersPage.isSelected();
    }

    public void townHallPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        townHall.isSelected();
    }

    public void jobsPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        jobsPage.isSelected();
    }

    public void moviesPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        moviesPage.isSelected();
    }

    public void gamingVideo() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        gamingVideo.isSelected();
    }

    public void recommendations() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        recommendations.isSelected();
    }

    public void fundraisers() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fundraisers.isSelected();
    }

    public void peoplePageClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        peoplepage.click();
    }

    public void pagesClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pages.click();
    }

    public void pageCategoriesClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        pageCategories.click();
    }

    public void placesClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        placespage.click();
    }

    public void gamesClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        gamespage.click();
    }

    public void locationClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        locationsPages.click();
    }

    public void marketPlaceClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marketplace.click();
    }

    public void groupsClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        groups.click();
    }

    public void instagramPageClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        instagramPAge.click();
    }

    public void localPageClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        localPage.click();
    }

    public void fundraisersClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fundraisersPage.click();
    }

    public void servicesClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        servicesPage.click();
    }

    public void aboutClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        aboutPage.click();
    }

    public void createAddClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        createAd.click();
    }

    public void createPageClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        createPage.click();
    }

    public void developersClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        developers.click();
    }

    public void careersClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        careers.click();
    }

    public void privacyClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        privacyP.click();
    }

    public void helpClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpPage.click();
    }

    public void videosOnWatchClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        videosOnWatch.isSelected();
    }

    public void italianoTabClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        italianoTab.click();
    }

    public void deutschClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        deutschTab.click();
    }

    public void brasilClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        brasilTab.click();
    }

    public void franceClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        franceTab.click();
    }

    public void espanolClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        espanolTab.click();
    }

    public void dataPolicyClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        dataPolicy.click();
    }

    public void termsLinkFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        termsLink.click();
    }

    public void cookiesPolicyClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        cookiesPolicy.click();
    }
    public void forgotAccountFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        forgotAccount.click(); }
    public void loginNegative() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        username.sendKeys("samragigrandonswar@gmail.com");
        password.sendKeys("123llll456789#");
        logInBttn.click(); }
    public void loginPositive() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        username.sendKeys("samragigrandonswar@gmail.com");
        password.sendKeys("123llll456789#");
        logInBttn.click(); }
    @FindBy(xpath = "//i[@class='fb_logo img sp_z3EmYTfbUVU sx_6a42ec']")
    public static WebElement facebookLogo;
    public void checkfacebookLogo() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        facebookLogo.click(); }
    @FindBy(xpath = "//a[contains(text(),'Advertising/Marketing')]")
    public static WebElement ADandmark;
    public void AdvertisingandMArketing() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        ADandmark.click(); }
    @FindBy(xpath = "//a[contains(text(),'Businesses')]")
    public static WebElement businessPage;

    public void businessPageisClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        businessPage.click(); }
    @FindBy(xpath = "//a[contains(text(),'Advertising Agency')]")
    public static WebElement advertAgency;

    public void advertAgencyClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        advertAgency.click(); }
    @FindBy(xpath = "//a[contains(text(),'Copywriting Service')]")
    public static WebElement copywritingService;
    public void copyWritingServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        copywritingService.click(); }
    @FindBy(xpath = "//a[contains(text(),'Internet Marketing Service')]")
    public static WebElement internetMarketingService;
    public void internetMarketingServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        internetMarketingService.click(); }
    @FindBy(xpath = "//a[contains(text(),'Market Research Consultant')]")
    public static WebElement marketResearchConsultant;
    public void marketResearchPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marketResearchConsultant.click(); }
    @FindBy(xpath = "//a[contains(text(),'Marketing Agency')]")
    public static WebElement marketingAgency;
    public void marketingAgencyPageFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        marketingAgency.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Merchandising Service')]")
    public static WebElement merchandisingServicesPage;

    public void merchandisingServicesPageFunctioning() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        merchandisingServicesPage.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Public Relations Agency')]")
    public static WebElement publicRelationsAgency;
    public void publicRelationsAgencyShouldClickandTakeInput() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        publicRelationsAgency.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Social Media Agency')]")
    public static WebElement socialMediaAgency;
    public void socialMediaAgencyClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        socialMediaAgency.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Telemarketing Service')]")
    public static WebElement telematketingServices;
    public void telematketingServicesPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        telematketingServices.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Agricultural Cooperative')]")
    public static WebElement AgriculturalCooperative;
    public void AgriculturalCooperativePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AgriculturalCooperative.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Agricultural Service')]")
    public static WebElement agriculturalService;
    public void agriculturalServicePage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        agriculturalService.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Dairy Farm')]")
    public static WebElement dairyFarm;
    public void dairyFarmPageFunctioning() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        dairyFarm.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Fish Farm')]")
    public static WebElement fishFarm;
    public void fishFarmPageClickable() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fishFarm.click();
    }
    @FindBy(xpath = " //a[contains(text(),'Livestock Farm')]")
    public static WebElement liveStockFarm;
    public void liveStockFarmPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        liveStockFarm.click();
    }

}
