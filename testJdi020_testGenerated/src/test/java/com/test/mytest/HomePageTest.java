package com.test.mytest;

import com.epam.jdi.uitests.web.selenium.driver.WebDriverUtils;
import com.epam.jdi.uitests.web.selenium.elements.composite.WebSite;
import com.epam.jdi.uitests.web.settings.WebSettings;
import com.epam.web.matcher.verify.Verify;
import org.testng.annotations.Test;

import java.util.Arrays;

import static com.epam.jdi.uitests.web.selenium.driver.DriverTypes.CHROME;
import static org.testng.Assert.*;

/**
 * Created by Alexander_Petrovskiy on 6/3/2016.
 */
public class HomePageTest extends InitTests {

    @Test
    public void TestAll()
    {
        Arrays.stream(HomePage.class.getFields()).forEach(member -> {
            SomeSite site = new SomeSite();
            // member.get(site)
            Arrays.stream(member.getAnnotations()).forEach(anno -> System.out.println(anno));
        });
    }
}