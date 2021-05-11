package org.launchcode.java.exercises;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        double length = input.nextDouble();
        System.out.println("What is the width of the rectangle?");
        double width = input.nextDouble();
        System.out.println("The rectangle has an area of " + width*length);

    }
}
