package com.test.mytest;

import com.epam.commons.LinqUtils;
import com.epam.jdi.uitests.core.interfaces.base.IElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.test.mytest.SomeSite.homePage;
import static java.util.Arrays.asList;

/**
 * Created by Alexander_Petrovskiy on 6/3/2016.
 */
public class HomePageTest extends InitTests {

    long allElementsNumber = 0;
    int foundElementsNumber = 0;
    int displayedElementsNumber = 0;

    @Test
    public void TestAll()
    {
        List<String> list = asList("1", "2");
        List<String> result = LinqUtils.where(list, s -> s.equals("1"));
        result = list.stream().filter(s -> s.equals("1")).collect(Collectors.toList());
        String s = String.format("Some %s", "test");
        s = MessageFormat.format("Some {1}{1} {0}", "test1", "test2");

        allElementsNumber = Arrays.stream(homePage.getClass().getFields()).filter(member -> member.isAnnotationPresent(FindBy.class)).count();

        Arrays.stream(homePage.getClass().getFields()).filter(member -> member.isAnnotationPresent(FindBy.class)).forEach(member -> {
            SomeSite site = new SomeSite();
            // member.get(site)
            // Arrays.stream(member.getAnnotations()).forEach(anno -> System.out.println(anno));
            IElement element = null;
            try {
                System.out.println("probing member: " + member.getName());
                element = (IElement) member.get(homePage);
                System.out.println("member has been created");
                foundElementsNumber++;
                try {
                    // element.setAttribute("aaa", "bbb");
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                if (element.isDisplayed())
                    displayedElementsNumber++;
                if (element.isDisplayed())
                    System.out.println("===========================================================================");
                System.out.println("the member is displayed? " + element.isDisplayed() + " " + displayedElementsNumber + "/" + foundElementsNumber + " out of " + allElementsNumber);

            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });

        System.out.println("accessible rate: " + foundElementsNumber + "/" + allElementsNumber);
        System.out.println("displayed rate: " + displayedElementsNumber + "/" + allElementsNumber);
    }
}