// A = pi * r * r where pi is 3.14 and r is the radius.

package org.launchcode;
import java.util.*;


public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");

        if (input.hasNextDouble()) {
            Double radius = input.nextDouble();
            if (radius < 0) {
                System.err.println("Radius is negative");
                return;
            }
            System.out.println("The area is: " + Circle.getArea(radius));
        }
            else {
            System.err.println("Must enter a number");
        }
        input.close();
    }
}

