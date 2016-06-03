import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.testng.testRunner.TestNGBase;
import com.epam.web.matcher.verify.Verify;
import org.test.mytest.CnnSite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import static com.epam.jdi.uitests.core.settings.JDISettings.driverFactory;
import static org.test.mytest.CnnSite.homePage;
import static com.epam.jdi.uitests.core.settings.JDISettings.logger;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class InitTests extends TestNGBase {
    @BeforeSuite(alwaysRun = true)
    // @BeforeMethod
    public static void setUp() {
        driverFactory.setDriverPath("C:\\Selenium");
        WebSite.init(CnnSite.class);
        homePage.open();
        Verify.getFails();
        logger.info("Starting tests");
    }
    @BeforeMethod
    public static void testSetUp() {
        homePage.open();
    }
    @AfterMethod
    public static void tearDown() {
        Verify.getFails();
    }
}
