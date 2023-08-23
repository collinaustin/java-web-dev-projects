package org.launchcode;
import java.util.*;

public class RectangleArea {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        Double length = input.nextDouble();

        Scanner nextInput = new Scanner(System.in);
        System.out.println("What is the width of the rectangle?");
        Double width = nextInput.nextDouble();

        Double area = length * width;

        System.out.println("The area of the rectangle is " + area);

    }
}
