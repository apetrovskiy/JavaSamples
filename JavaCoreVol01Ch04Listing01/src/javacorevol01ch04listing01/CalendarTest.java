/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javacorevol01ch04listing01;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Alexander
 */
public class CalendarTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GregorianCalendar currentDate = new GregorianCalendar();
        
        int today = currentDate.get(Calendar.DAY_OF_MONTH);
        int month = currentDate.get(Calendar.MONTH);
        
        currentDate.set(Calendar.DAY_OF_MONTH, 1);
        
        int weekday = currentDate.get(Calendar.DAY_OF_WEEK);
        
        int firstDayOfWeek = currentDate.getFirstDayOfWeek();
        
        int indent = 0;
        while (weekday != firstDayOfWeek) {
            indent++;
            currentDate.add(Calendar.DAY_OF_MONTH, -1);
            weekday = currentDate.get(Calendar.DAY_OF_WEEK);
        }
        
        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            currentDate.add(Calendar.DAY_OF_MONTH, 1);
            weekday = currentDate.get(Calendar.DAY_OF_WEEK);
        }
        while (weekday != firstDayOfWeek);
        
        System.out.println();
        for (int i = 1; i <= indent; i++)
            System.out.print(" ");
        
        currentDate.set(Calendar.DAY_OF_MONTH, 1);
        do {
            int day = currentDate.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d", day);
            
            if (day == today) System.out.print("*");
            else System.out.print(" ");
            
            currentDate.add(Calendar.DAY_OF_MONTH, 1);
            weekday = currentDate.get(Calendar.DAY_OF_WEEK);
            
            if (weekday == firstDayOfWeek) System.out.println();
        }
        while (currentDate.get(Calendar.MONTH) == month);
        
        if (weekday != firstDayOfWeek) System.out.println();
    }
    
}
