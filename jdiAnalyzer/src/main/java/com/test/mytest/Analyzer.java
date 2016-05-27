package com.test.mytest;

import com.epam.jdi.uitests.core.interfaces.base.IElement;
import com.epam.jdi.uitests.core.interfaces.common.*;
import com.epam.jdi.uitests.core.interfaces.complex.IMenu;
import com.epam.jdi.uitests.web.selenium.elements.base.Element;
import com.epam.jdi.uitests.web.selenium.elements.common.*;
import com.epam.jdi.uitests.web.selenium.elements.complex.Menu;
import com.sun.javafx.iio.common.ImageLoaderImpl;
import com.sun.org.apache.bcel.internal.util.ClassLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander_Petrovskiy on 5/26/2016.
 */
public class Analyzer {

    static WebDriver webDriver;
    static boolean useWebElementAsSourceForJdiElement;
    public void setUseWebElementAsSourceForJdiElement(boolean value) {
        useWebElementAsSourceForJdiElement = value;
    }

    public static boolean isNullOrEmpty(String s) {
        return s == null || s.length() == 0;
    }

    boolean testAsButton(WebElement element, String xPath) {
        IButton probableButton;
        try {
            System.out.println("test as a button");
            probableButton = useWebElementAsSourceForJdiElement ? new Button(element) : new Button(By.xpath(xPath));
            System.out.println(null == probableButton);
            // probableButton.getClass().getAnnotations()
        }
        catch (Exception e) {
            System.out.println(e.getStackTrace().toString());
            return false;
        }
        if (isNullOrEmpty(probableButton.getText()))
            return false;
        if (isNullOrEmpty(probableButton.getName()))
            return false;
        if (!probableButton.isDisplayed())
            return false;
        try {
            probableButton.click();
            webDriver.navigate().back();
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    // boolean testJdiElement(String interfaceName, String className, WebElement element, String xPath) {
    boolean testJdiElement(String className, WebElement element, String xPath) {
        try {
            Class<?> probableJdiElement = Class.forName("com.epam.jdi.uitests.web.selenium.elements.base." + className, true, new ClassLoader());
            // Class<? extends StringCreator> creatorClass = someClass.asSubclass(StringCreator.class);
            // Constructor<? extends StringCreator> creatorCtor = creatorClass.getConstructor((Class<?>[]) null);
            // Creator<String> creator = creatorCtor.newInstance((Object[]) null);
            // T probableJdiElement = useWebElementAsSourceForJdiElement ? new TClass(element) : new TClass(By.xpath(xPath));
            System.out.println("An instance of " + probableJdiElement.getClass().getName() + " has been created");
        }
        catch (Exception e) {
            System.out.println("Failure occured!");
            System.out.println(e.getMessage());
            // System.out.println(e.getCause().getMessage());
            return false;
        }
        return true;
    }

    boolean testAsLink(WebElement element, String xPath) {
        try {
            ILink probableLink = useWebElementAsSourceForJdiElement ? new Link(element) : new Link(By.xpath(xPath));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }

        return true;
    }

    boolean testAsText(WebElement element, String xPath) {
        try {
            IText probablyText = useWebElementAsSourceForJdiElement ? new Text(element) : new Text(By.xpath(xPath));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    boolean testAsLabel(WebElement element, String xPath) {
        try {
            ILabel probableLabel = useWebElementAsSourceForJdiElement ? new Label(element) : new Label(By.xpath(xPath));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    boolean testAsCheckBox(WebElement element, String xPath) {
        try {
            ICheckBox probableCheckBox = useWebElementAsSourceForJdiElement ? new CheckBox(element) : new CheckBox(By.xpath(xPath));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    boolean testAsTextArea(WebElement element, String xPath) {
        try {
            ITextArea probableTextArea = useWebElementAsSourceForJdiElement ? new TextArea(element) : new TextArea(By.xpath(xPath));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    boolean testAsTextField(WebElement element, String xPath) {
        try {
            ITextField probableTextField = useWebElementAsSourceForJdiElement ? new TextField(element) : new TextField(By.xpath(xPath));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    boolean testAsMenu(WebElement element, String xPath) {
        try {
            List<IMenu<NewEnum>> probableMenu = new ArrayList<>();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }



    public java.lang.Class GetElementType(String urlPath, String xPath) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get(urlPath);
        WebElement element = webDriver.findElement(By.xpath(xPath));
        System.out.println(element.getAttribute("id"));
        System.out.println(element.getAttribute("name"));
        System.out.println(element.getAttribute("class"));
        System.out.println(element.toString());

        // System.out.println(element.getText());
        // System.out.println(element.toString());

        if (testAsButton(element, xPath))
            return IButton.class;
        if (testAsLink(element, xPath))
            return ILink.class;
        if (testAsText(element, xPath))
            return IText.class;
        if (testAsLabel(element, xPath))
            return ILabel.class;
        if (testAsCheckBox(element, xPath))
            return ICheckBox.class;
        if (testAsTextArea(element, xPath))
            return ITextArea.class;
        if (testAsTextField(element, xPath))
            return ITextField.class;
        // if (testAsMenu(element, xPath))
        //     return IMenu.class;

        return IElement.class;
        /*
        testJdiElement("Link", element, xPath);
        testJdiElement("Button", element, xPath);
        testJdiElement("Text", element, xPath);
        testJdiElement("TextArea", element, xPath);
        testJdiElement("TextField", element, xPath);
        testJdiElement("Label", element, xPath);
        testJdiElement("CheckBox", element, xPath);
        testJdiElement("Image", element, xPath);
        testJdiElement("DatePicker", element, xPath);
        testJdiElement("FileInput", element, xPath);

        return IElement.class;
        */
    }
}
