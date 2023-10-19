package org.cloudvandana.program3;
import java.util.Scanner;
public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
    public static boolean isPangram(String str) {
        // Create a boolean array to mark the presence of each alphabet letter
        boolean[] alphabetPresent = new boolean[26];
        // Convert the input string to lowercase to ignore case
        str = str.toLowerCase();
        // Iterate through the characters in the input string
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Check if the character is an alphabet letter and mark its presence
            if ('a' <= c && c <= 'z') {
                alphabetPresent[c - 'a'] = true;
            }
        }
        // Check if all alphabet letters are present
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false;
            }
        }
        return true;
    }
}
