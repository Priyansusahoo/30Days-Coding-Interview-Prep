package Palindrome;

import java.util.Scanner;

public class EasyMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String str = string.toLowerCase();

        String ReverseString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            ReverseString += str.charAt(i);
        }

        // check if palindrome
        if (str.equals(ReverseString)) {
            System.out.println("String is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        scanner.close();
    }
}
