
package timelivedcalculator;

import java.util.*;
import java.text.*;
import java.util.concurrent.TimeUnit;

public class TimeLivedCalculator {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Date date = new Date();
       
        System.out.print("What day were you born?(dd/mm/yyyy): ");
        String bday = input.next();
       
        Date date1;
        try {
            SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");

            date1 = ft.parse(bday);
            System.out.println(date1);
            long diffInMillies = Math.abs(date.getTime() - date1.getTime());
            long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            long diffInHours = TimeUnit.HOURS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            long diffInMinutes = TimeUnit.MINUTES.convert(diffInMillies, TimeUnit.MILLISECONDS);
            long diffInSeconds = TimeUnit.SECONDS.convert(diffInMillies, TimeUnit.MILLISECONDS);
            
            System.out.println("\nYou have lived for: "+diffInDays+" Days");
            System.out.println("You have lived for: "+diffInHours+" Hours");
            System.out.println("You have lived for: "+diffInMinutes+" Minutes");
            System.out.println("You have lived for: "+diffInSeconds+" Seconds");
            System.out.println("You have lived for: "+diffInMillies+" Milliseconds");
            
            long daysLeft = (25915 - diffInDays);
            long hoursLeft = (621960 - diffInHours);
            long minutesLeft = (37317600 - diffInMinutes);
            long secondsLeft = (2239056000L - diffInSeconds);
            
            System.out.println("\nYou have: "+daysLeft+" Days left to live!");
            System.out.println("You have: "+hoursLeft+" Hours left to live!");
            System.out.println("You have: "+minutesLeft+" Minutes left to live!");
            System.out.println("You have: "+secondsLeft+" Seconds left to live!");

        
        
        }
        catch (Exception e){
            
        }
        
        
        
    }
    
}
