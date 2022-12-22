package no_maching_character;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class EasyMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<Character, Integer> nm = new HashMap<>();
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (nm.containsKey(ch)) {
                int cnt = nm.get(ch);
                nm.put(ch, cnt + 1);
            } else {
                nm.put(ch, 1);
            }
        }

        Set<Character> chart = nm.keySet();
        for (Character ch : chart) {
            int c = nm.get(ch);
            if (c == 1) {
                System.out.println(ch + " - " + c);
            }
        }
        scanner.close();
    }
}
