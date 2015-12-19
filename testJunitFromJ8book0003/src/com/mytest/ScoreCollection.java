package com.mytest;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexa_000 on 17/12/2015.
 */
public class ScoreCollection {
    private List<Scoreable> scores = new ArrayList<>();

    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }

    // public int arithmeticMean() {
    public double arithmeticMean() {
        // int total = scores.stream().mapToInt(Scoreable::getScore).sum();
        double total = scores.stream().mapToInt(Scoreable::getScore).sum();
        // return total / scores.size();
        return 0 == total ? 0 : total / scores.size();
    }
}
