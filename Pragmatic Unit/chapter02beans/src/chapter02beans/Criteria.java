/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

/**
 *
 * @author shuran
 */
public class Criteria implements Iterable<Criterion> {

    private List<Criterion> criteria = new ArrayList<>();

    public void add(Criterion criterion) {
        criteria.add(criterion);
    }

    @Override
    public Iterator<Criterion> iterator() {
        return criteria.iterator();
    }

    public int arithmeticMean() {
        return 0;
    }

    public double geometricMean(int[] numbers) {
        int totalProduct = Arrays.stream(numbers).reduce(1, (product, number) -> product * number);
        return Math.pow(totalProduct, 1.0 / numbers.length);
    }
}
