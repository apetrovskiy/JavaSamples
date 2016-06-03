/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mytest.testjdi015.pages;

import com.epam.jdi.uitests.core.settings.JDISettings;
import static com.epam.jdi.uitests.core.settings.JDISettings.initFromProperties;
import com.epam.jdi.uitests.web.selenium.driver.DriverTypes;
import static com.epam.jdi.uitests.web.selenium.driver.DriverTypes.CHROME;
import com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.web.matcher.verify.Verify;
import com.test.mytest.testjdi015.EpamTestSite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

/**
 *
 * @author Alexander_Petrovskiy
 */

public class HomePageTest {
    
    // public HomePageTest() {
    // }

    @BeforeClass
    public static void setUpClass() throws IOException {
        
        // JDISettings.initFromProperties();
        // WebSettings.useDriver(DriverTypes.CHROME);
        
        // JDISettings.logger.info("Creating the driver");
        // JDISettings.driverFactory.setCurrentDriver("C:\\Selenium");
        // JDISettings.driverFactory.setCurrentDriver("C:/Selenium");
        // JDISettings.driverFactory.setCurrentDriver("C:/Projects/Java/testJdi013/src/main/resources");
        // JDISettings.driverFactory.setCurrentDriver("C:\\Projects\\Java\\testJdi013\\src\\main\\resources");
        // JDISettings.driverFactory.setCurrentDriver("/src/main/resources");
        // JDISettings.driverFactory.setCurrentDriver("src/main/resources");

        WebSettings.initFromProperties();

        JDISettings.logger.info("Init test run");
        WebDriverUtils.killAllRunWebDrivers();
        WebSettings.useDriver(CHROME);

        WebSettings.getDriverFactory().setDriverPath("C:\\Selenium");
        // WebSite.init(NewsBbcCoUkSite.class);
        // NewsBbcCoUkSite.homePage.open();
        // Verify.getFails();
        // JDISettings.logger.info("Starting tests");
        
        // initFromProperties();
        
        // JDISettings.logger.info("Init test run");
        // WebDriverUtils.killAllRunWebDrivers();
        // WebSettings.useDriver(DriverTypes.CHROME);

        // WebSettings.getDriverFactory().setDriverPath("C:\\Selenium");
        
        WebSite.init(EpamTestSite.class);
        EpamTestSite.homePage.url = EpamTestSite.homePage.url.substring(0, EpamTestSite.homePage.url.length() - 1);
        EpamTestSite.homePage.open();
        Verify.getFails();
        JDISettings.logger.info("Tests have been started");
    }

    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        EpamTestSite.homePage.open();
    }
    
    @After
    public void tearDown() {
        Verify.getFails();
    }

    @Test
    public void testHomePageOpens() throws IOException {
        EpamTestSite.homePage.open();
    }

    @Test
    public void testLogin() {
        EpamTestSite.homePage.open();
        String s = EpamTestSite.homePage.dropDownToggle.getText(); //.click();
        System.out.println(s);
    }
}

