package org.launchcode.java.studios.countingcharacters;
import java.util.*;

public class Counter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to have the characters counted: ");
        String storage = input.nextLine();
        char[] storageBreakdown = storage.toLowerCase().toCharArray();

        HashMap<Character, Integer> characterCounts = new HashMap<>();

        for (char piece : storageBreakdown){

            if (!characterCounts.containsKey(piece) && Character.isAlphabetic(piece)) {
                characterCounts.put(piece, 1);
            } else if (characterCounts.containsKey(piece) && Character.isAlphabetic(piece)) {
               characterCounts.put(piece, characterCounts.get(piece) + 1);
            }
        }

        for (Map.Entry<Character,Integer> letter : characterCounts.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }
}
