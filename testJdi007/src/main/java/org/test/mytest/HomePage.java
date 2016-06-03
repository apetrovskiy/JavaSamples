package org.test.mytest;

import com.epam.jdi.uitests.core.interfaces.common.*;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.robot.RFileInput;
import com.epam.jdi.uitests.web.selenium.elements.common.Link;
import com.epam.jdi.uitests.web.selenium.elements.complex.DropList;
import com.epam.jdi.uitests.web.selenium.elements.complex.Dropdown;
import com.epam.jdi.uitests.web.selenium.elements.complex.Elements;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

/**
 * Created by Alexander_Petrovskiy on 5/23/2016.
 */
public class HomePage extends WebPage {


    // @FindBy(xpath = "//ul[*[@data-analytics='News and buzz_list-hierarchical-xs_']]/article")
    // temporarily
    @FindBy(xpath = "//ul[*[@data-analytics='Top stories_list-hierarchical-xs_']]/article//*[@class='cd__headline-text']")
    // @FindBy(xpath = "//li[*[@data-analytics='Top stories_list-hierarchical-xs_']]/article//*[@class='cd__headline-text']")
    public List<Link> topStories;
    @FindBy(xpath = "//ul[*[@data-analytics='News and buzz_list-hierarchical-xs_']]/article")
    public List<Link> newsAndBuzz;
    @FindBy(xpath = "//ul[*[@data-analytics='News and buzz_list-hierarchical-xs_']]/article//*[@class='cd__headline-text']")
    public Menu<NewsLinks> newsLinks2;
    @FindBy(xpath = "//ul[*[@data-analytics='News and buzz_list-hierarchical-xs_']]/article//*[@class='cd__headline-text']")
    public Elements<Link> newsLinks3;

    @FindBy(className = "banner-text")
    public IText screamingBanner;
    @FindBy(className = "nav-menu-links__link")
    public Menu<NavigationLinks> navigationMenuLinks;

    @FindBy(className = "banner-text-non-existing")
    public IText falseScreamingBanner;
}
