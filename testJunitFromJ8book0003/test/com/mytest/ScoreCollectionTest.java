package com.mytest;

import org.junit.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Created by alexa_000 on 17/12/2015.
 */
public class ScoreCollectionTest {

    @Test
    public void answerArithmeticMeanOfTwoNumbers(){
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // Act
        // int actualResult = collection.arithmeticMean();
        double actualResult = collection.arithmeticMean();

        // Assert
        assertThat(actualResult, equalTo(6.0));
    }

    @Test
    public void checkNoDataResult() {
        // Arrange
        ScoreCollection collection = new ScoreCollection();

        // Act
        // int actualResult = collection.arithmeticMean();
        double actualResult = collection.arithmeticMean();

        // Assert
        // assertThat(actualResult, equalTo(0));
        assertThat(actualResult, equalTo(0.0));
    }

    @Test
    public void getNonIntegerResult() {
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 6);
        collection.add(() -> 7);

        // Act
        double actualResult = collection.arithmeticMean();

        // Assert
        assertThat(actualResult, equalTo(6.5));
    }
}