package com.test.mytest;

import com.epam.jdi.uitests.core.interfaces.base.IElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;

import static com.test.mytest.SomeSite.homePage;

/**
 * Created by Alexander_Petrovskiy on 6/3/2016.
 */
public class HomePageTest extends InitTests {

    long allElementsNumber = 0;
    int foundElementsNumber = 0;
    int displayedElementsNumber = 0;
    String elementFound = "0";
    String elementDisplayed = "0";
    Instant time = Instant.now();
    //Delimiter used in CSV file
    final String COMMA_DELIMITER = ",";
    final String NEW_LINE_SEPARATOR = "\n";

    @Test
    public void TestAll() throws IOException {
        /*
        List<String> list = asList("1", "2");
        List<String> result = LinqUtils.where(list, s -> s.equals("1"));
        result = list.stream().filter(s -> s.equals("1")).collect(Collectors.toList());
        String s = String.format("Some %s", "test");
        s = MessageFormat.format("Some {1}{1} {0}", "test1", "test2");
        */

        allElementsNumber = Arrays.stream(homePage.getClass().getFields()).filter(member -> member.isAnnotationPresent(FindBy.class)).count();

        String fileName = "D:/333/jdi_output.txt";
        final FileWriter fileWriter = new FileWriter(fileName);

        try {
            //CSV file header
            final String FILE_HEADER = "locatorType,locator,found,displayed";
            //Write the CSV file header
            fileWriter.append(FILE_HEADER.toString());
            //Add a new line separator after the header
            fileWriter.append(NEW_LINE_SEPARATOR);


            Arrays.stream(homePage.getClass().getFields()).filter(member -> member.isAnnotationPresent(FindBy.class)).forEach(member -> {
                IElement element = null;
                String locatorType;
                String locatorValue;
                try {
                    elementFound = "0";
                    elementDisplayed = "0";
                    element = (IElement) member.get(homePage);
                    // System.out.println(member.getType().getName());
                    //
                    /*
                    String css = member.getAnnotation(FindBy.class).css();
                    String className = member.getAnnotation(FindBy.class).className();


                    String className = member.getAnnotation(FindBy.class).className();
                    String className = member.getAnnotation(FindBy.class).className();
                    String className = member.getAnnotation(FindBy.class).className();
                    String className = member.getAnnotation(FindBy.class).className();
                    */
                    // if (isNullOrEmpty(annotation.c))
                    //
                    foundElementsNumber++;
                    elementFound = "1";
                    if (element.isDisplayed()) {
                        displayedElementsNumber++;
                        elementDisplayed = "1";
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                writeData(fileWriter, getLocatorType(member.getAnnotation(FindBy.class)), getLocatorPath(member.getAnnotation(FindBy.class)), elementFound, elementDisplayed);

            });

            System.out.println("CSV file was created successfully !!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
        }

        System.out.println("accessible rate: " + foundElementsNumber + "/" + allElementsNumber);
        System.out.println("displayed rate: " + displayedElementsNumber + "/" + allElementsNumber);
    }

    void writeData(FileWriter fileWriter, String locatorType, String locatorPath, String elementFound, String elementDisplayed) {
        try {
            fileWriter.append(locatorType);
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(locatorPath);
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(elementFound);
            fileWriter.append(COMMA_DELIMITER);
            fileWriter.append(elementDisplayed);
            fileWriter.append(COMMA_DELIMITER);
            Instant newTime = Instant.now();
            fileWriter.append(Long.toString(java.time.Duration.between(time, newTime).toMillis()));
            time = newTime;
            fileWriter.append(NEW_LINE_SEPARATOR);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String getLocatorType(org.openqa.selenium.support.FindBy annotation) {
        if (!isNullOrEmpty(annotation.className()))
            return "className";
        if (!isNullOrEmpty(annotation.css()))
            return "css";
        if (!isNullOrEmpty(annotation.id()))
            return "id";
        if (!isNullOrEmpty(annotation.linkText()))
            return "linkText";
        if (!isNullOrEmpty(annotation.partialLinkText()))
            return "partialLinkText";
        if (!isNullOrEmpty(annotation.name()))
            return "name";
        if (!isNullOrEmpty(annotation.tagName()))
            return "tagName";
        if (!isNullOrEmpty(annotation.xpath()))
            return "xpath";
        return "";
    }

    String getLocatorPath(org.openqa.selenium.support.FindBy annotation) {
        if (!isNullOrEmpty(annotation.className()))
            return annotation.className();
        if (!isNullOrEmpty(annotation.css()))
            return annotation.css();
        if (!isNullOrEmpty(annotation.id()))
            return annotation.id();
        if (!isNullOrEmpty(annotation.linkText()))
            return annotation.linkText();
        if (!isNullOrEmpty(annotation.partialLinkText()))
            return annotation.partialLinkText();
        if (!isNullOrEmpty(annotation.name()))
            return annotation.name();
        if (!isNullOrEmpty(annotation.tagName()))
            return annotation.tagName();
        if (!isNullOrEmpty(annotation.xpath()))
            return annotation.xpath();
        return "";
    }

    boolean isNullOrEmpty(String value)
    {
        if (value != null)
            return value.length() == 0;
        else
            return true;
    }
    /*
    String getAnnotationParameterValue(IElement element)
    {
        FindBy annotation = element.getClass().getAnnotationsByType(FindBy.class);


        String css = member.getAnnotation(FindBy.class).css();
        String className = member.getAnnotation(FindBy.class).className();


        String className = member.getAnnotation(FindBy.class).className();
        String className = member.getAnnotation(FindBy.class).className();
        String className = member.getAnnotation(FindBy.class).className();
        String className = member.getAnnotation(FindBy.class).className();
    }*/
}