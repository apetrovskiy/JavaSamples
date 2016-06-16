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
// https://www.mongodb.com/cloud

    @FindBy(className="nav-panel-top__a")
    public ILink linkDocs;

    @FindBy(className="nav-panel-top__a")
    public ILink linkOpenSource;

    @FindBy(className="nav-panel-top__a")
    public ILink linkUniversity;

    @FindBy(xpath="//div[@class='react-root']/div/nav/div/ul/div/a")
    public ILink linkNoName;

    @FindBy(className="flex flex--center-all flex--wrap nav-panel-top__contact")
    public IButton buttonFlexflexcenterallflexwrapnavpaneltopcontact;

    @FindBy(className="input nav-panel-top__input")
    public ITextField textFieldInputnavpaneltopinput;

    @FindBy(className="flex flex--center-all flex--wrap nav-panel-top__search")
    public IButton buttonFlexflexcenterallflexwrapnavpaneltopsearch;

    @FindBy(className="nav-panel-top__a")
    public ILink linkDownload;

    @FindBy(className="                btn-small btn-fill btn-fill--light-green                margin--left-xs nav-panel-top__download              ")
    public IButton buttonDownload;

    @FindBy(className="flex flex--center-y")
    public ILink linkForGiantIdeas;

    @FindBy(className="nav-panel-middle__logo-img")
    public IImage imageNavpanelmiddlelogoimg;

    @FindBy(className="nav-panel-middle__tagline")
    public ITextArea textAreaForGiantIdeas;

    @FindBy(className="font--white")
    public ILink linkreacttext52Solutionsreacttext;

    @FindBy(className="font--white")
    public ILink linkreacttext55Cloudreacttext;

    @FindBy(className="font--white")
    public ILink linkreacttext58Customersreacttext;

    @FindBy(className="font--white")
    public ILink linkreacttext61Resourcesreacttext;

    @FindBy(className="font--white")
    public ILink linkreacttext64AboutUsreacttext;

    @FindBy(partialLinkText="  ")
    public IButton buttonNoName;

    @FindBy(className="nav-cta__header")
    public ILabel labelTryItNow;

    @FindBy(className="nav-cta__a")
    public ILink linkMongoDB32;

    @FindBy(className="nav-cta__a")
    public ILink linkDownloadCenter;

    @FindBy(linkText="Products")
    public ILink linkProducts;

    @FindBy(linkText="MongoDB Enterprise Advanced")
    public ILink linkMongoDBEnterpriseAdvanced;

    @FindBy(linkText="MongoDB Professional")
    public ILink linkMongoDBProfessional;

    @FindBy(linkText="Development Support")
    public ILink linkDevelopmentSupport;

    @FindBy(linkText="Ops Manager")
    public ILink linkOpsManager;

    @FindBy(linkText="Cloud Manager")
    public ILink linkCloudManager;

    @FindBy(linkText="Compass")
    public ILink linkCompass;

    @FindBy(linkText="Connector for BI")
    public ILink linkConnectorforBI;

    @FindBy(linkText="Services")
    public ILink linkServices;

    @FindBy(linkText="Consulting")
    public ILink linkConsulting;

    @FindBy(linkText="Training")
    public ILink linkTraining;

    @FindBy(linkText="Cloud")
    public ILink linkCloud;

    @FindBy(className="nav-cta__header")
    public ILabel labelTryItNow1;

    @FindBy(className="nav-cta__a")
    public ILink linkMongoDB321;

    @FindBy(className="nav-cta__a")
    public ILink linkDownloadCenter1;

    @FindBy(linkText="Success Stories")
    public ILink linkSuccessStories;

    @FindBy(linkText="Government")
    public ILink linkGovernment;

    @FindBy(linkText="Retail")
    public ILink linkRetail;

    @FindBy(linkText="High Tech")
    public ILink linkHighTech;

    @FindBy(linkText="Financial Services")
    public ILink linkFinancialServices;

    @FindBy(linkText="All industries")
    public ILink linkAllindustries;

    @FindBy(linkText="Use Cases")
    public ILink linkUseCases;

    @FindBy(linkText="Single View")
    public ILink linkSingleView;

    @FindBy(linkText="Internet of Things")
    public ILink linkInternetofThings;

    @FindBy(linkText="Mobile")
    public ILink linkMobile;

    @FindBy(linkText="Real-Time Analytics")
    public ILink linkRealTimeAnalytics;

    @FindBy(linkText="Personalization")
    public ILink linkPersonalization;

    @FindBy(linkText="Content Management")
    public ILink linkContentManagement;

    @FindBy(linkText="Catalog")
    public ILink linkCatalog;

    @FindBy(className="nav-cta__header")
    public ILabel labelTryItNow2;

    @FindBy(className="nav-cta__a")
    public ILink linkMongoDB322;

    @FindBy(className="nav-cta__a")
    public ILink linkDownloadCenter2;

    @FindBy(linkText="Resource Center")
    public ILink linkResourceCenter;

    @FindBy(linkText="Webinars")
    public ILink linkWebinars;

    @FindBy(linkText="Presentations")
    public ILink linkPresentations;

    @FindBy(linkText="White Papers")
    public ILink linkWhitePapers;

    @FindBy(linkText="Datasheets")
    public ILink linkDatasheets;

    @FindBy(linkText="Events")
    public ILink linkEvents;

    @FindBy(linkText="Documentation")
    public ILink linkDocumentation;

    @FindBy(linkText="What is MongoDB")
    public ILink linkWhatisMongoDB;

    @FindBy(linkText="Architecture")
    public ILink linkArchitecture;

    @FindBy(linkText="Scalability")
    public ILink linkScalability;

    @FindBy(linkText="NoSQL Database Explained")
    public ILink linkNoSQLDatabaseExplained;

    @FindBy(className="nav-cta__header")
    public ILabel labelStayintheknow;

    @FindBy(className="nav-cta__a")
    public ILink linkSignupforournewsletter;

    @FindBy(linkText="Our Company")
    public ILink linkOurCompany;

    @FindBy(linkText="Leadership")
    public ILink linkLeadership;

    @FindBy(linkText="Investors")
    public ILink linkInvestors;

    @FindBy(linkText="Office Locations")
    public ILink linkOfficeLocations;

    @FindBy(linkText="Contact Us")
    public ILink linkContactUs;

    @FindBy(linkText="Blog")
    public ILink linkBlog;

    @FindBy(linkText="Partners")
    public ILink linkPartners;

    @FindBy(linkText="Press Room")
    public ILink linkPressRoom;

    @FindBy(linkText="Careers")
    public ILink linkCareers;

    @FindBy(linkText="Work at MongoDB")
    public ILink linkWorkatMongoDB;

    @FindBy(linkText="Student Opportunities")
    public ILink linkStudentOpportunities;

    @FindBy(className="header__h1 velocity-animating")
    public ILabel labelMongoDBCloudManager;

    @FindBy(className="header__p velocity-animating")
    public ITextArea textAreaTheeasiestwaytorunMongoDBinthecloudCloudManagersavesyoutimemoneyandhelpsyouprotectyourcustomerexperiencebyeliminatingtheguessworkfromrunningMongoDB;

    @FindBy(linkText="Start your 30-day free trial")
    public ILink linkStartyour30dayfreetrial;

    @FindBy(className="btn-fill btn-fill--light-green margin--xs")
    public IButton buttonStartyour30dayfreetrial;

    @FindBy(linkText="Log in")
    public ILink linkLogin;

    @FindBy(className="btn-hollow btn-hollow--light-green margin--xs")
    public IButton buttonLogin;

    @FindBy(className="font--center")
    public ILabel labelFullPerformanceVisibilitywithComprehensiveMonitoring;

    @FindBy(className="block--full-x")
    public IImage imageBlockfullx;

    @FindBy(linkText="Your application performance depends on your database. Get the insights you need to ensure smooth operations and a great experience for your end users. Receive custom alerts and make critical decisions fast. Integrate Cloud Manager monitoring into your favorite monitoring dashboards.")
    public ITextArea textAreaYourapplicationperformancedependsonyourdatabaseGettheinsightsyouneedtoensuresmoothoperationsandagreatexperienceforyourendusersReceivecustomalertsandmakecriticaldecisionsfastIntegrateCloudManagermonitoringintoyourfavoritemonitoringdashboards;

    @FindBy(linkText="The details you need to see the big picture")
    public ITextArea textAreaThedetailsyouneedtoseethebigpicture;

    @FindBy(linkText="View over 100 database metrics that could impact the experience of your users. Track key performance indicators across dozens of charts. Cloud Manager is the most comprehensive monitoring tool for MongoDB.")
    public ITextArea textAreaViewover100databasemetricsthatcouldimpacttheexperienceofyourusersTrackkeyperformanceindicatorsacrossdozensofchartsCloudManageristhemostcomprehensivemonitoringtoolforMongoDB;

    @FindBy(linkText="Customized alerts delivered how you want")
    public ITextArea textAreaCustomizedalertsdeliveredhowyouwant;

    @FindBy(linkText="Create custom alerts that trigger when key metrics are out of range so incidents donвЂ™t become emergencies. Have your alerts sent to you via email, sms, HipChat, PagerDuty, and more - you choose the channel.")
    public ITextArea textAreaCreatecustomalertsthattriggerwhenkeymetricsareoutofrangesoincidentsdontbecomeemergenciesHaveyouralertssenttoyouviaemailsmsHipChatPagerDutyandmoreyouchoosethechannel;

    @FindBy(linkText="A unified view of your operations")
    public ITextArea textAreaAunifiedviewofyouroperations;

    @FindBy(linkText="Leverage our RESTful API or our packaged integrations with leading APM platforms like New Relic to monitor MongoDB alongside the rest of your application infrastructure, all from a single pane of glass.")
    public ITextArea textAreaLeverageourRESTfulAPIorourpackagedintegrationswithleadingAPMplatformslikeNewRelictomonitorMongoDBalongsidetherestofyourapplicationinfrastructureallfromasinglepaneofglass;

    @FindBy(className="margin--vertical-xs")
    public IImage imageMarginverticalxs;

    @FindBy(className="block-quote")
    public ITextArea textAreaNopainallgainAtRecordedFutureweuseCloudManagertoassessthehealthofour20TBMongoDBdeploymentCloudManagerisagreatwaytovisualisethestatusofoursystemsandavaluabletoolwhentroubleshootingissues;

    @FindBy(linkText="Start your 30-day free trial")
    public ILink linkStartyour30dayfreetrial1;

    @FindBy(className="btn btn-hollow margin--vertical-sm")
    public IButton buttonStartyour30dayfreetrial1;

    @FindBy(linkText="Enabling Fast and Simple Query Optimization")
    public ILabel labelEnablingFastandSimpleQueryOptimization;

    @FindBy(linkText="Cloud Manager allows you to seamlessly identify and address slow-running queries with the Visual Query Profiler, index suggestions, and automated index roll-outs.")
    public ITextArea textAreaCloudManagerallowsyoutoseamlesslyidentifyandaddressslowrunningquerieswiththeVisualQueryProfilerindexsuggestionsandautomatedindexrollouts;

    @FindBy(className="block--full-x")
    public IImage imageBlockfullx1;

    @FindBy(linkText="A better way to analyze queries")
    public ILabel labelAbetterwaytoanalyzequeries;

    @FindBy(linkText="The Visual Query Profiler, which displays how query and write latency varies over time, provides a quick and convenient way for operations teams and DBAs to analyze queries. Activate the profiler with a single click, then sit back as it consolidates and displays metrics from every node in a single screen.")
    public ITextArea textAreaTheVisualQueryProfilerwhichdisplayshowqueryandwritelatencyvariesovertimeprovidesaquickandconvenientwayforoperationsteamsandDBAstoanalyzequeriesActivatetheprofilerwithasingleclickthensitbackasitconsolidatesanddisplaysmetricsfromeverynodeinasinglescreen;

    @FindBy(linkText="A better way to improve performance")
    public ILabel labelAbetterwaytoimproveperformance;

    @FindBy(linkText="The Visual Query Profile analyzes the data it collects and presents you with recommendations for new indexes that can be created to improve query performance. Cloud Manager can then automate the roll-out of new indexes across your production system according to database best practices, allowing you to easily optimize your deployment with minimal effort and risk.")
    public ITextArea textAreaTheVisualQueryProfileanalyzesthedataitcollectsandpresentsyouwithrecommendationsfornewindexesthatcanbecreatedtoimprovequeryperformanceCloudManagercanthenautomatetherolloutofnewindexesacrossyourproductionsystemaccordingtodatabasebestpracticesallowingyoutoeasilyoptimizeyourdeploymentwithminimaleffortandrisk;

    @FindBy(className="margin--vertical-xs")
    public IImage imageMarginverticalxs1;

    @FindBy(className="block-quote")
    public ITextArea textAreaTheoperationalefficiencywegetwithMongoDBiskeyWeareabletorunourentireMongoDBestatewithjustmyselfandoccasionalhelpfrommycolleagueCloudManagercoupledwithproactivesupportiscentraltoachievingthistypeofefficiency;

    @FindBy(linkText="More Efficient Ops with Automated Database Management")
    public ILabel labelMoreEfficientOpswithAutomatedDatabaseManagement;

    @FindBy(linkText="Database management doesn't have to be a hassle. Cloud Manager lets you deploy, upgrade, and grow your databases with ease and zero downtime. Reduce tedious manual steps to just a click of a button.")
    public ITextArea textAreaDatabasemanagementdoesnthavetobeahassleCloudManagerletsyoudeployupgradeandgrowyourdatabaseswitheaseandzerodowntimeReducetediousmanualstepstojustaclickofabutton;

    @FindBy(className="block--full-x")
    public IImage imageBlockfullx2;

    @FindBy(linkText="Reduce human error. Save time and money.")
    public ILabel labelReducehumanerrorSavetimeandmoney;

    @FindBy(linkText="Cloud Manager orchestrates critical operational tasks you currently perform manually across the servers in your MongoDB deployment. It prevents downtime during upgrades and reconfigurations, protects you from human error with built-in operational best practices, and allows you to be 10x-20x more efficient in managing your databases.")
    public ITextArea textAreaCloudManagerorchestratescriticaloperationaltasksyoucurrentlyperformmanuallyacrosstheserversinyourMongoDBdeploymentItpreventsdowntimeduringupgradesandreconfigurationsprotectsyoufromhumanerrorwithbuiltinoperationalbestpracticesandallowsyoutobe10x20xmoreefficientinmanagingyourdatabases;

    @FindBy(linkText="Optimized for Amazon Web Services")
    public ILabel labelOptimizedforAmazonWebServices;

    @FindBy(linkText="Cloud Manager can automatically provision virtual machines on AWS with an optimal configuration for MongoDB at the time you deploy, making it even easier to get started.")
    public ITextArea textAreaCloudManagercanautomaticallyprovisionvirtualmachinesonAWSwithanoptimalconfigurationforMongoDBatthetimeyoudeploymakingiteveneasiertogetstarted;

    @FindBy(className="margin--vertical-xs")
    public IImage imageMarginverticalxs2;

    @FindBy(className="block-quote")
    public ITextArea textAreaEveryoneshouldbeusingCloudManagerItseasytosetupandrunandgivesreallygoodinsightintorunningyourMongoDBimplementation;

    @FindBy(linkText="Start your 30-day free trial")
    public ILink linkStartyour30dayfreetrial2;

    @FindBy(className="btn btn-hollow margin--vertical-sm")
    public IButton buttonStartyour30dayfreetrial2;

    @FindBy(linkText="Gain Peace of Mind with Fully-Managed Backup")
    public ILabel labelGainPeaceofMindwithFullyManagedBackup;

    @FindBy(linkText="Disaster can strike at any time. Cloud Manager is disaster recovery simplified. No more custom scripting, no limitations. Join the thousands of companies that rely on Cloud Manager as part of a comprehensive disaster recovery strategy.")
    public ITextArea textAreaDisastercanstrikeatanytimeCloudManagerisdisasterrecoverysimplifiedNomorecustomscriptingnolimitationsJointhethousandsofcompaniesthatrelyonCloudManageraspartofacomprehensivedisasterrecoverystrategy;

    @FindBy(className="block--full-x")
    public IImage imageBlockfullx3;

    @FindBy(linkText="A hands-off approach to protecting your data and your business")
    public ILabel labelAhandsoffapproachtoprotectingyourdataandyourbusiness;

    @FindBy(linkText="Cloud Manager provides a fully managed backup service to protect your data and your business. You get dedicated MongoDB engineers that monitor your backup 24 hrs a day, 365 days a year. Let us worry about protecting your data so you can focus on your business.")
    public ITextArea textAreaCloudManagerprovidesafullymanagedbackupservicetoprotectyourdataandyourbusinessYougetdedicatedMongoDBengineersthatmonitoryourbackup24hrsaday365daysayearLetusworryaboutprotectingyourdatasoyoucanfocusonyourbusiness;

    @FindBy(linkText="The most complete MongoDB backup solution")
    public ILabel labelThemostcompleteMongoDBbackupsolution;

    @FindBy(linkText="Cloud Manager is the only solution that offers continuous, real-time backup for MongoDB with point-in-time recovery of replica sets and cluster-wide snapshots of sharded clusters. Snapshots can be sent via SCP directly to your server, or a custom URL can be generated to download them. You can rebuild entire running clusters, just from your backups. Fast and seamless recovery. Fast and seamless provisioning of new dev and test environments.")
    public ITextArea textAreaCloudManageristheonlysolutionthatofferscontinuousrealtimebackupforMongoDBwithpointintimerecoveryofreplicasetsandclusterwidesnapshotsofshardedclustersSnapshotscanbesentviaSCPdirectlytoyourserveroracustomURLcanbegeneratedtodownloadthemYoucanrebuildentirerunningclustersjustfromyourbackupsFastandseamlessrecoveryFastandseamlessprovisioningofnewdevandtestenvironments;

    @FindBy(className="margin--vertical-xs")
    public IImage imageMarginverticalxs3;

    @FindBy(className="block-quote")
    public ITextArea textAreaHavingabackupserviceengineeredforMongoDBhasalotofadvantagesCloudManagerbackupgivesussmoothintegrationwithmonitoringasbglightgreyasexcellentgranularityofrestorablesnapshotswithlittleoverhead;

    @FindBy(linkText="Start your 30-day free trial")
    public ILink linkStartyour30dayfreetrial3;

    @FindBy(className="btn btn-hollow margin--vertical-sm")
    public IButton buttonStartyour30dayfreetrial3;

    @FindBy(className="block--full")
    public ILabel labelTrustedbycompaniesaroundtheglobe;

    @FindBy(className="customer-featured")
    public ILink linkCustomerfeatured;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img")
    public IImage imageNoName;

    @FindBy(className="customer-featured")
    public ILink linkCustomerfeatured1;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img")
    public IImage imageNoName1;

    @FindBy(className="customer-featured")
    public ILink linkCustomerfeatured2;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img")
    public IImage imageNoName2;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName3;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName4;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName5;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName6;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName7;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName8;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName9;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName10;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName11;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName12;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName13;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName14;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName15;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName16;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName17;

    @FindBy(xpath="//div[@class='react-root']/div/main/div/div/div/img")
    public IImage imageNoName18;

    @FindBy(linkText="Features and Pricing")
    public ILabel labelFeaturesandPricing;

    @FindBy(linkText="<!-- react-text: 401 -->All Cloud Manager accounts start with a 30-day free trial of Cloud Manager Standard. Cloud Manager Premium is only available with <!-- /react-text -->MongoDB Professional<!-- react-text: 403 --> or <!-- /react-text -->MongoDB Enterprise Advanced.")
    public ITextArea textAreareacttext401AllCloudManageraccountsstartwitha30dayfreetrialofCloudManagerStandardCloudManagerPremiumisonlyavailablewithreacttextMongoDBProfessionalreacttext403orreacttextMongoDBEnterpriseAdvanced;

    @FindBy(linkText="MongoDB Professional")
    public ILink linkMongoDBProfessional1;

    @FindBy(linkText="MongoDB Enterprise Advanced.")
    public ILink linkMongoDBEnterpriseAdvanced1;
/*
    @FindBy(className="table table-striped")
    public ITable<> tableCloudManagerFreeOStartyourfreetrialAvailableforfreewhenyour30daytrialexpiresCloudManagerStandard39reacttext424PerServerreacttextreacttext426PerMonthreacttextStartyourfreetrialreacttext43030dayfreetrialreacttextContactusreacttext432forannualpricingreacttextCloudManagerPremiumTalktousAvailablewithMongoDBEnterpriseAdvancedampProfessionalBackupUnlimitedRestoresBackupPricingreacttext4521stGBfreeperreplicasetthen250GBmoreacttextContactusreacttext454forannualpricingreacttextComprehensiveMonitoringDataRetention24hrsFullhistoricaldataFullhistoricaldataGranularity5minute2minute2minuteCustomAlertingAPMIntegrationAutomationDatabaseCreationDatabaseModificationZeroDowntimeUpgradesandDowngradesAutoProvisioningonAWSRESTfulAPIQueryOptimizationVisualQueryProfilerIndexSuggestionsAutomatedRollingIndexBuilds;
*/
    @FindBy(className="font--center")
    public ILabel labelFrequentlyAskedQuestions;

    @FindBy(className="component-accordion__toggle  component-accordion__toggle--active")
    public ILabel labelWhathappenswhenmy30dayfreetrialexpires;

    @FindBy(linkText="Please add a credit card to your account prior to the expiration date to ensure that your service is not interrupted.")
    public ITextArea textAreaPleaseaddacreditcardtoyouraccountpriortotheexpirationdatetoensurethatyourserviceisnotinterrupted;

    @FindBy(linkText="Your backup will not be affected when your trial period ends.")
    public ITextArea textAreaYourbackupwillnotbeaffectedwhenyourtrialperiodends;

    @FindBy(linkText="If you decline to purchase a monthly or yearly subscription, you will no longer have access to Cloud ManagerвЂ™s automated deployment and upgrade features. You will also no longer have access to our APIs. You will still be able to use Cloud Manager to monitor your MongoDB deployments. With our free tier, you will receive 24 hrs of data retention and 5-minute granularity.")
    public ITextArea textAreaIfyoudeclinetopurchaseamonthlyoryearlysubscriptionyouwillnolongerhaveaccesstoCloudManagersautomateddeploymentandupgradefeaturesYouwillalsonolongerhaveaccesstoourAPIsYouwillstillbeabletouseCloudManagertomonitoryourMongoDBdeploymentsWithourfreetieryouwillreceive24hrsofdataretentionand5minutegranularity;

    @FindBy(className="component-accordion__toggle  component-accordion__toggle--last")
    public ILabel labelHowdoesCloudManagerwork;

    @FindBy(className="font--light-green")
    public ILabel labelAbout;

    @FindBy(linkText="About MongoDB, Inc.")
    public ILink linkAboutMongoDBInc;

    @FindBy(linkText="About MongoDB, Inc.")
    public ITextArea textAreaAboutMongoDBInc;

    @FindBy(linkText="Careers")
    public ILink linkCareers1;

    @FindBy(linkText="Careers")
    public ITextArea textAreaCareers;

    @FindBy(linkText="Contact Us")
    public ILink linkContactUs1;

    @FindBy(linkText="Contact Us")
    public ITextArea textAreaContactUs;

    @FindBy(linkText="Legal Notices")
    public ILink linkLegalNotices;

    @FindBy(linkText="Legal Notices")
    public ITextArea textAreaLegalNotices;

    @FindBy(linkText="Security Information")
    public ILink linkSecurityInformation;

    @FindBy(linkText="Security Information")
    public ITextArea textAreaSecurityInformation;

    @FindBy(linkText="Office Locations")
    public ILink linkOfficeLocations1;

    @FindBy(linkText="Office Locations")
    public ITextArea textAreaOfficeLocations;

    @FindBy(className="font--light-green")
    public ILabel labelLearnMore;

    @FindBy(linkText="NoSQL Database Explained")
    public ILink linkNoSQLDatabaseExplained1;

    @FindBy(linkText="NoSQL Database Explained")
    public ITextArea textAreaNoSQLDatabaseExplained;

    @FindBy(linkText="MongoDB Architecture Guide")
    public ILink linkMongoDBArchitectureGuide;

    @FindBy(linkText="MongoDB Architecture Guide")
    public ITextArea textAreaMongoDBArchitectureGuide;

    @FindBy(linkText="MongoDB Enterprise Advanced")
    public ILink linkMongoDBEnterpriseAdvanced2;

    @FindBy(linkText="MongoDB Enterprise Advanced")
    public ITextArea textAreaMongoDBEnterpriseAdvanced;

    @FindBy(linkText="MongoDB Cloud Manager")
    public ILink linkMongoDBCloudManager;

    @FindBy(linkText="MongoDB Cloud Manager")
    public ITextArea textAreaMongoDBCloudManager;

    @FindBy(linkText="MongoDB Engineering Blog")
    public ILink linkMongoDBEngineeringBlog;

    @FindBy(linkText="MongoDB Engineering Blog")
    public ITextArea textAreaMongoDBEngineeringBlog;

    @FindBy(linkText="FAQ")
    public ILink linkFAQ;

    @FindBy(linkText="FAQ")
    public ITextArea textAreaFAQ;

    @FindBy(className="font--light-green")
    public ILabel labelMongoDBUniversity;

    @FindBy(linkText="View Course Catalog")
    public ILink linkViewCourseCatalog;

    @FindBy(linkText="View Course Catalog")
    public ITextArea textAreaViewCourseCatalog;

    @FindBy(linkText="View Course Schedule")
    public ILink linkViewCourseSchedule;

    @FindBy(linkText="View Course Schedule")
    public ITextArea textAreaViewCourseSchedule;

    @FindBy(linkText="Public Training")
    public ILink linkPublicTraining;

    @FindBy(linkText="Public Training")
    public ITextArea textAreaPublicTraining;

    @FindBy(linkText="Certification")
    public ILink linkCertification;

    @FindBy(linkText="Certification")
    public ITextArea textAreaCertification;

    @FindBy(className="font--light-green")
    public ILabel labelDocs;

    @FindBy(linkText="MongoDB Manual")
    public ILink linkMongoDBManual;

    @FindBy(linkText="MongoDB Manual")
    public ITextArea textAreaMongoDBManual;

    @FindBy(linkText="Installation")
    public ILink linkInstallation;

    @FindBy(linkText="Installation")
    public ITextArea textAreaInstallation;

    @FindBy(linkText="FAQ")
    public ILink linkFAQ1;

    @FindBy(linkText="FAQ")
    public ITextArea textAreaFAQ1;

    @FindBy(className="font--light-green")
    public ILabel labelPopularTopics;

    @FindBy(linkText="AWS Backup Tools")
    public ILink linkAWSBackupTools;

    @FindBy(linkText="Database Security")
    public ILink linkDatabaseSecurity;

    @FindBy(linkText="Cloud Based Database")
    public ILink linkCloudBasedDatabase;

    @FindBy(linkText="When To Use NoSQL Database")
    public ILink linkWhenToUseNoSQLDatabase;

    @FindBy(linkText="Gartner Magic Quadrant")
    public ILink linkGartnerMagicQuadrant;

    @FindBy(linkText="Simplify Database Operation")
    public ILink linkSimplifyDatabaseOperation;

    @FindBy(linkText="Visualize Database Performance")
    public ILink linkVisualizeDatabasePerformance;

    @FindBy(linkText="Enterprise Data Center")
    public ILink linkEnterpriseDataCenter;

    @FindBy(linkText="Database Schema Design")
    public ILink linkDatabaseSchemaDesign;

    @FindBy(linkText="<!-- react-text: 623 -->Copyright В© <!-- /react-text --><!-- react-text: 624 -->2016<!-- /react-text --><!-- react-text: 625 --> MongoDB, Inc.<!-- /react-text --><!-- react-text: 627 -->Mongo, MongoDB, and the MongoDB leaf logo are registered trademarks of MongoDB, Inc.<!-- /react-text -->")
    public ITextArea textAreareacttext623Copyrightreacttextreacttext6242016reacttextreacttext625MongoDBIncreacttextreacttext627MongoMongoDBandtheMongoDBleaflogoareregisteredtrademarksofMongoDBIncreacttext;

    @FindBy(linkText="Follow Us")
    public ILabel labelFollowUs;

    @FindBy(partialLinkText="Github")
    public ILink linkNoName1;

    @FindBy(linkText="Github")
    public ITextArea textAreaGithub;

    @FindBy(partialLinkText="Twitter")
    public ILink linkNoName2;

    @FindBy(linkText="Twitter")
    public ITextArea textAreaTwitter;

    @FindBy(partialLinkText="Facebook")
    public ILink linkNoName3;

    @FindBy(linkText="Facebook")
    public ITextArea textAreaFacebook;

    @FindBy(partialLinkText="Youtube")
    public ILink linkNoName4;

    @FindBy(linkText="Youtube")
    public ITextArea textAreaYoutube;

    @FindBy(id="db_pixel_ad")
    public IImage imageDbpixelad;

    @FindBy(id="db_pixel_rt")
    public IImage imageDbpixelrt;

    @FindBy(xpath="//img")
    public IImage imageNoName19;

    @FindBy(xpath="//img")
    public IImage imageNoName20;

    @FindBy(xpath="//img")
    public IImage imageNoName21;

    @FindBy(xpath="//img")
    public IImage imageNoName22;

    @FindBy(xpath="//img")
    public IImage imageNoName23;

    @FindBy(xpath="//img")
    public IImage imageNoName24;

    @FindBy(xpath="//img")
    public IImage imageNoName25;

    @FindBy(xpath="//img")
    public IImage imageNoName26;

    @FindBy(xpath="//img")
    public IImage imageNoName27;
}
