package com.test.mytest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Alexander_Petrovskiy on 5/27/2016.
 */
public class CompetencesPageTest extends InitTests {

    @BeforeMethod
    public static void setUp() {
        DgbrtFrSite.competencesPage.open();
    }
}