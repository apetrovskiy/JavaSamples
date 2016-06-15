package com.test.mytest;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;

/**
 * Created by Alexander_Petrovskiy on 6/3/2016.
 */
@JSite(domain = "http://www.fifa.com")
public class SomeSite extends WebSite {
    @JPage(url = "/", title = "")
    public static HomePage homePage;
}
