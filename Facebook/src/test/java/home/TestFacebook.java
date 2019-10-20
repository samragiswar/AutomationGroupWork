package home;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestFacebook extends LoginPage{
    LoginPage loginPage;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        loginPage = PageFactory.initElements(driver, LoginPage.class); }
    //loginPage = PageFactory.initElements(driver,LoginPage.class);
    // }
    //LoginPage Facebookloginpage = PageFactory.initElements(driver, LoginPage.class);
    @Test
    public void successfulsignin() {
        signin(); }
    @Test
    public void testfacebookLogo() {
        loginPage.checkfacebookLogo();
    }
    @Test
    public void addButtonfunction() { //should fail
        signin();
        clickOnAddPictureButton(); }
    @Test //loginwithwrongcred
    public void checkLoginNegetive() {
        loginNegative(); }
    @Test
    public void messendertabShouldBeClickable() throws InterruptedException {
        clickonMessengerbttn();
        Thread.sleep(5000);}
    @Test
    public void FacebookLitePage() throws InterruptedException {
        clickonFacebookLite();
        Thread.sleep(5000); }
    @Test
    public void Policypageissuccessfulfunctioning() {
        cookiesPolicyClickable(); }
    @Test
    public void SignUpFunctionlaityBTTN() {
        clickOnSignup(); }
    @Test
    public void homePAgeSelected() throws InterruptedException {
        signin();
        homePageMain();
        Thread.sleep(5000); }
    @Test
    public void test10() throws InterruptedException {
        signin();
        samProfile();
        Thread.sleep(5000); }
    @Test
    public void AddStorytoTheMAinpage() {
        signin();
        addToStory(); }
    @Test
    public void seeMoreshouldbeselected() {
        signin();
        seeMoreisSelected(); }
    @Test
    public void eventPageShouldbeclicked() {
        signin();
        eventPageisSelected(); }
    @Test
    public void memoriesFunctionality() {
        signin();
        memoriesPageClickable(); }
    @Test
    public void recentActivityFunctionality() {
        signin();
        recentAddActivityClickable(); }
    @Test
    public void oculusisSelection() {
        signin();
        oculusisSelected(); }
    @Test
    public void crisispageSelected() {
        signin();
        crisisResponseSelected(); }
    @Test
    public void offersPageshouldbenavigatedtotherightpage() {
        signin();
        offers(); }
    @Test
    public void townHallPageworking() {
        signin();
        townHallPage(); }
    @Test
    public void shouldLeadToJobsPAge() {
        signin();
        jobsPage(); }
    @Test
    public void shouldLeadtoMoviesPAge() {
        signin();
        moviesPage(); }
    @Test
    public void gamingVideooptionisSlelected() {
        signin();
        gamingVideo(); }
    public void fundraisersPAgeshouldbedisplayed() {
        signin();
        fundraisers(); }
    @Test
    public void createPAgeisClickable() {
        clickOnCreateaPage(); }
    @Test
    public void addChoicesshouldclickandleadtoaddpage() {
        clickOnAddChoices(); }
    @Test
    public void friendsShouldbeClickable() {
        signin();
        clickOnFindFriends(); }
    @Test
    public void peoplePageshouldBeClickable() {
        peoplePageClickable(); }
    @Test
    public void pagesShouldleadtopagespage() {
        pagesClickable(); }
    @Test
    public void pageCatogeriesSuccessfullyClickable() {
        pageCategoriesClickable(); }
    @Test
    public void placesShouldbeClickable() {
        placesClick(); }
    @Test
    public void gamesShouldleadsTomoreGamesPAge() {
        gamesClickable(); }
    @Test
    public void locationShouldtakeInput() {
        locationClick(); }
    @Test
    public void marketPlaceShouldClick() {
        marketPlaceClick(); }
    @Test
    public void groupsPageFunctioning() {
        groupsClick(); }
    @Test
    public void leadsToinstagramPage() {
        instagramPageClick(); }
    @Test
    public void localPageFunctioning() {
        localPageClick(); }
    @Test
    public void fundRaisersPageFunctioning() {
        fundraisersClick(); }
    @Test
    public void ServicesPageFunctioning() {
        servicesClick(); }
    @Test
    public void AboutClick() {
        aboutClick(); }
    @Test
    public void createAddPageisClickable() {
        createAddClick(); }
    @Test
    public void createPageIsfunctioning() {
        createPageClick(); }
    @Test
    public void developersClicked() {
        developersClick(); }
    @Test
    public void careearsCliked() {
        careersClick(); }
    @Test
    public void privacyClicked() {
        privacyClick(); }
    @Test
    public void helpPageSuccessfullyClicked() {
        helpClick(); }
    @Test
    public void getFBmainpagelink() {
        driver.get("https://www.facebook.com"); }
    @Test
    public void intalionaLangugeClicksandChanges() {
        italianoTabClick(); }
    @Test
    public void detuschLangugeClicksandChanges() {
        deutschClick(); }
    @Test
    public void brasilLangugeClicksandChanges() {
        brasilClick(); }
    @Test
    public void franceLangugeClicksandChanges() {
        franceClick(); }
    @Test
    public void espanolLangugeClicksandChanges() {
        espanolClick(); }
    @Test
    public void dataPoliyleadsToNewPage() {
        dataPolicyClickable(); }
    @Test
    public void termLinksShouldLeadtorightPage() {
        termsLinkFunctionality(); }
    @Test
    public void test61() {
        forgotAccountFunctionality(); }
    @Test
    public void RaiseMoneyshouldwork(){
        fundraisersClick();
        raiseMoneyPage(); }
    @Test
    public void animalPageCatagoryFunction(){
        fundraisersClick();
        animalPage(); }
    @Test
    public void artsandculturefaceshouldworkk(){
        fundraisersClick();
        artsCutlureFunctioning(); }
    @Test
    public void communitySocialActionFuncltionality(){
        fundraisersClick();
        CommunityandSocialAction(); }
    @Test
    public void crisisRelifPafeisClickable(){
        fundraisersClick();
        crisisRelifPagefunctionality(); }
    @Test
    public void faithPageshouldLeadTorightPAge(){
        fundraisersClick();
        faithPageFunctioning(); }
    @Test
    public void ScholarshipPageofJenna(){
        fundraisersClick();
        faithPageFunctioning();
        JennasScholarshipPage(); }
    @Test
    public void JemToBrazilFundingPage() {
        fundraisersClick();
        faithPageFunctioning();
        sendJemToBrazil(); }
    @Test
    public void shareDonationPageFunctionality() {
        fundraisersClick();
        faithPageFunctioning();
        sendJemToBrazil();
        shareDonationPageOfFamilyMove(); }
    @Test
    public void discoverDifferntGroupOfPeoplePAgeFunction() {
        groupsClick();
        discoverGroupOfPeople();}
    @Test
    public void advertisingmarkteringpage(){
        pageCategoriesClickable();
        AdvertisingandMArketing(); }
    @Test
    public void businessPageshouldtakeinput(){
        pageCategoriesClickable();
        businessPageisClickable(); }
    @Test
    public void advertAgencyshouldClick(){
        pageCategoriesClickable();
        advertAgencyClick(); }
    @Test
    public void copyWritingServicesClickable(){
        pageCategoriesClickable();
        copyWritingServices(); }
    @Test
    public void myrpofiinternetMarketingServicesShouldClickandleadtothepage(){
        pageCategoriesClickable();
        internetMarketingServices(); }
    @Test
    public void marketResearchPageClicks(){
        pageCategoriesClickable();
        marketResearchPage(); }
    @Test
    public void marketingAgencyPageFunctionalityshouldwork(){
        pageCategoriesClickable();
        marketingAgencyPageFunctionality();}
    @Test
    public void markemerchandisingServicesPageClicks(){
        pageCategoriesClickable();
        merchandisingServicesPageFunctioning();}
    @Test
    public void publicRelationsAgencyShouldClick(){
        pageCategoriesClickable();
        publicRelationsAgencyShouldClickandTakeInput();}
    @Test
    public void socialMediaClickable(){
        pageCategoriesClickable();
        socialMediaAgencyClickable();}
    @Test
    public void telematketingServicesPageClicks(){
        pageCategoriesClickable();
        telematketingServicesPage();}
    @Test
    public void agriculturalCooperativePageClicks(){
        pageCategoriesClickable();
        AgriculturalCooperativePage();}
    @Test
    public void agriculturalServicePageFunctioning(){
        pageCategoriesClickable();
        agriculturalServicePage();}
    @Test
    public void dairyFarmPageisclickable(){
        pageCategoriesClickable();
        dairyFarmPageFunctioning();}
    @Test
    public void fishFarmPagefunctions(){
        pageCategoriesClickable();
        fishFarmPageClickable();}
    @Test
    public void liveStockFarmPageisFunctioning(){
        pageCategoriesClickable();
        liveStockFarmPage();}}
