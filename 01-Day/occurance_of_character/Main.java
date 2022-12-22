package occurance_of_character;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String: ");
        String a = scanner.nextLine();
        System.out.println("Enter the character: ");
        char b = scanner.next().charAt(0);

        String str = a.toLowerCase();
        char ch = Character.toLowerCase(b);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println(b + " - " + count);
        scanner.close();
    }
}
