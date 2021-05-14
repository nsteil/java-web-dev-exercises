package org.launchcode.java.lsn2exercises;
import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 5, 8};
        for (int num : nums) {
            System.out.println(num);
        }
        String story = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in " +
                "a house. I wil not eat them with a mouse.";
        String[] words = story.split("\\.");
        System.out.println(Arrays.toString(words));
    }
}
