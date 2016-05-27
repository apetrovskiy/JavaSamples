package org.test.mytest;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
@JSite(domain = "http://cnn.com")
// @JSite(domain = "file:///C:/1/CNN2.html")
public class CnnSite extends WebSite {
    @JPage(url = "", title = "CNN - Breaking News, U.S., World, Weather, Entertainment &amp; Video News")
    public static HomePage homePage;
}
