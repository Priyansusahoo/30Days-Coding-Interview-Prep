package num_of_vowel_constrains;

import java.util.Scanner;

public class EasyMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the TEXT: ");
        String text1 = scanner.nextLine();
        String text = text1.toLowerCase();
        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
                vowel += 1;
            } else {
                consonant += 1;
            }
        }
        System.out.println("No. of vowel = "
                + vowel
                + "\nNo. of consonant = "
                + consonant);
        scanner.close();
    }
}
