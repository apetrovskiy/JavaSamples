package com.test.mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.pagefactory.ByAll;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.List;

/**
 * Created by Alexander_Petrovskiy on 6/14/2016.
 */
public class Starter {
    static String elementFound = "0";
    static String elementDisplayed = "0";
    static Date previousTime;
    static Date currentTime;
    static Instant time = Instant.now();
    //Delimiter used in CSV file
    private static String COMMA_DELIMITER = ",";
    private static String NEW_LINE_SEPARATOR = "\n";

    static int displayedElementsNumber = 0;
    static int foundElementsNumber = 0;
    static int allElementsNumber = 0;
    static WebDriver driver;
    static FileWriter fileWriter;

    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.mongodb.com/cloud");
        // driver.get("http://www.fifa.com");
        driver.navigate();
        List<WebElement> elements = driver.findElements(ByAll.xpath("//*"));
        System.out.println("==========================================================================================");
        System.out.println(elements.size());
        System.out.println("==========================================================================================");

        String fileName = "D:/333/se_output.txt";
        fileWriter = new FileWriter(fileName);

        try {
            //CSV file header
            final String FILE_HEADER = "locatorType,locator,found,displayed";
            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);

            testLocator(By.className("nav-panel-top__a"), "className", "nav-panel-top__a");
            testLocator(By.className("nav-panel-top__a"), "className", "nav-panel-top__a");
            testLocator(By.className("nav-panel-top__a"), "className", "nav-panel-top__a");
            testLocator(By.xpath("//div[@class='react-root']/div/nav/div/ul/div/a"), "xpath", "//div[@class='react-root']/div/nav/div/ul/div/a");
            testLocator(By.className("flex flex--center-all flex--wrap nav-panel-top__contact"), "className", "flex flex--center-all flex--wrap nav-panel-top__contact");
            testLocator(By.className("input nav-panel-top__input"), "className", "input nav-panel-top__input");
            testLocator(By.className("flex flex--center-all flex--wrap nav-panel-top__search"), "className", "flex flex--center-all flex--wrap nav-panel-top__search");
            testLocator(By.className("nav-panel-top__a"), "className", "nav-panel-top__a");
            testLocator(By.className("                btn-small btn-fill btn-fill--light-green                margin--left-xs nav-panel-top__download              "), "className", "                btn-small btn-fill btn-fill--light-green                margin--left-xs nav-panel-top__download              ");
            testLocator(By.className("flex flex--center-y"), "className", "flex flex--center-y");
            testLocator(By.className("nav-panel-middle__logo-img"), "className", "nav-panel-middle__logo-img");
            testLocator(By.className("nav-panel-middle__tagline"), "className", "nav-panel-middle__tagline");
            testLocator(By.className("font--white"), "className", "font--white");
            testLocator(By.className("font--white"), "className", "font--white");
            testLocator(By.className("font--white"), "className", "font--white");
            testLocator(By.className("font--white"), "className", "font--white");
            testLocator(By.className("font--white"), "className", "font--white");
            testLocator(By.partialLinkText("  "), "partialLinkText", "  ");
            testLocator(By.className("nav-cta__header"), "className", "nav-cta__header");
            testLocator(By.className("nav-cta__a"), "className", "nav-cta__a");
            testLocator(By.className("nav-cta__a"), "className", "nav-cta__a");
            testLocator(By.linkText("Products"), "linkText", "Products");
            testLocator(By.linkText("MongoDB Enterprise Advanced"), "linkText", "MongoDB Enterprise Advanced");
            testLocator(By.linkText("MongoDB Professional"), "linkText", "MongoDB Professional");
            testLocator(By.linkText("Development Support"), "linkText", "Development Support");
            testLocator(By.linkText("Ops Manager"), "linkText", "Ops Manager");
            testLocator(By.linkText("Cloud Manager"), "linkText", "Cloud Manager");
            testLocator(By.linkText("Compass"), "linkText", "Compass");
            testLocator(By.linkText("Connector for BI"), "linkText", "Connector for BI");
            testLocator(By.linkText("Services"), "linkText", "Services");
            testLocator(By.linkText("Consulting"), "linkText", "Consulting");
            testLocator(By.linkText("Training"), "linkText", "Training");
            testLocator(By.linkText("Cloud"), "linkText", "Cloud");
            testLocator(By.className("nav-cta__header"), "className", "nav-cta__header");
            testLocator(By.className("nav-cta__a"), "className", "nav-cta__a");
            testLocator(By.className("nav-cta__a"), "className", "nav-cta__a");
            testLocator(By.linkText("Success Stories"), "linkText", "Success Stories");
            testLocator(By.linkText("Government"), "linkText", "Government");
            testLocator(By.linkText("Retail"), "linkText", "Retail");
            testLocator(By.linkText("High Tech"), "linkText", "High Tech");
            testLocator(By.linkText("Financial Services"), "linkText", "Financial Services");
            testLocator(By.linkText("All industries"), "linkText", "All industries");
            testLocator(By.linkText("Use Cases"), "linkText", "Use Cases");
            testLocator(By.linkText("Single View"), "linkText", "Single View");
            testLocator(By.linkText("Internet of Things"), "linkText", "Internet of Things");
            testLocator(By.linkText("Mobile"), "linkText", "Mobile");
            testLocator(By.linkText("Real-Time Analytics"), "linkText", "Real-Time Analytics");
            testLocator(By.linkText("Personalization"), "linkText", "Personalization");
            testLocator(By.linkText("Content Management"), "linkText", "Content Management");
            testLocator(By.linkText("Catalog"), "linkText", "Catalog");
            testLocator(By.className("nav-cta__header"), "className", "nav-cta__header");
            testLocator(By.className("nav-cta__a"), "className", "nav-cta__a");
            testLocator(By.className("nav-cta__a"), "className", "nav-cta__a");
            testLocator(By.linkText("Resource Center"), "linkText", "Resource Center");
            testLocator(By.linkText("Webinars"), "linkText", "Webinars");
            testLocator(By.linkText("Presentations"), "linkText", "Presentations");
            testLocator(By.linkText("White Papers"), "linkText", "White Papers");
            testLocator(By.linkText("Datasheets"), "linkText", "Datasheets");
            testLocator(By.linkText("Events"), "linkText", "Events");
            testLocator(By.linkText("Documentation"), "linkText", "Documentation");
            testLocator(By.linkText("What is MongoDB"), "linkText", "What is MongoDB");
            testLocator(By.linkText("Architecture"), "linkText", "Architecture");
            testLocator(By.linkText("Scalability"), "linkText", "Scalability");
            testLocator(By.linkText("NoSQL Database Explained"), "linkText", "NoSQL Database Explained");
            testLocator(By.className("nav-cta__header"), "className", "nav-cta__header");
            testLocator(By.className("nav-cta__a"), "className", "nav-cta__a");
            testLocator(By.linkText("Our Company"), "linkText", "Our Company");
            testLocator(By.linkText("Leadership"), "linkText", "Leadership");
            testLocator(By.linkText("Investors"), "linkText", "Investors");
            testLocator(By.linkText("Office Locations"), "linkText", "Office Locations");
            testLocator(By.linkText("Contact Us"), "linkText", "Contact Us");
            testLocator(By.linkText("Blog"), "linkText", "Blog");
            testLocator(By.linkText("Partners"), "linkText", "Partners");
            testLocator(By.linkText("Press Room"), "linkText", "Press Room");
            testLocator(By.linkText("Careers"), "linkText", "Careers");
            testLocator(By.linkText("Work at MongoDB"), "linkText", "Work at MongoDB");
            testLocator(By.linkText("Student Opportunities"), "linkText", "Student Opportunities");
            testLocator(By.className("header__h1 velocity-animating"), "className", "header__h1 velocity-animating");
            testLocator(By.className("header__p velocity-animating"), "className", "header__p velocity-animating");
            testLocator(By.linkText("Start your 30-day free trial"), "linkText", "Start your 30-day free trial");
            testLocator(By.className("btn-fill btn-fill--light-green margin--xs"), "className", "btn-fill btn-fill--light-green margin--xs");
            testLocator(By.linkText("Log in"), "linkText", "Log in");
            testLocator(By.className("btn-hollow btn-hollow--light-green margin--xs"), "className", "btn-hollow btn-hollow--light-green margin--xs");
            testLocator(By.className("font--center"), "className", "font--center");
            testLocator(By.className("block--full-x"), "className", "block--full-x");
            testLocator(By.linkText("Your application performance depends on your database. Get the insights you need to ensure smooth operations and a great experience for your end users. Receive custom alerts and make critical decisions fast. Integrate Cloud Manager monitoring into your favorite monitoring dashboards."), "linkText", "Your application performance depends on your database. Get the insights you need to ensure smooth operations and a great experience for your end users. Receive custom alerts and make critical decisions fast. Integrate Cloud Manager monitoring into your favorite monitoring dashboards.");
            testLocator(By.linkText("The details you need to see the big picture"), "linkText", "The details you need to see the big picture");
            testLocator(By.linkText("View over 100 database metrics that could impact the experience of your users. Track key performance indicators across dozens of charts. Cloud Manager is the most comprehensive monitoring tool for MongoDB."), "linkText", "View over 100 database metrics that could impact the experience of your users. Track key performance indicators across dozens of charts. Cloud Manager is the most comprehensive monitoring tool for MongoDB.");
            testLocator(By.linkText("Customized alerts delivered how you want"), "linkText", "Customized alerts delivered how you want");
            testLocator(By.linkText("Create custom alerts that trigger when key metrics are out of range so incidents donвЂ™t become emergencies. Have your alerts sent to you via email, sms, HipChat, PagerDuty, and more - you choose the channel."), "linkText", "Create custom alerts that trigger when key metrics are out of range so incidents donвЂ™t become emergencies. Have your alerts sent to you via email, sms, HipChat, PagerDuty, and more - you choose the channel.");
            testLocator(By.linkText("A unified view of your operations"), "linkText", "A unified view of your operations");
            testLocator(By.linkText("Leverage our RESTful API or our packaged integrations with leading APM platforms like New Relic to monitor MongoDB alongside the rest of your application infrastructure, all from a single pane of glass."), "linkText", "Leverage our RESTful API or our packaged integrations with leading APM platforms like New Relic to monitor MongoDB alongside the rest of your application infrastructure, all from a single pane of glass.");
            testLocator(By.className("margin--vertical-xs"), "className", "margin--vertical-xs");
            testLocator(By.className("block-quote"), "className", "block-quote");
            testLocator(By.linkText("Start your 30-day free trial"), "linkText", "Start your 30-day free trial");
            testLocator(By.className("btn btn-hollow margin--vertical-sm"), "className", "btn btn-hollow margin--vertical-sm");
            testLocator(By.linkText("Enabling Fast and Simple Query Optimization"), "linkText", "Enabling Fast and Simple Query Optimization");
            testLocator(By.linkText("Cloud Manager allows you to seamlessly identify and address slow-running queries with the Visual Query Profiler, index suggestions, and automated index roll-outs."), "linkText", "Cloud Manager allows you to seamlessly identify and address slow-running queries with the Visual Query Profiler, index suggestions, and automated index roll-outs.");
            testLocator(By.className("block--full-x"), "className", "block--full-x");
            testLocator(By.linkText("A better way to analyze queries"), "linkText", "A better way to analyze queries");
            testLocator(By.linkText("The Visual Query Profiler, which displays how query and write latency varies over time, provides a quick and convenient way for operations teams and DBAs to analyze queries. Activate the profiler with a single click, then sit back as it consolidates and displays metrics from every node in a single screen."), "linkText", "The Visual Query Profiler, which displays how query and write latency varies over time, provides a quick and convenient way for operations teams and DBAs to analyze queries. Activate the profiler with a single click, then sit back as it consolidates and displays metrics from every node in a single screen.");
            testLocator(By.linkText("A better way to improve performance"), "linkText", "A better way to improve performance");
            testLocator(By.linkText("The Visual Query Profile analyzes the data it collects and presents you with recommendations for new indexes that can be created to improve query performance. Cloud Manager can then automate the roll-out of new indexes across your production system according to database best practices, allowing you to easily optimize your deployment with minimal effort and risk."), "linkText", "The Visual Query Profile analyzes the data it collects and presents you with recommendations for new indexes that can be created to improve query performance. Cloud Manager can then automate the roll-out of new indexes across your production system according to database best practices, allowing you to easily optimize your deployment with minimal effort and risk.");
            testLocator(By.className("margin--vertical-xs"), "className", "margin--vertical-xs");
            testLocator(By.className("block-quote"), "className", "block-quote");
            testLocator(By.linkText("More Efficient Ops with Automated Database Management"), "linkText", "More Efficient Ops with Automated Database Management");
            testLocator(By.linkText("Database management doesn't have to be a hassle. Cloud Manager lets you deploy, upgrade, and grow your databases with ease and zero downtime. Reduce tedious manual steps to just a click of a button."), "linkText", "Database management doesn't have to be a hassle. Cloud Manager lets you deploy, upgrade, and grow your databases with ease and zero downtime. Reduce tedious manual steps to just a click of a button.");
            testLocator(By.className("block--full-x"), "className", "block--full-x");
            testLocator(By.linkText("Reduce human error. Save time and money."), "linkText", "Reduce human error. Save time and money.");
            testLocator(By.linkText("Cloud Manager orchestrates critical operational tasks you currently perform manually across the servers in your MongoDB deployment. It prevents downtime during upgrades and reconfigurations, protects you from human error with built-in operational best practices, and allows you to be 10x-20x more efficient in managing your databases."), "linkText", "Cloud Manager orchestrates critical operational tasks you currently perform manually across the servers in your MongoDB deployment. It prevents downtime during upgrades and reconfigurations, protects you from human error with built-in operational best practices, and allows you to be 10x-20x more efficient in managing your databases.");
            testLocator(By.linkText("Optimized for Amazon Web Services"), "linkText", "Optimized for Amazon Web Services");
            testLocator(By.linkText("Cloud Manager can automatically provision virtual machines on AWS with an optimal configuration for MongoDB at the time you deploy, making it even easier to get started."), "linkText", "Cloud Manager can automatically provision virtual machines on AWS with an optimal configuration for MongoDB at the time you deploy, making it even easier to get started.");
            testLocator(By.className("margin--vertical-xs"), "className", "margin--vertical-xs");
            testLocator(By.className("block-quote"), "className", "block-quote");
            testLocator(By.linkText("Start your 30-day free trial"), "linkText", "Start your 30-day free trial");
            testLocator(By.className("btn btn-hollow margin--vertical-sm"), "className", "btn btn-hollow margin--vertical-sm");
            testLocator(By.linkText("Gain Peace of Mind with Fully-Managed Backup"), "linkText", "Gain Peace of Mind with Fully-Managed Backup");
            testLocator(By.linkText("Disaster can strike at any time. Cloud Manager is disaster recovery simplified. No more custom scripting, no limitations. Join the thousands of companies that rely on Cloud Manager as part of a comprehensive disaster recovery strategy."), "linkText", "Disaster can strike at any time. Cloud Manager is disaster recovery simplified. No more custom scripting, no limitations. Join the thousands of companies that rely on Cloud Manager as part of a comprehensive disaster recovery strategy.");
            testLocator(By.className("block--full-x"), "className", "block--full-x");
            testLocator(By.linkText("A hands-off approach to protecting your data and your business"), "linkText", "A hands-off approach to protecting your data and your business");
            testLocator(By.linkText("Cloud Manager provides a fully managed backup service to protect your data and your business. You get dedicated MongoDB engineers that monitor your backup 24 hrs a day, 365 days a year. Let us worry about protecting your data so you can focus on your business."), "linkText", "Cloud Manager provides a fully managed backup service to protect your data and your business. You get dedicated MongoDB engineers that monitor your backup 24 hrs a day, 365 days a year. Let us worry about protecting your data so you can focus on your business.");
            testLocator(By.linkText("The most complete MongoDB backup solution"), "linkText", "The most complete MongoDB backup solution");
            testLocator(By.linkText("Cloud Manager is the only solution that offers continuous, real-time backup for MongoDB with point-in-time recovery of replica sets and cluster-wide snapshots of sharded clusters. Snapshots can be sent via SCP directly to your server, or a custom URL can be generated to download them. You can rebuild entire running clusters, just from your backups. Fast and seamless recovery. Fast and seamless provisioning of new dev and test environments."), "linkText", "Cloud Manager is the only solution that offers continuous, real-time backup for MongoDB with point-in-time recovery of replica sets and cluster-wide snapshots of sharded clusters. Snapshots can be sent via SCP directly to your server, or a custom URL can be generated to download them. You can rebuild entire running clusters, just from your backups. Fast and seamless recovery. Fast and seamless provisioning of new dev and test environments.");
            testLocator(By.className("margin--vertical-xs"), "className", "margin--vertical-xs");
            testLocator(By.className("block-quote"), "className", "block-quote");
            testLocator(By.linkText("Start your 30-day free trial"), "linkText", "Start your 30-day free trial");
            testLocator(By.className("btn btn-hollow margin--vertical-sm"), "className", "btn btn-hollow margin--vertical-sm");
            testLocator(By.className("block--full"), "className", "block--full");
            testLocator(By.className("customer-featured"), "className", "customer-featured");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img");
            testLocator(By.className("customer-featured"), "className", "customer-featured");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img");
            testLocator(By.className("customer-featured"), "className", "customer-featured");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/a[@class='customer-featured']/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.xpath("//div[@class='react-root']/div/main/div/div/div/img"), "xpath", "//div[@class='react-root']/div/main/div/div/div/img");
            testLocator(By.linkText("Features and Pricing"), "linkText", "Features and Pricing");
            testLocator(By.linkText("<!-- react-text: 401 -->All Cloud Manager accounts start with a 30-day free trial of Cloud Manager Standard. Cloud Manager Premium is only available with <!-- /react-text -->MongoDB Professional<!-- react-text: 403 --> or <!-- /react-text -->MongoDB Enterprise Advanced."), "linkText", "<!-- react-text: 401 -->All Cloud Manager accounts start with a 30-day free trial of Cloud Manager Standard. Cloud Manager Premium is only available with <!-- /react-text -->MongoDB Professional<!-- react-text: 403 --> or <!-- /react-text -->MongoDB Enterprise Advanced.");
            testLocator(By.linkText("MongoDB Professional"), "linkText", "MongoDB Professional");
            testLocator(By.linkText("MongoDB Enterprise Advanced."), "linkText", "MongoDB Enterprise Advanced.");
            testLocator(By.className("table table-striped"), "className", "table table-striped");
            testLocator(By.className("font--center"), "className", "font--center");
            testLocator(By.className("component-accordion__toggle  component-accordion__toggle--active"), "className", "component-accordion__toggle  component-accordion__toggle--active");
            testLocator(By.linkText("Please add a credit card to your account prior to the expiration date to ensure that your service is not interrupted."), "linkText", "Please add a credit card to your account prior to the expiration date to ensure that your service is not interrupted.");
            testLocator(By.linkText("Your backup will not be affected when your trial period ends."), "linkText", "Your backup will not be affected when your trial period ends.");
            testLocator(By.linkText("If you decline to purchase a monthly or yearly subscription, you will no longer have access to Cloud ManagerвЂ™s automated deployment and upgrade features. You will also no longer have access to our APIs. You will still be able to use Cloud Manager to monitor your MongoDB deployments. With our free tier, you will receive 24 hrs of data retention and 5-minute granularity."), "linkText", "If you decline to purchase a monthly or yearly subscription, you will no longer have access to Cloud ManagerвЂ™s automated deployment and upgrade features. You will also no longer have access to our APIs. You will still be able to use Cloud Manager to monitor your MongoDB deployments. With our free tier, you will receive 24 hrs of data retention and 5-minute granularity.");
            testLocator(By.className("component-accordion__toggle  component-accordion__toggle--last"), "className", "component-accordion__toggle  component-accordion__toggle--last");
            testLocator(By.className("font--light-green"), "className", "font--light-green");
            testLocator(By.linkText("About MongoDB, Inc."), "linkText", "About MongoDB, Inc.");
            testLocator(By.linkText("About MongoDB, Inc."), "linkText", "About MongoDB, Inc.");
            testLocator(By.linkText("Careers"), "linkText", "Careers");
            testLocator(By.linkText("Careers"), "linkText", "Careers");
            testLocator(By.linkText("Contact Us"), "linkText", "Contact Us");
            testLocator(By.linkText("Contact Us"), "linkText", "Contact Us");
            testLocator(By.linkText("Legal Notices"), "linkText", "Legal Notices");
            testLocator(By.linkText("Legal Notices"), "linkText", "Legal Notices");
            testLocator(By.linkText("Security Information"), "linkText", "Security Information");
            testLocator(By.linkText("Security Information"), "linkText", "Security Information");
            testLocator(By.linkText("Office Locations"), "linkText", "Office Locations");
            testLocator(By.linkText("Office Locations"), "linkText", "Office Locations");
            testLocator(By.linkText("Code of Conduct"), "linkText", "Code of Conduct");
            testLocator(By.linkText("Code of Conduct"), "linkText", "Code of Conduct");
            testLocator(By.className("font--light-green"), "className", "font--light-green");
            testLocator(By.linkText("NoSQL Database Explained"), "linkText", "NoSQL Database Explained");
            testLocator(By.linkText("NoSQL Database Explained"), "linkText", "NoSQL Database Explained");
            testLocator(By.linkText("MongoDB Architecture Guide"), "linkText", "MongoDB Architecture Guide");
            testLocator(By.linkText("MongoDB Architecture Guide"), "linkText", "MongoDB Architecture Guide");
            testLocator(By.linkText("MongoDB Enterprise Advanced"), "linkText", "MongoDB Enterprise Advanced");
            testLocator(By.linkText("MongoDB Enterprise Advanced"), "linkText", "MongoDB Enterprise Advanced");
            testLocator(By.linkText("MongoDB Cloud Manager"), "linkText", "MongoDB Cloud Manager");
            testLocator(By.linkText("MongoDB Cloud Manager"), "linkText", "MongoDB Cloud Manager");
            testLocator(By.linkText("MongoDB Engineering Blog"), "linkText", "MongoDB Engineering Blog");
            testLocator(By.linkText("MongoDB Engineering Blog"), "linkText", "MongoDB Engineering Blog");
            testLocator(By.linkText("FAQ"), "linkText", "FAQ");
            testLocator(By.linkText("FAQ"), "linkText", "FAQ");
            testLocator(By.className("font--light-green"), "className", "font--light-green");
            testLocator(By.linkText("View Course Catalog"), "linkText", "View Course Catalog");
            testLocator(By.linkText("View Course Catalog"), "linkText", "View Course Catalog");
            testLocator(By.linkText("View Course Schedule"), "linkText", "View Course Schedule");
            testLocator(By.linkText("View Course Schedule"), "linkText", "View Course Schedule");
            testLocator(By.linkText("Public Training"), "linkText", "Public Training");
            testLocator(By.linkText("Public Training"), "linkText", "Public Training");
            testLocator(By.linkText("Certification"), "linkText", "Certification");
            testLocator(By.linkText("Certification"), "linkText", "Certification");
            testLocator(By.className("font--light-green"), "className", "font--light-green");
            testLocator(By.linkText("MongoDB Manual"), "linkText", "MongoDB Manual");
            testLocator(By.linkText("MongoDB Manual"), "linkText", "MongoDB Manual");
            testLocator(By.linkText("Installation"), "linkText", "Installation");
            testLocator(By.linkText("Installation"), "linkText", "Installation");
            testLocator(By.linkText("FAQ"), "linkText", "FAQ");
            testLocator(By.linkText("FAQ"), "linkText", "FAQ");
            testLocator(By.className("font--light-green"), "className", "font--light-green");
            testLocator(By.linkText("Gartner NoSQL Database"), "linkText", "Gartner NoSQL Database");
            testLocator(By.linkText("Fully Managed MongoDB"), "linkText", "Fully Managed MongoDB");
            testLocator(By.linkText("Database Performance Tuning"), "linkText", "Database Performance Tuning");
            testLocator(By.linkText("NoSQL Database Gartner Magic Quadrant"), "linkText", "NoSQL Database Gartner Magic Quadrant");
            testLocator(By.linkText("Cloud Based Database"), "linkText", "Cloud Based Database");
            testLocator(By.linkText("AWS Backup"), "linkText", "AWS Backup");
            testLocator(By.linkText("NoSQL Database Implementation Considerations"), "linkText", "NoSQL Database Implementation Considerations");
            testLocator(By.linkText("Database Automation"), "linkText", "Database Automation");
            testLocator(By.linkText("Database Backup Solution"), "linkText", "Database Backup Solution");
            testLocator(By.linkText("<!-- react-text: 626 -->Copyright В© <!-- /react-text --><!-- react-text: 627 -->2016<!-- /react-text --><!-- react-text: 628 --> MongoDB, Inc.<!-- /react-text --><!-- react-text: 630 -->Mongo, MongoDB, and the MongoDB leaf logo are registered trademarks of MongoDB, Inc.<!-- /react-text -->"), "linkText", "<!-- react-text: 626 -->Copyright В© <!-- /react-text --><!-- react-text: 627 -->2016<!-- /react-text --><!-- react-text: 628 --> MongoDB, Inc.<!-- /react-text --><!-- react-text: 630 -->Mongo, MongoDB, and the MongoDB leaf logo are registered trademarks of MongoDB, Inc.<!-- /react-text -->");
            testLocator(By.linkText("Follow Us"), "linkText", "Follow Us");
            testLocator(By.partialLinkText("Github"), "partialLinkText", "Github");
            testLocator(By.linkText("Github"), "linkText", "Github");
            testLocator(By.partialLinkText("Twitter"), "partialLinkText", "Twitter");
            testLocator(By.linkText("Twitter"), "linkText", "Twitter");
            testLocator(By.partialLinkText("Facebook"), "partialLinkText", "Facebook");
            testLocator(By.linkText("Facebook"), "linkText", "Facebook");
            testLocator(By.partialLinkText("Youtube"), "partialLinkText", "Youtube");
            testLocator(By.linkText("Youtube"), "linkText", "Youtube");
            testLocator(By.id("db_pixel_ad"), "id", "db_pixel_ad");
            testLocator(By.id("db_pixel_rt"), "id", "db_pixel_rt");
            testLocator(By.xpath("//img"), "xpath", "//img");


            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }

        System.out.println("accessible rate: " + foundElementsNumber + "/" + allElementsNumber);
        System.out.println("displayed rate: " + displayedElementsNumber + "/" + allElementsNumber);

        driver.close();
    }

    // static void writeData(FileWriter fileWriter, String locatorType, String locatorPath, String elementFound, String elementDisplayed) {
    static void writeData(String locatorType, String locatorPath, String elementFound, String elementDisplayed) {
        try {
            fileWriter.append(locatorType);
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(locatorPath);
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(elementFound);
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(elementDisplayed);
            fileWriter.append(COMMA_DELIMITER);
            Instant newTime = Instant.now();
            fileWriter.append(Long.toString(java.time.Duration.between(time, newTime).toMillis()));
            time = newTime;
            fileWriter.append(NEW_LINE_SEPARATOR);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void testLocator(org.openqa.selenium.By by, String locatorName, String locatorPath) {
        try {
            elementFound = "0";
            elementDisplayed = "0";
            allElementsNumber++;
            WebElement element = driver.findElement(by);
            foundElementsNumber++;
            elementFound = "1";
            if (element.isDisplayed()) {
                displayedElementsNumber++;
                elementDisplayed = "1";
            }
        } catch (Exception e) {
            System.out.println("failed: " + locatorPath);
        }
        writeData(locatorName, locatorPath, elementFound, elementDisplayed);
    }
}
