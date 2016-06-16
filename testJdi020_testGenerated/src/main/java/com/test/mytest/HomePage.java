package com.test.mytest;

import com.epam.jdi.uitests.core.interfaces.base.IElement;
import com.epam.jdi.uitests.core.interfaces.common.*;
import com.epam.jdi.uitests.core.interfaces.complex.IForm;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Alexander_Petrovskiy on 6/3/2016.
 */
public class HomePage extends WebPage {
// http://www.fifa.com/

    @FindBy(className="navbar-toggle navbar-site-toggle")
    public ILink linkTogglenavigation;

    @FindBy(className="navbar-brand")
    public ILink linkNoName;

    @FindBy(linkText="About FIFA")
    public ILink linkAboutFIFA;

    @FindBy(linkText="Development")
    public ILink linkDevelopment;

    @FindBy(linkText="Governance")
    public ILink linkGovernance;

    @FindBy(linkText="Sustainability")
    public ILink linkSustainability;

    @FindBy(linkText=" ")
    public ILink linkNoName1;

    @FindBy(linkText=" ")
    public ILink linkNoName2;

    @FindBy(linkText=" ")
    public ILink linkNoName3;

    @FindBy(className="siteh-tc-label")
    public ILink linkNoName4;

    @FindBy(className="siteh-tc-screenname hidden")
    public ILink linkSitehtcscreennamehidden;

    @FindBy(className="siteh-tc-avatar")
    public IImage imageSitehtcavatar;

    @FindBy(linkText="FIFA World Cupв„ў")
    public ILink linkFIFAWorldCup;

    @FindBy(linkText="FIFA Tournaments")
    public ILink linkFIFATournaments;

    @FindBy(linkText="Live Scores")
    public ILink linkLiveScores;

    @FindBy(linkText="FIFA Ranking")
    public ILink linkFIFARanking;

    @FindBy(linkText="Women's Football")
    public ILink linkWomensFootball;

    @FindBy(linkText="Media")
    public ILink linkMedia;

    @FindBy(linkText="Associations")
    public ILink linkAssociations;

    @FindBy(linkText="We use \"cookies\" to collect information. Click here to read more.")
    public ITextArea textAreaWeusecookiestocollectinformationClickheretoreadmore;

    @FindBy(linkText="Click here to read more.")
    public ILink linkClickheretoreadmore;

    @FindBy(className="logolev0")
    public IImage imageLogolev0;

    @FindBy(linkText="Home Page")
    public ILink linkHomePage;

    @FindBy(linkText="English")
    public ILink linkEnglish;

    @FindBy(linkText="Deutsch")
    public ILink linkDeutsch;

    @FindBy(linkText="FranГ§ais")
    public ILink linkFranais;

    @FindBy(linkText="EspaГ±ol")
    public ILink linkEspaol;

    @FindBy(linkText="PortuguГЄs")
    public ILink linkPortugus;

    @FindBy(linkText="Ш№Ш±ШЁЩЉ")
    public ILink linkNoName5;

    @FindBy(linkText="Р СѓСЃСЃРєРёР№")
    public ILink linkNoName6;

    @FindBy(linkText="ж—Ґжњ¬иЄћ")
    public ILink linkNoName7;

    @FindBy(linkText="Korean")
    public ILink linkKorean;

    @FindBy(linkText="News")
    public ILink linkNews;

    @FindBy(linkText="Photos")
    public ILink linkPhotos;

    @FindBy(linkText="Videos")
    public ILink linkVideos;

    @FindBy(linkText="FIFA World Cupв„ў")
    public ILink linkFIFAWorldCup1;

    @FindBy(linkText="FIFA Tournaments")
    public ILink linkFIFATournaments1;

    @FindBy(linkText="Women's Football")
    public ILink linkWomensFootball1;

    @FindBy(linkText="FIFA Ranking")
    public ILink linkFIFARanking1;

    @FindBy(linkText="Live Scores")
    public ILink linkLiveScores1;

    @FindBy(linkText="FIFA Ballon d'Or")
    public ILink linkFIFABallondOr;

    @FindBy(linkText="Associations")
    public ILink linkAssociations1;

    @FindBy(linkText="Media")
    public ILink linkMedia1;

    @FindBy(linkText="About FIFA")
    public ILink linkAboutFIFA1;

    @FindBy(linkText="Development")
    public ILink linkDevelopment1;

    @FindBy(linkText="Governance")
    public ILink linkGovernance1;

    @FindBy(linkText="Sustainability")
    public ILink linkSustainability1;

    @FindBy(className="subject")
    public ILabel labelCopaAmerica2016Centenario;

    @FindBy(className="subject")
    public ILabel labelUEFAEURO2016;

    @FindBy(className="subject")
    public ILabel labelEuroBeachSoccerLeague2016;

    @FindBy(className="subject")
    public ILabel labelOrganisingCommitteefortheOlympicFootballTournaments;

    @FindBy(className="subject")
    public ILabel labelOCFutsalCommittee;

    @FindBy(className="subject")
    public ILabel labelMedicalCommittee;

    @FindBy(linkText="Full calendar")
    public ILink linkFullcalendar;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-store-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-store-items']/div[@class='siteh-store-area']/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a")
    public ILink linkNoName8;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-store-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-store-items']/div[@class='siteh-store-area']/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a/img")
    public IImage imageNoName;

    @FindBy(linkText="Germany 2016 Home Soccer Jersey w/ Winners Badge")
    public ILabel labelGermany2016HomeSoccerJerseywWinnersBadge;

    @FindBy(linkText="Germany 2016 Home Soccer Jersey w/ Winners Badge")
    public ILink linkGermany2016HomeSoccerJerseywWinnersBadge;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-store-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-store-items']/div[@class='siteh-store-area']/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a")
    public ILink linkNoName9;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-store-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-store-items']/div[@class='siteh-store-area']/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a/img")
    public IImage imageNoName1;

    @FindBy(linkText="Germany 2016 Youth Away Soccer Jersey w/ Winners Badge")
    public ILabel labelGermany2016YouthAwaySoccerJerseywWinnersBadge;

    @FindBy(linkText="Germany 2016 Youth Away Soccer Jersey w/ Winners Badge")
    public ILink linkGermany2016YouthAwaySoccerJerseywWinnersBadge;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-store-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-store-items']/div[@class='siteh-store-area']/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a")
    public ILink linkNoName10;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-store-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-store-items']/div[@class='siteh-store-area']/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a/img")
    public IImage imageNoName2;

    @FindBy(linkText="Germany 2016 Women's Home Soccer Jersey w/ Winners Badge")
    public ILabel labelGermany2016WomensHomeSoccerJerseywWinnersBadge;

    @FindBy(linkText="Germany 2016 Women's Home Soccer Jersey w/ Winners Badge")
    public ILink linkGermany2016WomensHomeSoccerJerseywWinnersBadge;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-store-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-store-items']/div[@class='siteh-store-area']/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a")
    public ILink linkNoName11;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-store-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-store-items']/div[@class='siteh-store-area']/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a/img")
    public IImage imageNoName3;

    @FindBy(linkText="Germany 2016 LS Home Keeper Jersey w/ Winners Badge")
    public ILabel labelGermany2016LSHomeKeeperJerseywWinnersBadge;

    @FindBy(linkText="Germany 2016 LS Home Keeper Jersey w/ Winners Badge")
    public ILink linkGermany2016LSHomeKeeperJerseywWinnersBadge;

    @FindBy(linkText="Shop Now")
    public ILink linkShopNow;

    @FindBy(linkText=" ")
    public ILink linkNoName12;

    @FindBy(id="siteh-checkbox-wholesite")
    public ICheckBox checkBoxSitehcheckboxwholesite;

    @FindBy(linkText=" fifa.wholesite")
    public ILabel labelfifawholesite;

    @FindBy(id="q")
    public ITextField textFieldQ;

    @FindBy(id="siteh-btn-search")
    public IButton buttonSitehbtnsearch;

    @FindBy(className="btn btn-link")
    public IButton buttonAdvancedSearch;

    @FindBy(className="dcm-title")
    public ILabel labelCelebratetheCopaAmericaandEUROwithFIFAPredictor;

    @FindBy(linkText="Celebrate the Copa America and EURO with FIFA Predictor")
    public ILink linkCelebratetheCopaAmericaandEUROwithFIFAPredictor;

    @FindBy(className="dcm-internal")
    public ILink linkNoName13;

    @FindBy(className="i-sqr-2 dcm-lazy-lazy")
    public IImage imageIsqr2dcmlazylazy;

    @FindBy(linkText="Enhance your experience of the continental tournaments with our monthly&nbsp;FIFA Predictor&nbsp;game.&nbsp;")
    public ITextArea textAreaEnhanceyourexperienceofthecontinentaltournamentswithourmonthlynbspFIFAPredictornbspgamenbsp;

    @FindBy(linkText="FIFA Predictor")
    public ILink linkFIFAPredictor;

    @FindBy(linkText="Register")
    public ILink linkRegister;

    @FindBy(linkText="Social")
    public ILabel labelSocial;

    @FindBy(className="siteh-socialfb hidden")
    public ILabel labelYourelogginginwithFacebook;

    @FindBy(className="siteh-socialtw hidden")
    public ILabel labelYourelogginginwithTwitter;

    @FindBy(className="siteh-socialgg hidden")
    public ILabel labelYourelogginginwithGoogle;

    @FindBy(className="sociallink-undo")
    public ILink linkUndo;

    @FindBy(linkText="fifa.memberlogin")
    public ILabel labelFifamemberlogin;

    @FindBy(className="siteh-linkto-fifaaccount hidden")
    public ILabel labelLinkyourFIFAcomaccount;

    @FindBy(id="cookie_domain")
    public ITextField textFieldCookiedomain;

    @FindBy(id="watermark_reset")
    public ITextField textFieldWatermarkreset;

    @FindBy(id="cp_email")
    public ITextField textFieldCemail;

    @FindBy(id="cp_password")
    public ITextField textFieldCpassword;

    @FindBy(id="redirect_uri")
    public ITextField textFieldRedirecturi;

    @FindBy(id="c_rememberMe")
    public ICheckBox checkBoxCrememberMe;

    @FindBy(className="checkbox-only-style")
    public ILabel labelNoName;

    @FindBy(className="checkbox-side-label")
    public ILabel labelStayloggedin;

    @FindBy(linkText="If You Forget Your Password...")
    public ILink linkIfYouForgetYourPassword;

    @FindBy(className="btn btn-default login-signin-btn")
    public IButton buttonBtnbtndefaultloginsigninbtn;

    @FindBy(name="client_id")
    public ITextField textFieldClientid;

    @FindBy(id="redirect_uri")
    public ITextField textFieldRedirecturi1;

    @FindBy(name="provider")
    public ITextField textFieldProvider;

    @FindBy(id="siteh-button-fb-login")
    public IButton buttonSitehbuttonfblogin;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-tc-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-tc-notlogged']/div[@class='siteh-tc-login']/div/div/button[@id='siteh-button-fb-login']/img")
    public IImage imageNoName4;

    @FindBy(name="client_id")
    public ITextField textFieldClientid1;

    @FindBy(id="redirect_uri")
    public ITextField textFieldRedirecturi2;

    @FindBy(name="provider")
    public ITextField textFieldProvider1;

    @FindBy(id="siteh-button-tw-login")
    public IButton buttonSitehbuttontwlogin;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-tc-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-tc-notlogged']/div[@class='siteh-tc-login']/div/div/button[@id='siteh-button-tw-login']/img")
    public IImage imageNoName5;

    @FindBy(name="client_id")
    public ITextField textFieldClientid2;

    @FindBy(id="redirect_uri")
    public ITextField textFieldRedirecturi3;

    @FindBy(name="provider")
    public ITextField textFieldProvider2;

    @FindBy(id="siteh-button-gg-login")
    public IButton buttonSitehbuttongglogin;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-tc-subpanel']/div[@class='siteh-content-area']/div[@class='siteh-tc-notlogged']/div[@class='siteh-tc-login']/div/div/button[@id='siteh-button-gg-login']/img")
    public IImage imageNoName6;

    @FindBy(className="dcm-title")
    public ILabel labelCelebratetheCopaAmericaandEUROwithFIFAPredictor1;

    @FindBy(linkText="Celebrate the Copa America and EURO with FIFA Predictor")
    public ILink linkCelebratetheCopaAmericaandEUROwithFIFAPredictor1;

    @FindBy(className="dcm-internal")
    public ILink linkNoName14;

    @FindBy(className="i-sqr-1 dcm-lazy-lazy")
    public IImage imageIsqr1dcmlazylazy;

    @FindBy(linkText="FIFA.com Club News")
    public ILink linkFIFAcomClubNews;

    @FindBy(className="tc-activities-img")
    public ILink linkTcactivitiesimg;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-tc-subpanel']/div[@class='siteh-content-area']/div/div[@class='siteh-tc-activities']/ul[@class='siteh-tc-activities-list']/li/a[@class='tc-activities-img']/img")
    public IImage imageNoName7;

    @FindBy(linkText="FIFA Predictor")
    public ILink linkFIFAPredictor1;

    @FindBy(className="tc-activities-img")
    public ILink linkTcactivitiesimg1;

    @FindBy(xpath="//div[@id='wrap']/div[@class='siteh-subpanel-wrapper']/div[@id='siteh-tc-subpanel']/div[@class='siteh-content-area']/div/div[@class='siteh-tc-activities']/ul[@class='siteh-tc-activities-list']/li/a[@class='tc-activities-img']/img")
    public IImage imageNoName8;

    @FindBy(linkText="FIFA Ultimate Trivia")
    public ILink linkFIFAUltimateTrivia;

    @FindBy(linkText="Discover")
    public ILink linkDiscover;

    @FindBy(className="siteh-tc-avatar")
    public IImage imageSitehtcavatar1;

    @FindBy(id="siteh-tc-userinfo-screenname")
    public ILabel labelSitehtcuserinfoscreenname;

    @FindBy(className="siteh-tc-userinfo-edit chevron")
    public ILink linkEdit;

    @FindBy(className="chevron")
    public ILink linkComments;

    @FindBy(className="socialModule-label")
    public ILabel labelConnect;

    @FindBy(name="client_id")
    public ITextField textFieldClientid3;

    @FindBy(id="redirect_uri")
    public ITextField textFieldRedirecturi4;

    @FindBy(name="provider")
    public ITextField textFieldProvider3;

    @FindBy(id="siteh-button-fb-link")
    public IButton buttonSitehbuttonfblink;

    @FindBy(name="client_id")
    public ITextField textFieldClientid4;

    @FindBy(id="redirect_uri")
    public ITextField textFieldRedirecturi5;

    @FindBy(name="provider")
    public ITextField textFieldProvider4;

    @FindBy(id="siteh-button-tw-link")
    public IButton buttonSitehbuttontwlink;

    @FindBy(name="client_id")
    public ITextField textFieldClientid5;

    @FindBy(id="redirect_uri")
    public ITextField textFieldRedirecturi6;

    @FindBy(name="provider")
    public ITextField textFieldProvider5;

    @FindBy(id="siteh-button-gg-link")
    public IButton buttonSitehbuttongglink;

    @FindBy(linkText="Review the Club Rules")
    public ILink linkReviewtheClubRules;

    @FindBy(linkText="contact form")
    public ILink linkContactform;

    @FindBy(className="dcm-internal")
    public ILink linkNoName15;

    @FindBy(className="i-lnd-12")
    public IImage imageIlnd12;

    @FindBy(className="dcm-title")
    public ILabel labelLIVEEURO2016asithappens;

    @FindBy(linkText="LIVE: EURO 2016, as it happens")
    public ILink linkLIVEEURO2016asithappens;

    @FindBy(className="dcm-internal")
    public ILink linkNoName16;

    @FindBy(className="i-lnd-4")
    public IImage imageIlnd4;

    @FindBy(className="dcm-title")
    public ILabel labelShocksshotsandasupersub;

    @FindBy(linkText="Shocks, shots and a super sub")
    public ILink linkShocksshotsandasupersub;

    @FindBy(className="dcm-internal")
    public ILink linkNoName17;

    @FindBy(className="i-lnd-4")
    public IImage imageIlnd41;

    @FindBy(className="dcm-title")
    public ILabel labelKharbinWewanttoputasmileonSyrianfaces;

    @FindBy(linkText="Kharbin: We want to put a smile on Syrian faces")
    public ILink linkKharbinWewanttoputasmileonSyrianfaces;

    @FindBy(className="dcm-internal")
    public ILink linkNoName18;

    @FindBy(className="i-lnd-4")
    public IImage imageIlnd42;

    @FindBy(className="dcm-title")
    public ILabel labelOutsidersholdfirmondayofsurprises;

    @FindBy(linkText="Outsiders hold firm on day of surprises")
    public ILink linkOutsidersholdfirmondayofsurprises;

    @FindBy(className="dcm-internal")
    public ILink linkNoName19;

    @FindBy(className="i-lnd-4")
    public IImage imageIlnd43;

    @FindBy(className="dcm-title")
    public ILabel labelArgentinastayperfectChileintolasteight;

    @FindBy(linkText="Argentina stay perfect, Chile into last eight")
    public ILink linkArgentinastayperfectChileintolasteight;

    @FindBy(className="dcm-newsitemlink")
    public ILink linkgoogleoffindexFIFAFutsalWorldCupgoogleonindexTalismaninplaceforMozambique;

    @FindBy(className="dcm-title")
    public ILabel labelTalismaninplaceforMozambique;

    @FindBy(className="dcm-newsitemlink")
    public ILink linkgoogleoffindexBrazilgoogleonindexDungasackedasBrazilboss;

    @FindBy(className="dcm-title")
    public ILabel labelDungasackedasBrazilboss;

    @FindBy(className="dcm-newsitemlink")
    public ILink linkgoogleoffindexWomensFootballgoogleonindexBoulleaushareshersocialnetworkingsecrets;

    @FindBy(className="dcm-title")
    public ILabel labelBoulleaushareshersocialnetworkingsecrets;

    @FindBy(linkText="All News")
    public ILink linkAllNews;

    @FindBy(linkText="All Photos")
    public ILink linkAllPhotos;

    @FindBy(linkText="All Videos")
    public ILink linkAllVideos;

    @FindBy(className="title")
    public ILabel labelFIFACongress2016;

    @FindBy(className="dcm-internal")
    public ILink linkNoName20;

    @FindBy(className="i-lnd-4")
    public IImage imageIlnd44;

    @FindBy(linkText="The 66th FIFA Congress took place in Mexico City on 12 and 13 May 2016. You can now look back at the decisions taken, including the historic appointment of FIFA's new General Secretary, Fatma Samoura.")
    public ITextArea textAreaThe66thFIFACongresstookplaceinMexicoCityon12and13May2016YoucannowlookbackatthedecisionstakenincludingthehistoricappointmentofFIFAsnewGeneralSecretaryFatmaSamoura;

    @FindBy(linkText="FIFA Congress 2016")
    public ILink linkFIFACongress2016;

    @FindBy(className="title")
    public ILabel labelFIFABallondOr2015;

    @FindBy(className="i-lnd-4 dcm-lazy-lazy")
    public IImage imageIlnd4dcmlazylazy;

    @FindBy(linkText="Relive the entire dayвЂ™s events surrounding the FIFA.Ballon d'Or 2015&nbsp;direct from Zurich's Kongresshaus with&nbsp;FIFA.com's exclusive Live Blog!")
    public ITextArea textAreaRelivetheentiredayseventssurroundingtheFIFABallondOr2015nbspdirectfromZurichsKongresshauswithnbspFIFAcomsexclusiveLiveBlog;

    @FindBy(linkText="Relive the Ballon d'Or Gala")
    public ILink linkRelivetheBallondOrGala;

    @FindBy(linkText="FIFA Ballon d'Or 2015")
    public ILink linkFIFABallondOr2015;

    @FindBy(linkText=" ")
    public ILink linkNoName21;

    @FindBy(linkText=" ")
    public ILink linkNoName22;

    @FindBy(className="dcm-title")
    public ILabel labelFIFABallondOr;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div[@class='bo-hpfifa-row']/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='picture-wrap']/img")
    public IImage imageNoName9;

    @FindBy(css="[title='FIFA Ballon d'Or']")
    public IImage imageNoName10;

    @FindBy(linkText="Lionel MESSI")
    public ILabel labelLionelMESSI;

    @FindBy(className="ARG i-2-flag flag")
    public IImage imageARGi2flagflag;

    @FindBy(linkText="FIFA Ballon d'Or")
    public ILink linkFIFABallondOr1;

    @FindBy(className="dcm-title")
    public ILabel labelFIFAWomensWorldPlayeroftheYear;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div[@class='bo-hpfifa-row']/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='picture-wrap']/img")
    public IImage imageNoName11;

    @FindBy(css="[title='FIFA Women's World Player of the Year']")
    public IImage imageNoName12;

    @FindBy(linkText="Carli LLOYD")
    public ILabel labelCarliLLOYD;

    @FindBy(className="USA i-2-flag flag")
    public IImage imageUSAi2flagflag;

    @FindBy(linkText="FIFA Women's World Player of the Year")
    public ILink linkFIFAWomensWorldPlayeroftheYear;

    @FindBy(className="dcm-title")
    public ILabel labelMensWorldCoach;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div[@class='bo-hpfifa-row']/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='picture-wrap']/img")
    public IImage imageNoName13;

    @FindBy(css="[title='Men's World Coach']")
    public IImage imageNoName14;

    @FindBy(linkText="LUIS ENRIQUE")
    public ILabel labelLUISENRIQUE;

    @FindBy(className="ESP i-2-flag flag")
    public IImage imageESPi2flagflag;

    @FindBy(linkText="Men's World Coach")
    public ILink linkMensWorldCoach;

    @FindBy(className="dcm-title")
    public ILabel labelWomensWorldCoach;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div[@class='bo-hpfifa-row']/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='picture-wrap']/img")
    public IImage imageNoName15;

    @FindBy(css="[title='Women's World Coach']")
    public IImage imageNoName16;

    @FindBy(linkText="Jill ELLIS")
    public ILabel labelJillELLIS;

    @FindBy(className="USA i-2-flag flag")
    public IImage imageUSAi2flagflag1;

    @FindBy(linkText="Women's World Coach")
    public ILink linkWomensWorldCoach;

    @FindBy(className="dcm-title")
    public ILabel labelFairPlayAward;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div[@class='bo-hpfifa-row']/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='picture-wrap']/img")
    public IImage imageNoName17;

    @FindBy(css="[title='Fair Play Award']")
    public IImage imageNoName18;

    @FindBy(linkText="All football organisations supporting refugees")
    public ILabel labelAllfootballorganisationssupportingrefugees;

    @FindBy(linkText="Fair Play Award")
    public ILink linkFairPlayAward;

    @FindBy(className="dcm-title")
    public ILabel labelPusksAward;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div[@class='bo-hpfifa-row']/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='picture-wrap']/img")
    public IImage imageNoName19;

    @FindBy(css="[title='PuskГЎs Award']")
    public IImage imageNoName20;

    @FindBy(linkText="Lira WENDELL")
    public ILabel labelLiraWENDELL;

    @FindBy(className="BRA i-2-flag flag")
    public IImage imageBRAi2flagflag;

    @FindBy(linkText="PuskГЎs Award")
    public ILink linkPusksAward;

    @FindBy(className="dcm-title")
    public ILabel labelFIFAFIFProWorldXI;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div[@class='bo-hpfifa-row']/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='picture-wrap']/img")
    public IImage imageNoName21;

    @FindBy(css="[title='FIFA FIFPro World XI']")
    public IImage imageNoName22;

    @FindBy(linkText="FIFA FIFPro World XI")
    public ILink linkFIFAFIFProWorldXI;

    @FindBy(className="title")
    public ILabel labelFollowuson;

    @FindBy(className="social-channel-link")
    public ILink link3113879likes;

    @FindBy(className="social-channel-link")
    public ILink link8813434followers;

    @FindBy(className="social-channel-link")
    public ILink link1446415subscribers;

    @FindBy(className="title")
    public ILabel labelLiveScores;

    @FindBy(linkText=" UEFA EURO 2016 Latest Fixtures and ResultsLive now")
    public ILink linkUEFAEURO2016LatestFixturesandResultsLivenow;

    @FindBy(className="t-i-3-logo")
    public IImage imageTi3logo;

    @FindBy(className="t-i-3-logoPh")
    public IImage imageTi3logoPh;

    @FindBy(className="ch-title")
    public ILabel labelUEFAEURO20161;

    @FindBy(className="dcm-newsitemlink")
    public ILink linkgoogleoffindexCopaAmricaCentenariogoogleonindexArgentinastayperfectChileintolasteightgoogleoffindexWednesday15June2016googleonindex;

    @FindBy(className="dcm-title")
    public ILabel labelArgentinastayperfectChileintolasteight1;

    @FindBy(linkText=" Uzbekistan Uzbekistan Professional Football League 2016      Latest Fixtures and ResultsLive now")
    public ILink linkUzbekistanUzbekistanProfessionalFootballLeague2016LatestFixturesandResultsLivenow;

    @FindBy(className="t-i-3-logo")
    public IImage imageTi3logo1;

    @FindBy(className="t-i-3-logoPh")
    public IImage imageTi3logoPh1;

    @FindBy(className="flag UZB")
    public IImage imageFlagUZB;

    @FindBy(className="ch-title")
    public ILabel labelUzbekistanProfessionalFootballLeague2016;

    @FindBy(className="dcm-newsitemlink")
    public ILink linkgoogleoffindexRussia2018googleonindexKharbinWewanttoputasmileonSyrianfacesgoogleoffindexWednesday15June2016googleonindex;

    @FindBy(className="dcm-title")
    public ILabel labelKharbinWewanttoputasmileonSyrianfaces1;

    @FindBy(linkText=" China PR Chinese Super League 2016      Latest Fixtures and ResultsLive now")
    public ILink linkChinaPRChineseSuperLeague2016LatestFixturesandResultsLivenow;

    @FindBy(className="t-i-3-logo")
    public IImage imageTi3logo2;

    @FindBy(className="t-i-3-logoPh")
    public IImage imageTi3logoPh2;

    @FindBy(className="flag CHN")
    public IImage imageFlagCHN;

    @FindBy(className="ch-title")
    public ILabel labelChineseSuperLeague2016;

    @FindBy(className="dcm-newsitemlink")
    public ILink linkgoogleoffindexFIFAPresidentgoogleonindexChineseFAdelegationvisitsFIFAPresidentgoogleoffindexThursday9June2016googleonindex;

    @FindBy(className="dcm-title")
    public ILabel labelChineseFAdelegationvisitsFIFAPresident;

    @FindBy(linkText="More ")
    public ILink linkMore;

    @FindBy(linkText="All News")
    public ILink linkAllNews1;

    @FindBy(linkText="All Photos")
    public ILink linkAllPhotos1;

    @FindBy(className="title")
    public ILabel labelFIFATournaments;

    @FindBy(linkText=" ")
    public ILink linkNoName23;

    @FindBy(linkText=" ")
    public ILink linkNoName24;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName25;

    @FindBy(css="[title='2014 FIFA World Cup Brazil в„ў']")
    public IImage imageNoName23;

    @FindBy(linkText="2014 FIFA World Cup Brazil в„ў")
    public ILabel label2014FIFAWorldCupBrazil;

    @FindBy(linkText="2014 FIFA World Cup Brazil в„ў")
    public ILink link2014FIFAWorldCupBrazil;

    @FindBy(linkText="News")
    public ILink linkNews1;

    @FindBy(linkText="Matches")
    public ILink linkMatches;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName26;

    @FindBy(css="[title='FIFA U-20 Women's World Cup Canada 2014']")
    public IImage imageNoName24;

    @FindBy(linkText="FIFA U-20 Women's World Cup Canada 2014")
    public ILabel labelFIFAU20WomensWorldCupCanada2014;

    @FindBy(linkText="FIFA U-20 Women's World Cup Canada 2014")
    public ILink linkFIFAU20WomensWorldCupCanada2014;

    @FindBy(linkText="News")
    public ILink linkNews2;

    @FindBy(linkText="Matches")
    public ILink linkMatches1;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName27;

    @FindBy(css="[title='Youth Olympic Football Tournaments Nanjing 2014 - Boys']")
    public IImage imageNoName25;

    @FindBy(linkText="Youth Olympic Football Tournaments Nanjing 2014 - Boys")
    public ILabel labelYouthOlympicFootballTournamentsNanjing2014Boys;

    @FindBy(linkText="Youth Olympic Football Tournaments Nanjing 2014 - Boys")
    public ILink linkYouthOlympicFootballTournamentsNanjing2014Boys;

    @FindBy(linkText="News")
    public ILink linkNews3;

    @FindBy(linkText="Matches")
    public ILink linkMatches2;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName28;

    @FindBy(css="[title='Youth Olympic Football Tournaments Nanjing 2014 - Girls']")
    public IImage imageNoName26;

    @FindBy(linkText="Youth Olympic Football Tournaments Nanjing 2014 - Girls")
    public ILabel labelYouthOlympicFootballTournamentsNanjing2014Girls;

    @FindBy(linkText="Youth Olympic Football Tournaments Nanjing 2014 - Girls")
    public ILink linkYouthOlympicFootballTournamentsNanjing2014Girls;

    @FindBy(linkText="News")
    public ILink linkNews4;

    @FindBy(linkText="Matches")
    public ILink linkMatches3;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName29;

    @FindBy(css="[title='FIFA Club World Cup Morocco 2014']")
    public IImage imageNoName27;

    @FindBy(linkText="FIFA Club World Cup Morocco 2014")
    public ILabel labelFIFAClubWorldCupMorocco2014;

    @FindBy(linkText="FIFA Club World Cup Morocco 2014")
    public ILink linkFIFAClubWorldCupMorocco2014;

    @FindBy(linkText="News")
    public ILink linkNews5;

    @FindBy(linkText="Matches")
    public ILink linkMatches4;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName30;

    @FindBy(css="[title='FIFA U-20 World Cup New Zealand 2015']")
    public IImage imageNoName28;

    @FindBy(linkText="FIFA U-20 World Cup New Zealand 2015")
    public ILabel labelFIFAU20WorldCupNewZealand2015;

    @FindBy(linkText="FIFA U-20 World Cup New Zealand 2015")
    public ILink linkFIFAU20WorldCupNewZealand2015;

    @FindBy(linkText="News")
    public ILink linkNews6;

    @FindBy(linkText="Matches")
    public ILink linkMatches5;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName31;

    @FindBy(css="[title='FIFA Women's World Cup Canada 2015']")
    public IImage imageNoName29;

    @FindBy(linkText="FIFA Women's World Cup Canada 2015")
    public ILabel labelFIFAWomensWorldCupCanada2015;

    @FindBy(linkText="FIFA Women's World Cup Canada 2015")
    public ILink linkFIFAWomensWorldCupCanada2015;

    @FindBy(linkText="News")
    public ILink linkNews7;

    @FindBy(linkText="Matches")
    public ILink linkMatches6;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName32;

    @FindBy(css="[title='FIFA Beach Soccer World Cup Portugal 2015']")
    public IImage imageNoName30;

    @FindBy(linkText="FIFA Beach Soccer World Cup Portugal 2015")
    public ILabel labelFIFABeachSoccerWorldCupPortugal2015;

    @FindBy(linkText="FIFA Beach Soccer World Cup Portugal 2015")
    public ILink linkFIFABeachSoccerWorldCupPortugal2015;

    @FindBy(linkText="News")
    public ILink linkNews8;

    @FindBy(linkText="Matches")
    public ILink linkMatches7;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName33;

    @FindBy(css="[title='FIFA U-17 World Cup Chile 2015']")
    public IImage imageNoName31;

    @FindBy(linkText="FIFA U-17 World Cup Chile 2015")
    public ILabel labelFIFAU17WorldCupChile2015;

    @FindBy(linkText="FIFA U-17 World Cup Chile 2015")
    public ILink linkFIFAU17WorldCupChile2015;

    @FindBy(linkText="News")
    public ILink linkNews9;

    @FindBy(linkText="Matches")
    public ILink linkMatches8;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName34;

    @FindBy(css="[title='FIFA Club World Cup Japan 2015']")
    public IImage imageNoName32;

    @FindBy(linkText="FIFA Club World Cup Japan 2015")
    public ILabel labelFIFAClubWorldCupJapan2015;

    @FindBy(linkText="FIFA Club World Cup Japan 2015")
    public ILink linkFIFAClubWorldCupJapan2015;

    @FindBy(linkText="News")
    public ILink linkNews10;

    @FindBy(linkText="Matches")
    public ILink linkMatches9;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName35;

    @FindBy(css="[title='Olympic Football Tournaments Rio 2016 - Women']")
    public IImage imageNoName33;

    @FindBy(linkText="Olympic Football Tournaments Rio 2016 - Women")
    public ILabel labelOlympicFootballTournamentsRio2016Women;

    @FindBy(linkText="Olympic Football Tournaments Rio 2016 - Women")
    public ILink linkOlympicFootballTournamentsRio2016Women;

    @FindBy(linkText="News")
    public ILink linkNews11;

    @FindBy(linkText="Matches")
    public ILink linkMatches10;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName36;

    @FindBy(css="[title='Olympic Football Tournaments Rio 2016 - Men']")
    public IImage imageNoName34;

    @FindBy(linkText="Olympic Football Tournaments Rio 2016 - Men")
    public ILabel labelOlympicFootballTournamentsRio2016Men;

    @FindBy(linkText="Olympic Football Tournaments Rio 2016 - Men")
    public ILink linkOlympicFootballTournamentsRio2016Men;

    @FindBy(linkText="News")
    public ILink linkNews12;

    @FindBy(linkText="Matches")
    public ILink linkMatches11;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName37;

    @FindBy(css="[title='FIFA World Cupв„ў Qualifiers']")
    public IImage imageNoName35;

    @FindBy(linkText="FIFA World Cupв„ў Qualifiers")
    public ILabel labelFIFAWorldCupQualifiers;

    @FindBy(linkText="FIFA World Cupв„ў Qualifiers")
    public ILink linkFIFAWorldCupQualifiers;

    @FindBy(linkText="News")
    public ILink linkNews13;

    @FindBy(linkText="Matches")
    public ILink linkMatches12;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName38;

    @FindBy(css="[title='FIFA Futsal World Cup Colombia 2016']")
    public IImage imageNoName36;

    @FindBy(linkText="FIFA Futsal World Cup Colombia 2016")
    public ILabel labelFIFAFutsalWorldCupColombia2016;

    @FindBy(linkText="FIFA Futsal World Cup Colombia 2016")
    public ILink linkFIFAFutsalWorldCupColombia2016;

    @FindBy(linkText="News")
    public ILink linkNews14;

    @FindBy(linkText="Matches")
    public ILink linkMatches13;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName39;

    @FindBy(css="[title='FIFA U-17 Women's World Cup Jordan 2016']")
    public IImage imageNoName37;

    @FindBy(linkText="FIFA U-17 Women's World Cup Jordan 2016")
    public ILabel labelFIFAU17WomensWorldCupJordan2016;

    @FindBy(linkText="FIFA U-17 Women's World Cup Jordan 2016")
    public ILink linkFIFAU17WomensWorldCupJordan2016;

    @FindBy(linkText="News")
    public ILink linkNews15;

    @FindBy(linkText="Matches")
    public ILink linkMatches14;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName40;

    @FindBy(css="[title='FIFA U-20 Women's World Cup Papua New Guinea 2016']")
    public IImage imageNoName38;

    @FindBy(linkText="FIFA U-20 Women's World Cup Papua New Guinea 2016")
    public ILabel labelFIFAU20WomensWorldCupPapuaNewGuinea2016;

    @FindBy(linkText="FIFA U-20 Women's World Cup Papua New Guinea 2016")
    public ILink linkFIFAU20WomensWorldCupPapuaNewGuinea2016;

    @FindBy(linkText="News")
    public ILink linkNews16;

    @FindBy(linkText="Matches")
    public ILink linkMatches15;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName41;

    @FindBy(css="[title='FIFA Club World Cup Japan 2016']")
    public IImage imageNoName39;

    @FindBy(linkText="FIFA Club World Cup Japan 2016")
    public ILabel labelFIFAClubWorldCupJapan2016;

    @FindBy(linkText="FIFA Club World Cup Japan 2016")
    public ILink linkFIFAClubWorldCupJapan2016;

    @FindBy(linkText="News")
    public ILink linkNews17;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName42;

    @FindBy(css="[title='2018 FIFA World Cup Russia (TM)']")
    public IImage imageNoName40;

    @FindBy(linkText="2018 FIFA World Cup Russia (TM)")
    public ILabel label2018FIFAWorldCupRussiaTM;

    @FindBy(linkText="2018 FIFA World Cup Russia (TM)")
    public ILink link2018FIFAWorldCupRussiaTM;

    @FindBy(linkText="News")
    public ILink linkNews18;

    @FindBy(linkText="Matches")
    public ILink linkMatches16;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='noclick']/div/div[@class='trn-item-logo']/a")
    public ILink linkNoName43;

    @FindBy(css="[title='2022 FIFA World Cup Qatar (TM)']")
    public IImage imageNoName41;

    @FindBy(linkText="2022 FIFA World Cup Qatar (TM)")
    public ILabel label2022FIFAWorldCupQatarTM;

    @FindBy(linkText="2022 FIFA World Cup Qatar (TM)")
    public ILink link2022FIFAWorldCupQatarTM;

    @FindBy(linkText="News")
    public ILink linkNews19;

    @FindBy(className="title")
    public ILabel labelAboutFIFA;

    @FindBy(className="dcm-title")
    public ILabel labelMediaStatements;

    @FindBy(className="dcm-internal")
    public ILink linkNoName44;

    @FindBy(className="i-lnd-4 dcm-lazy-lazy")
    public IImage imageIlnd4dcmlazylazy1;

    @FindBy(linkText="The Official Mascot of the FIFA U-20 WomenвЂ™s World Cup 2016 was launched and presented to the public today in front of thousands of football fans at the Sir John Guise Stadium in Port Moresby.&nbsp;")
    public ITextArea textAreaTheOfficialMascotoftheFIFAU20WomensWorldCup2016waslaunchedandpresentedtothepublictodayinfrontofthousandsoffootballfansattheSirJohnGuiseStadiuminPortMoresbynbsp;

    @FindBy(linkText="Media News")
    public ILink linkMediaNews;

    @FindBy(linkText="Media Channel")
    public ILink linkMediaChannel;

    @FindBy(className="dcm-title")
    public ILabel labelFIFA1904;

    @FindBy(className="dcm-internal")
    public ILink linkNoName45;

    @FindBy(className="i-lnd-4 dcm-lazy-lazy")
    public IImage imageIlnd4dcmlazylazy2;

    @FindBy(linkText="FIFA 1904 is a monthly magazine which is published as both a print edition and as a free online publication. The 68-page magazine contains in-depth stories and interviews about football from around the world, with a special focus on FIFA's development projects and activities, competitions, events and member associations. The print version is provided for free to FIFA's confederations and member associations, while the online version is available to all football fans right here on FIFA.com. ")
    public ITextArea textAreaFIFA1904isamonthlymagazinewhichispublishedasbothaprinteditionandasafreeonlinepublicationThe68pagemagazinecontainsindepthstoriesandinterviewsaboutfootballfromaroundtheworldwithaspecialfocusonFIFAsdevelopmentprojectsandactivitiescompetitionseventsandmemberassociationsTheprintversionisprovidedforfreetoFIFAsconfederationsandmemberassociationswhiletheonlineversionisavailabletoallfootballfansrighthereonFIFAcom;

    @FindBy(linkText="FIFA 1904")
    public ILink linkFIFA1904;

    @FindBy(className="dcm-title")
    public ILabel labelLatestNews;

    @FindBy(className="dcm-internal")
    public ILink linkNoName46;

    @FindBy(className="i-lnd-4 dcm-lazy-lazy")
    public IImage imageIlnd4dcmlazylazy3;

    @FindBy(linkText="All News")
    public ILink linkAllNews2;

    @FindBy(className="title")
    public ILabel labelWhatwestandfor;

    @FindBy(className="dcm-internal")
    public ILink linkNoName47;

    @FindBy(className="i-lnd-4")
    public IImage imageIlnd45;

    @FindBy(linkText="FIFAвЂ™s mission is develop football everywhere and for all, to touch the world through its inspiring tournaments and to build a better future through the power of the game.")
    public ITextArea textAreaFIFAsmissionisdevelopfootballeverywhereandforalltotouchtheworldthroughitsinspiringtournamentsandtobuildabetterfuturethroughthepowerofthegame;

    @FindBy(linkText="Explore FIFA is a series of short animated films that bring you into our world with a visual and easy-to-understand explanation of how we go about carrying out this mission.")
    public ITextArea textAreaExploreFIFAisaseriesofshortanimatedfilmsthatbringyouintoourworldwithavisualandeasytounderstandexplanationofhowwegoaboutcarryingoutthismission;

    @FindBy(linkText="What we stand for")
    public ILink linkWhatwestandfor;

    @FindBy(className="title associations-items-wrap clearfix")
    public ILabel labelAssociations;

    @FindBy(className="title")
    public ILabel labelFocuson;

    @FindBy(className="ma-logo")
    public IImage imageMalogo;

    @FindBy(className="ma-ddl")
    public ICheckBox checkBoxAfghanistanAlbaniaAlgeriaAmericanSamoaAndorraAngolaAnguillaAntiguaandBarbudaArgentinaArmeniaArubaAustraliaAustriaAzerbaijanBahamasBahrainBangladeshBarbadosBelarusBelgiumBelizeBeninBermudaBhutanBoliviaBosniaandHerzegovinaBotswanaBrazilBritishVirginIslandsBruneiDarussalamBulgariaBurkinaFasoBurundiCambodiaCameroonCanadaCapeVerdeIslandsCaymanIslandsCentralAfricanRepublicChadChileChinaPRChineseTaipeiColombiaComorosCongoCongoDRCookIslandsCostaRicaCtedIvoireCroatiaCubaCuracaoCyprusCzechRepublicDenmarkDjiboutiDominicaDominicanRepublicEcuadorEgyptElSalvadorEnglandEquatorialGuineaEritreaEstoniaEthiopiaFaroeIslandsFijiFinlandFranceFYRMacedoniaGabonGambiaGeorgiaGermanyGhanaGreeceGrenadaGuamGuatemalaGuineaGuineaBissauGuyanaHaitiHondurasHongKongHungaryIcelandIndiaIndonesiaIranIraqIsraelItalyJamaicaJapanJordanKazakhstanKenyaKoreaDPRKoreaRepublicKuwaitKyrgyzstanLaosLatviaLebanonLesothoLiberiaLibyaLiechtensteinLithuaniaLuxembourgMacauMadagascarMalawiMalaysiaMaldivesMaliMaltaMauritaniaMauritiusMexicoMoldovaMongoliaMontenegroMontserratMoroccoMozambiqueMyanmarNamibiaNepalNetherlandsNewCaledoniaNewZealandNicaraguaNigerNigeriaNorthernIrelandNorwayOmanPakistanPalestinePanamaPapuaNewGuineaParaguayPeruPhilippinesPolandPortugalPuertoRicoQatarRepublicofIrelandRomaniaRussiaRwandaSamoaSanMarinoSaoTomeePrincipeSaudiArabiaScotlandSenegalSerbiaSeychellesSierraLeoneSingaporeSlovakiaSloveniaSolomonIslandsSomaliaSouthAfricaSouthSudanSpainSriLankaStKittsandNevisStLuciaStVincentandtheGrenadinesSudanSurinameSwazilandSwedenSwitzerlandSyriaTahitiTajikistanTanzaniaThailandTimorLesteTogoTongaTrinidadandTobagoTunisiaTurkeyTurkmenistanTurksandCaicosIslandsUgandaUkraineUnitedArabEmiratesUruguayUSVirginIslandsUSAUzbekistanVanuatuVenezuelaVietnamWalesYemenZambiaZimbabwe;

    @FindBy(className="ma-logo")
    public IImage imageMalogo1;

    @FindBy(linkText="Latest results")
    public ILabel labelLatestresults;

    @FindBy(className="ENG i-4-flag flag")
    public IImage imageENGi4flagflag;

    @FindBy(className="RUS i-4-flag flag")
    public IImage imageRUSi4flagflag;

    @FindBy(className="SRB i-4-flag flag")
    public IImage imageSRBi4flagflag;

    @FindBy(className="RUS i-4-flag flag")
    public IImage imageRUSi4flagflag1;

    @FindBy(className="CZE i-4-flag flag")
    public IImage imageCZEi4flagflag;

    @FindBy(className="RUS i-4-flag flag")
    public IImage imageRUSi4flagflag2;

    @FindBy(linkText="Latest results")
    public ILink linkLatestresults;

    @FindBy(className="title")
    public ILabel labelFIFACocaColaWorldRanking;
/*
    @FindBy(className="table tbl-ranking table-striped")
    public ITable<> tableRankTeamPointsPositions1Argentina150302Belgium138403Colombia132814Germany131015Chile129326Spain12670LASTUPDATEThursday02June2016;
*/
    @FindBy(linkText="Ranking Table")
    public ILink linkRankingTable;

    @FindBy(className="dcm-internal")
    public ILink linkNoName48;

    @FindBy(className="i-lnd-4")
    public IImage imageIlnd46;

    @FindBy(className="dcm-title")
    public ILabel labelNorthernIrelandcontinuingtobreaknewground;

    @FindBy(linkText="Northern Ireland continuing to break new ground")
    public ILink linkNorthernIrelandcontinuingtobreaknewground;

    @FindBy(className="title")
    public ILabel labelTheFIFAcomClub;

    @FindBy(className="dcm-title")
    public ILabel labelNews;

    @FindBy(className="dcm-internal")
    public ILink linkNoName49;

    @FindBy(className="i-lnd-4 dcm-lazy-lazy")
    public IImage imageIlnd4dcmlazylazy4;

    @FindBy(linkText="News")
    public ILink linkNews20;

    @FindBy(className="dcm-title")
    public ILabel labelFIFAPredictor;

    @FindBy(className="dcm-internal")
    public ILink linkNoName50;

    @FindBy(className="i-lnd-4 dcm-lazy-lazy")
    public IImage imageIlnd4dcmlazylazy5;

    @FindBy(linkText="FIFA Predictor")
    public ILink linkFIFAPredictor2;

    @FindBy(className="dcm-title")
    public ILabel labelFIFAUltimateTrivia;

    @FindBy(className="dcm-internal")
    public ILink linkNoName51;

    @FindBy(className="i-lnd-4 dcm-lazy-lazy")
    public IImage imageIlnd4dcmlazylazy6;

    @FindBy(linkText="FIFA Ultimate Trivia")
    public ILink linkFIFAUltimateTrivia1;

    @FindBy(className="title")
    public ILabel labelTheOfficialOnlineStore;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a")
    public ILink linkNoName52;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a/img")
    public IImage imageNoName42;

    @FindBy(linkText="Germany 2016 Home Soccer Jersey w/ Winners Badge")
    public ILabel labelGermany2016HomeSoccerJerseywWinnersBadge1;

    @FindBy(linkText="Germany 2016 Home Soccer Jersey w/ Winners Badge")
    public ILink linkGermany2016HomeSoccerJerseywWinnersBadge1;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a")
    public ILink linkNoName53;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a/img")
    public IImage imageNoName43;

    @FindBy(linkText="Germany 2016 Youth Away Soccer Jersey w/ Winners Badge")
    public ILabel labelGermany2016YouthAwaySoccerJerseywWinnersBadge1;

    @FindBy(linkText="Germany 2016 Youth Away Soccer Jersey w/ Winners Badge")
    public ILink linkGermany2016YouthAwaySoccerJerseywWinnersBadge1;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a")
    public ILink linkNoName54;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a/img")
    public IImage imageNoName44;

    @FindBy(linkText="Germany 2016 Women's Home Soccer Jersey w/ Winners Badge")
    public ILabel labelGermany2016WomensHomeSoccerJerseywWinnersBadge1;

    @FindBy(linkText="Germany 2016 Women's Home Soccer Jersey w/ Winners Badge")
    public ILink linkGermany2016WomensHomeSoccerJerseywWinnersBadge1;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a")
    public ILink linkNoName55;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div/div[@class='slider-wrap']/ul/li[@class='shop-item']/div[@class='shop-item-thumb']/a/img")
    public IImage imageNoName45;

    @FindBy(linkText="Germany 2016 LS Home Keeper Jersey w/ Winners Badge")
    public ILabel labelGermany2016LSHomeKeeperJerseywWinnersBadge1;

    @FindBy(linkText="Germany 2016 LS Home Keeper Jersey w/ Winners Badge")
    public ILink linkGermany2016LSHomeKeeperJerseywWinnersBadge1;

    @FindBy(linkText="Shop Now")
    public ILink linkShopNow1;

    @FindBy(className="title")
    public ILabel labelLatestComments;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div/div[@class='parentcomment']/div[@class='avatarComment']/a")
    public ILink linkNoName56;

    @FindBy(className="avatarContainer80")
    public IImage imageAvatarContainer80;

    @FindBy(linkText="Dunga sacked as Brazil boss")
    public ILink linkDungasackedasBrazilboss;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div[@class='col-xs-6']/div/div[@class='parentcomment']/div[@class='avatarComment']/a")
    public ILink linkNoName57;

    @FindBy(className="avatarContainer80")
    public IImage imageAvatarContainer801;

    @FindBy(linkText="ArgentinaвЂ™s other Gala winner")
    public ILink linkArgentinasotherGalawinner;

    @FindBy(className="title")
    public ILabel labelClassicFootball;

    @FindBy(className="dcm-list-title")
    public ILabel labelPlayers;

    @FindBy(className="dcm-internal")
    public ILink linkNoName58;

    @FindBy(className="i-lnd-3 dcm-lazy-lazy")
    public IImage imageIlnd3dcmlazylazy;

    @FindBy(className="dcm-title")
    public ILabel labelLeonelSancheztheelegantleftfooterwhopackedapunch;

    @FindBy(linkText="Leonel Sanchez, the elegant left-footer who packed a punch")
    public ILink linkLeonelSancheztheelegantleftfooterwhopackedapunch;

    @FindBy(linkText="On 25 April 1936, one of the most important figures in South American football history, the Chilean Leonel Sanchez, was born. FIFA.com pays tribute to the tough, yet silky left-footer who starred for Universidad de Chile and his country.&nbsp;")
    public ITextArea textAreaOn25April1936oneofthemostimportantfiguresinSouthAmericanfootballhistorytheChileanLeonelSanchezwasbornFIFAcompaystributetothetoughyetsilkyleftfooterwhostarredforUniversidaddeChileandhiscountrynbsp;

    @FindBy(className="dcm-list-title")
    public ILabel labelWorldCupMatches;

    @FindBy(className="dcm-internal")
    public ILink linkNoName59;

    @FindBy(className="i-lnd-3 dcm-lazy-lazy")
    public IImage imageIlnd3dcmlazylazy1;

    @FindBy(className="dcm-title")
    public ILabel labelSizzlingBrazilstuntheAzteca;

    @FindBy(linkText="Sizzling Brazil stun the Azteca")
    public ILink linkSizzlingBrazilstuntheAzteca;

    @FindBy(className="dcm-list-title")
    public ILabel labelVideos;

    @FindBy(className="dcm-internal")
    public ILink linkNoName60;

    @FindBy(className="i-lnd-3 dcm-lazy-lazy")
    public IImage imageIlnd3dcmlazylazy2;

    @FindBy(className="dcm-title")
    public ILabel labelInterviewwithAlanKennedyandPhilNeal;

    @FindBy(linkText="Interview with Alan Kennedy and Phil Neal")
    public ILink linkInterviewwithAlanKennedyandPhilNeal;

    @FindBy(className="dcm-list-title")
    public ILabel labelWorldCupQualifiers;

    @FindBy(className="dcm-internal")
    public ILink linkNoName61;

    @FindBy(className="i-lnd-3")
    public IImage imageIlnd3;

    @FindBy(className="dcm-title")
    public ILabel labelIraqmakehistorybyseeingoffSyria;

    @FindBy(linkText="Iraq make history by seeing off Syria")
    public ILink linkIraqmakehistorybyseeingoffSyria;

    @FindBy(xpath="//div[@id='wrap']/div[@id='content-wrap']/div[@class='container']/div/div/div[@class='col-xs-3']/div/div[@class='dcm-summarysection']/p")
    public ITextArea textAreaNoName;

    @FindBy(linkText="We remember the game that sealed IraqвЂ™s maiden appearance at the FIFA World Cup on 29 November 1985, with legendary former forward Ahmed Radhi recalling his memories from the two-legged win over Syria.")
    public ITextArea textAreaWerememberthegamethatsealedIraqsmaidenappearanceattheFIFAWorldCupon29November1985withlegendaryformerforwardAhmedRadhirecallinghismemoriesfromthetwoleggedwinoverSyria;

    @FindBy(linkText="Players")
    public ILink linkPlayers;

    @FindBy(linkText="World Cup Matches")
    public ILink linkWorldCupMatches;

    @FindBy(linkText="Videos")
    public ILink linkVideos1;

    @FindBy(linkText="World Cup Qualifiers")
    public ILink linkWorldCupQualifiers;

    @FindBy(linkText="FIFA Partners")
    public ILabel labelFIFAPartners;

    @FindBy(linkText=" ")
    public ILink linkNoName62;

    @FindBy(linkText=" ")
    public ILink linkNoName63;

    @FindBy(linkText=" ")
    public ILink linkNoName64;

    @FindBy(linkText=" ")
    public ILink linkNoName65;

    @FindBy(linkText=" ")
    public ILink linkNoName66;

    @FindBy(linkText=" ")
    public ILink linkNoName67;

    @FindBy(linkText="About FIFA")
    public ILabel labelAboutFIFA1;

    @FindBy(linkText="FIFA Statutes")
    public ILink linkFIFAStatutes;

    @FindBy(linkText="Laws of the Game")
    public ILink linkLawsoftheGame;

    @FindBy(linkText="Match Agents List")
    public ILink linkMatchAgentsList;

    @FindBy(linkText="Code of Ethics")
    public ILink linkCodeofEthics;

    @FindBy(linkText="International Match Calendar 2014-2018")
    public ILink linkInternationalMatchCalendar20142018;

    @FindBy(linkText="International Match Calendar 2018-2024")
    public ILink linkInternationalMatchCalendar20182024;

    @FindBy(linkText="Women's Football International Calendar")
    public ILink linkWomensFootballInternationalCalendar;

    @FindBy(linkText="FIFA Financial reports")
    public ILink linkFIFAFinancialreports;

    @FindBy(linkText="FIFA Committees")
    public ILink linkFIFACommittees;

    @FindBy(linkText="FIFA Master Course")
    public ILink linkFIFAMasterCourse;

    @FindBy(linkText="Futsal")
    public ILink linkFutsal;

    @FindBy(linkText="Calendar (FIFA events and meetings)")
    public ILink linkCalendarFIFAeventsandmeetings;

    @FindBy(linkText="Official Documents")
    public ILink linkOfficialDocuments;

    @FindBy(linkText="Legal and Disciplinary")
    public ILink linkLegalandDisciplinary;

    @FindBy(linkText="Reporting Mechanism")
    public ILink linkReportingMechanism;

    @FindBy(linkText="Marketing")
    public ILink linkMarketing;

    @FindBy(linkText="Medical")
    public ILink linkMedical;

    @FindBy(linkText="Refereeing")
    public ILink linkRefereeing;

    @FindBy(linkText="Confederations")
    public ILink linkConfederations;

    @FindBy(linkText="Sustainability")
    public ILink linkSustainability2;

    @FindBy(linkText="Quality Turf and Footballs")
    public ILink linkQualityTurfandFootballs;

    @FindBy(linkText="Activity Reports")
    public ILink linkActivityReports;

    @FindBy(linkText="Men's Tournaments")
    public ILabel labelMensTournaments;

    @FindBy(linkText="FIFA World Cupв„ў")
    public ILink linkFIFAWorldCup2;

    @FindBy(linkText="FIFA U-20 World Cup")
    public ILink linkFIFAU20WorldCup;

    @FindBy(linkText="FIFA U-17 World Cup")
    public ILink linkFIFAU17WorldCup;

    @FindBy(linkText="FIFA Confederations Cup")
    public ILink linkFIFAConfederationsCup;

    @FindBy(linkText="FIFA Club World Cup")
    public ILink linkFIFAClubWorldCup;

    @FindBy(linkText="FIFA Futsal World Cup")
    public ILink linkFIFAFutsalWorldCup;

    @FindBy(linkText="FIFA Beach Soccer World Cup")
    public ILink linkFIFABeachSoccerWorldCup;

    @FindBy(linkText="Men's Olympic Football Tournament")
    public ILink linkMensOlympicFootballTournament;

    @FindBy(linkText="FIFA Interactive World Cup")
    public ILink linkFIFAInteractiveWorldCup;

    @FindBy(linkText="Youth Olympic Football Tournament")
    public ILink linkYouthOlympicFootballTournament;

    @FindBy(linkText="Blue Stars/FIFA Youth Cup")
    public ILink linkBlueStarsFIFAYouthCup;

    @FindBy(linkText="Women's Tournaments")
    public ILabel labelWomensTournaments;

    @FindBy(linkText="FIFA Women's World Cupв„ў")
    public ILink linkFIFAWomensWorldCup;

    @FindBy(linkText="FIFA U-20 Women's World Cup")
    public ILink linkFIFAU20WomensWorldCup;

    @FindBy(linkText="FIFA U-17 Women's World Cup")
    public ILink linkFIFAU17WomensWorldCup;

    @FindBy(linkText="Women's Olympic Football Tournament")
    public ILink linkWomensOlympicFootballTournament;

    @FindBy(linkText="Youth Olympic Football Tournament")
    public ILink linkYouthOlympicFootballTournament1;

    @FindBy(linkText="English")
    public ILink linkEnglish1;

    @FindBy(linkText="Deutsch")
    public ILink linkDeutsch1;

    @FindBy(linkText="FranГ§ais")
    public ILink linkFranais1;

    @FindBy(linkText="EspaГ±ol")
    public ILink linkEspaol1;

    @FindBy(linkText="PortuguГЄs")
    public ILink linkPortugus1;

    @FindBy(linkText="Ш№Ш±ШЁЩЉ")
    public ILink linkNoName68;

    @FindBy(linkText="Р СѓСЃСЃРєРёР№")
    public ILink linkNoName69;

    @FindBy(linkText="ж—Ґжњ¬иЄћ")
    public ILink linkNoName70;

    @FindBy(linkText="Korean")
    public ILink linkKorean1;

    @FindBy(linkText="Widgets")
    public ILink linkWidgets;

    @FindBy(linkText="Mobile Apps")
    public ILink linkMobileApps;

    @FindBy(linkText="Mobile Version")
    public ILink linkMobileVersion;

    @FindBy(linkText="Contact FIFA")
    public ILink linkContactFIFA;

    @FindBy(linkText="Downloads")
    public ILink linkDownloads;

    @FindBy(linkText="Privacy Policy")
    public ILink linkPrivacyPolicy;

    @FindBy(linkText="Terms of Service")
    public ILink linkTermsofService;

    @FindBy(className="footer-share-link")
    public ILink linkAllSocialChannels;

    @FindBy(className="ico-24-twitter")
    public ILink linkNoName71;

    @FindBy(className="ico-24-facebook")
    public ILink linkNoName72;

    @FindBy(className="ico-24-instagram")
    public ILink linkNoName73;

    @FindBy(className="ico-24-youtube")
    public ILink linkNoName74;

    @FindBy(className="ico-24-linkedin")
    public ILink linkNoName75;
}
