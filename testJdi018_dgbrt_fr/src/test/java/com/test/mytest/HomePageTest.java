package com.test.mytest;

import com.epam.jdi.uitests.core.settings.JDISettings;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.web.matcher.verify.Verify;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Alexander_Petrovskiy on 5/27/2016.
 */
public class HomePageTest extends InitTests {
    @Test
    public void clickPortfolioButton() {
        DgbrtFrSite.homePage.buttonPortfolio.click();
        DgbrtFrSite.portfolioPage.h1Portfolio.isDisplayed();
    }

    @Test
    public void clickScrollForMoreButton() {
        DgbrtFrSite.homePage.buttonScrollForMore.click();
        // DgbrtFrSite.portfolioPage.h1Portfolio.isDisplayed();
    }

    // @Test
    public void clickCompetences() {
        // scroll down??
        DgbrtFrSite.homePage.buttonCompetences.click();
        DgbrtFrSite.competencesPage.h1Compétences.isDisplayed();
    }

    @BeforeMethod
    public static void setUp() {
        DgbrtFrSite.homePage.open();
    }
}