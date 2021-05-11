package org.launchcode.java.exercises;

import java.util.Scanner;

public class Mileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven?");
        double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        double gasUsed = input.nextDouble();
        System.out.println("Your gas mileage is " + miles/gasUsed);
    }
}
