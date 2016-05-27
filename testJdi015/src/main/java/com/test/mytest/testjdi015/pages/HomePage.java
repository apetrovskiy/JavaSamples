/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.mytest.testjdi015.pages;

import com.epam.jdi.uitests.core.interfaces.common.IButton;
import com.epam.jdi.uitests.core.interfaces.common.IText;
import com.epam.jdi.uitests.core.interfaces.complex.IDropDown;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebPage;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Alexander_Petrovskiy
 */
public class HomePage extends WebPage {
    // @FindBy(className = "dropdown-toggle")
    @FindBy(xpath = "//*[@class=\"dropdown-toggle\"][@href=\"#\"]")
    public IButton dropDownToggle;
    // public IText dropDownToggle;
}
