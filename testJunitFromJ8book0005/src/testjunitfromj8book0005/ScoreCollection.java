/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjunitfromj8book0005;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shuran
 */
public class ScoreCollection {
    private List<Scoreable> scores = new ArrayList<>();
    
    public void add(Scoreable scoreable) {
        scores.add(scoreable);
    }
    
    public int arithmeticMean() {
        int total = scores.stream().mapToInt(Scoreable::getScore).sum();
        return total / scores.size();
    }
}
