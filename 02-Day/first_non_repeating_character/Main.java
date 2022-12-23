package first_non_repeating_character;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> hm = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string in lowerCase: ");
        String str0 = scanner.nextLine();
        String str1 = str0.toLowerCase();
        scanner.close();
        char str[] = str1.toCharArray();

        for (int i = 0; i < str.length; i++) {
            char ch = str[i];
            if (hm.containsKey(ch)) {
                int cnt = hm.get(ch);
                hm.put(ch, cnt + 1);
            } else {
                hm.put(ch, 1);
            }
        }

        // loop through the char array 'str' and check.
        for (int i = 0; i < str.length; i++) {
            char ch1 = str[i];
            int frequency = hm.get(ch1);
            if (frequency == 1) {
                System.out.println(ch1);
                return; // no need to proceed if found it.
            }
        }
    }
}
