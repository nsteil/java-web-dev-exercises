package org.launchcode.java.lsn2exercises;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Integer,String> students = new HashMap<>();
        String studentName;
        Integer studentID;

        System.out.println("Enter your students (hit enter when done)");

        do {

            System.out.println("Student Name: ");
            studentName = input.nextLine();
            if (!studentName.equals("")) {
                System.out.println("Student ID: ");
                studentID = input.nextInt();
                students.put(studentID,studentName);

                input.nextLine();
            }
        } while(!studentName.equals(""));

        System.out.println("\nClass Roster: ");

        for (Map.Entry<Integer,String> student : students.entrySet()){
            System.out.println(student.getValue() + " has an ID of" + student.getKey());
        }

    }
}
