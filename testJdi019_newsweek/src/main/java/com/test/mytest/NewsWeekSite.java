package com.test.mytest;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;

/**
 * Created by Alexander_Petrovskiy on 5/27/2016.
 */
@JSite(domain = "http://europe.newsweek.com")
public class NewsWeekSite extends WebSite {
    @JPage(url = "/", title = "News, in-depth analysis and reportage - Newsweek Europe")
    public static HomePage homePage;
}
