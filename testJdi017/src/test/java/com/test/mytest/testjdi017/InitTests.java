/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mytest.testjdi017;

import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

/**
 *
 * @author Alexander_Petrovskiy
 */
public class InitTests extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    public static void suiteSetUp() {
        WebSettings.getDriverFactory().setDriverPath("C:\\Selenium");
        WebSite.init(NewsBbcCoUkSite.class);
        NewsBbcCoUkSite.homePage.open();
        Verify.getFails();
        JDISettings.logger.info("Starting tests");
    }
    @AfterTest
    public static void tearDown() {
        Verify.getFails();
    }
}
