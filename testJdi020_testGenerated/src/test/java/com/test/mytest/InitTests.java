package com.test.mytest;

import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Alexander_Petrovskiy on 6/3/2016.
 */
public class InitTests extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void suiteSetUp() {
        JDISettings.logger.info("Starting tests");
        JDISettings.driverFactory.setDriverPath("C:\\Selenium");
        WebSite.init(SomeSite.class);
        SomeSite.homePage.open();
        JDISettings.logger.info("Tests have been initialized");
    }
    /*
    @BeforeMethod
    public void setUp()
    {
        SomeSite.homePage.open();
    }
    */

    @AfterMethod
    public static void tearDown() {
        Verify.getFails();
    }
}
