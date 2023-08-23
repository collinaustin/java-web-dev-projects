package org.launchcode;
import java.util.*;

public class FuelEfficiency {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double miles = input.nextDouble();

//        Scanner nextInput = new Scanner(System.in);
        System.out.println("How many gallons of gas have you consumed?");
        Double gas = input.nextDouble();

        Double mpg = miles / gas;

        System.out.println("Your fuel efficiency is " + mpg + " miles per gallon.");



    }
    
}
