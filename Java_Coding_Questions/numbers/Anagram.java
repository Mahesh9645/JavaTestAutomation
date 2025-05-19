package numbers;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "CAT";
        String s2 = "ACT";

        // Convert to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Check if lengths are equal
        if (s1.length() != s2.length()) {
            System.out.println("Not an Anagram");
            return;
        }

        // Convert strings to character arrays
        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        // Sort character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        if (Arrays.equals(charArray1, charArray2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not an Anagram");
        }
    }
}
