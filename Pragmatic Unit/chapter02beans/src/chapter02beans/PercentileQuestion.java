/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02beans;

/**
 *
 * @author shuran
 */
public class PercentileQuestion extends Question {
    public PercentileQuestion(int id, String text, String[] answerChoices) {
        super(id, text, answerChoices);
    }

    @Override
    public boolean match(int expected, int actual) {
        return expected <= actual;
    }
}
