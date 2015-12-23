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
public enum Weight {
    MustMatch(Integer.MAX_VALUE),
    VeryImportant(5000),
    Important(1000),
    WouldPrefer(100),
    DontCare(0);

    private int value;

    Weight(int value) { this.value = value; }
    public int getValue() { return value; }
}
