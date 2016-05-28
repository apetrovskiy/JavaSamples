/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testjava8;

/**
 *
 * @author Alexander
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// import java.util.function;

public class TestJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        /*
        for (int number : numbers) {
            System.out.println(number);
        }
        */
        numbers.forEach((Integer value) -> System.out.println(value));
        
        List<String> list = new ArrayList<>();
        list.add("aaaa");
        list.add("bbb");
        list.add("ccc");
        list.forEach(s -> System.out.println(s));
        // list.forEach(System.out.println);
        list.forEach(s -> System.out.println("sss"));
        
    }
    
}
