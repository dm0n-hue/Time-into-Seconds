package timeconversion;

import java.util.*;
public class TimeConversion {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int hours, minutes, seconds, totalSec;
    
    System.out.println("Enter total hours, minutes, and seconds");
    System.out.println("total hours: ");
        hours = scan.nextInt();
    System.out.println("total minutes: ");
        minutes = scan.nextInt();
    System.out.println("total seconds: ");
        seconds = scan.nextInt();
        totalSec = (hours*360) + (minutes*60) + seconds;
    
    if (hours>=0 && hours<=24 && minutes>=0 && minutes<=60 && seconds>=0 && seconds<=60) {
        System.out.println("The total seconds of the amount of time inputted is: " + totalSec);  
    }
    else {
        System.out.println("Please enter realistic numbers to time on Earth");
    }
    
    }
    
}
