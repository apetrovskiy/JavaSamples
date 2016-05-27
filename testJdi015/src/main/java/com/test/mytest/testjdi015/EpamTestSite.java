/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mytest.testjdi015;

import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import com.test.mytest.testjdi015.pages.HomePage;
import com.test.mytest.testjdi015.pages.ServiceDatesPage;

/**
 *
 * @author Alexander_Petrovskiy
 */
@JSite(domain = "http://localhost/1/index.htm\b")
public class EpamTestSite extends WebSite {
    @JPage(url = "/", title = "Index Page")
    public static HomePage homePage;
    @JPage(url = "/page4.htm", title = "Dates")
    public static ServiceDatesPage serviceDatesPage;
}
