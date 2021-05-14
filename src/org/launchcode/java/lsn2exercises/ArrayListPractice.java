package org.launchcode.java.lsn2exercises;
import java.util.Scanner;

public class ArrayListPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer[] dataList = {5,8,15,12,6,7,19,21,22,16,10};
        System.out.println(evenSum(dataList));
        System.out.println("Enter the length of words to be returned: ");
        int wordLength = input.nextInt();
        String[] reports = {"apple", "banana", "Shelby", "bread", "pineapple", "pizza"};
        printer(reports, wordLength);
    }
    public static Integer evenSum(Integer[] lists) {
        int sum  = 0;
        for (int list : lists) {
            if (list % 2 == 0) {
                sum += list;
            }
        }
        return sum;
    }
    public static String printer(String[] reports, int wordLength) {
        for (String report : reports) {
            if (report.length() == wordLength) {
                System.out.println(report);
            }

        }

        return null;
    }
}
