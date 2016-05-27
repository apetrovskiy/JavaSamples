/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mytest.testjdi013;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;

/**
 *
 * @author Alexander_Petrovskiy
 */
@JSite(domain = "http://news.bbc.co.uk")
// @JSite(domain = "http://www.bbc.com/news")
public class NewsBbcCoUkSite extends WebSite {
    @JPage(url = "/", title = "Home - BBC News")
    public static HomePage homePage;
}
