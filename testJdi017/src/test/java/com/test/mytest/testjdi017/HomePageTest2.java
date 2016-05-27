package com.test.mytest.testjdi017;

import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.driver.DriverTypes;
import com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.web.matcher.verify.Verify;
import org.junit.*;

import java.io.IOException;

import static com.epam.jdi.uitests.web.selenium.driver.DriverTypes.CHROME;
import static com.epam.jdi.uitests.web.settings.WebSettings.initFromProperties;

/**
 * Created by Alexander_Petrovskiy on 5/26/2016.
 */
public class HomePageTest2 {

    @BeforeClass
    public static void classSetUp() throws IOException {
        initFromProperties();

        JDISettings.logger.info("Init test run");
        WebDriverUtils.killAllRunWebDrivers();
        WebSettings.useDriver(CHROME);

        WebSettings.getDriverFactory().setDriverPath("C:\\Selenium");
        WebSite.init(NewsBbcCoUkSite.class);
        NewsBbcCoUkSite.homePage.open();
        Verify.getFails();
        JDISettings.logger.info("Starting tests");
    }

    @AfterClass
    public static void classTearDown() {

    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
        Verify.getFails();
    }

    @Test
    public void testHomePageOpens() {
        NewsBbcCoUkSite.homePage.open();
    }
}
