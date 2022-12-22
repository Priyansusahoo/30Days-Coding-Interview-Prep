package anagrams;

import java.util.Scanner;
import java.util.Arrays;

public class EasyMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st String");
        String a = scanner.nextLine();
        System.out.println("Enter 2st String");
        String b = scanner.nextLine();

        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams.");
        } else {
            char[] strAnagram1 = str1.toCharArray();
            char[] strAnagram2 = str2.toCharArray();

            Arrays.sort(strAnagram1);
            Arrays.sort(strAnagram2);
            boolean anagrams = Arrays.equals(strAnagram1, strAnagram2);
            if (anagrams) {
                System.out.println(a + " and " + b + " - are Anagram.");
            } else {
                System.out.println(a + " and " + b + " - are NOT Anagram.");
            }
        }
    }
}
