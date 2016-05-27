package com.test.mytest;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JSite;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Alexander_Petrovskiy on 5/27/2016.
 */
@JSite(domain = "http://www.dgbrt.fr")
public class DgbrtFrSite extends WebSite {
    @JPage(url = "/", title = "Webdesigner Freelance à Lille, intégrateur front-end, Dagobert Renouf")
    public static HomePage homePage;
    @JPage(url = "/competences", title = "Compétences techniques de Dagobert Renouf")
    public static CompetencesPage competencesPage;
    @JPage(url = "/portfolio-webdesigner", title = "Portfolio de webdesigner freelance dgbrt")
    public static PortfolioPage portfolioPage;
}
