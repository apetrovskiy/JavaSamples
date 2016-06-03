import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.common.ITextArea;
import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.test.mytest.CnnSite;
import org.test.mytest.NavigationLinks;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class Tests extends InitTests {

    // @Test
    public void simpleTest() {
        CnnSite.homePage.open();
    }

    // @Test
    public void clickTopStories() {
        // CnnSite.homePage.topStories.
        // List<Link> links = CnnSite.homePage.topStories;
        // links.isEmpty();

        CnnSite.homePage.topStories.stream().forEach(item -> System.out.println(item.getText()));
        CnnSite.homePage.topStories.get(3).click();

        // CnnSite.homePage.newsLinks2.getOptions();
        // String name3 = CnnSite.homePage.newsLinks3.get("Ghbdrt").getText();
    }

    // @Test
    public void clickNewAndBuzz() {
        CnnSite.homePage.newsAndBuzz.stream().forEach(item -> System.out.println(item.getText()));
        CnnSite.homePage.newsAndBuzz.get(3).click();
    }

    // @Test
    public void getBannerText() {
        IText banner = CnnSite.homePage.screamingBanner;
        String name = banner.getName();
        String text = banner.getText();
        System.out.println("BANNER: " + name);
        System.out.println("BANNER TEXT: " + text);
    }

    // @Test
    public void navigationMenuLInks() {
        Menu<NavigationLinks> menuItems = CnnSite.homePage.navigationMenuLinks;
        menuItems.getNames().stream().forEach(name -> System.out.println(name));
        menuItems.select(NavigationLinks.Entertainment);
        CnnSite.homePage.isOpened();
        menuItems.select(NavigationLinks.UsPolitics);
    }

    @Test
    public void CheckPresenceOfText() {
        assertTrue(CnnSite.homePage.screamingBanner.isDisplayed());
        assertFalse(CnnSite.homePage.falseScreamingBanner.isDisplayed());
    }
}
