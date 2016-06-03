package com.test.mytest;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

/**
 * Created by Alexander_Petrovskiy on 5/27/2016.
 */
public class HomePage extends WebPage {
    @FindBy(css = "#panel-portfolio .btn-primary-transparent")
    public IButton buttonPortfolio;
    @FindBy(css = "#competences .btn-primary-transparent")
    public IButton buttonCompetences;
    @FindBy(css = ".scroll-for-more")
    public IButton buttonScrollForMore;
}
