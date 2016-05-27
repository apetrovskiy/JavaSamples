package com.test.mytest;

import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Alexander_Petrovskiy on 5/27/2016.
 */
public class PortfolioPage extends WebPage {
    @FindBy(xpath = "//h1['Portfolio de webdesigner']")
    public IText h1Portfolio;
}
