/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter02beans;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author shuran
 */
public class Person {
    private List<Question> characteristics = new ArrayList<>();

    public void add(Question characteristic) {
        characteristics.add(characteristic);
    }

    public List<Question> getCharacteristics() {
        return characteristics;
    }

    public List<Question> withCharacteristic(String questionPattern) {
        return characteristics.stream().filter(c -> c.getText().endsWith(questionPattern)).collect(Collectors.toList());
    }

}

/*
// your answer
// their answer
// how important is it to you

me very organized
you very organized
very important

me no
you no


irrelevant 0
little 1
10
50
mandatory 250

how much did other person satisfy?

      multiply scores
      take nth root

      .98 * .94 take sqrt (2 questions)

      (geometric mean)

*/