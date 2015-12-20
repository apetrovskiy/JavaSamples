/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunitfromj8book0005;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import static org.junit.Assert.*;

public class ScoreCollectionTest {
    @Test
    public void answerArithmeticMeanOfTwoNumbers() {
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);
        
        // Act
        // int actualResult = collection.arithmeticMean();
        double actualResult = collection.arithmeticMean();
        
        // Assert
        // assertThat(actualResult, CoreMatchers.equalTo(6));
        assertThat(actualResult, CoreMatchers.equalTo(6.0));
    }
    
    @Test
    public void getEmptyResult() {
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        
        // Act
        // int actualResult = collection.arithmeticMean();
        double actualResult = collection.arithmeticMean();
        
        // Assert
        assertThat(actualResult, CoreMatchers.equalTo(0.0));
    }
    
    @Test
    public void checkNonIntegerResult() {
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 6);
        collection.add(() -> 7);
        
        // Act
        double actualResult = collection.arithmeticMean();
        
        // Assert
        assertThat(actualResult, CoreMatchers.equalTo(6.5));
    }
}
