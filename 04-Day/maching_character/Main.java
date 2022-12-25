package maching_character;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String textUp = scanner.nextLine();
        String textLow = textUp.toLowerCase();

        HashMap<Character, Integer> mc = new HashMap<>();

        // check and add
        for (int i = 0; i < textLow.length(); i++) {
            char ch = textLow.charAt(i);
            if (mc.containsKey(ch)) {
                int cnt = mc.get(ch);
                mc.put(ch, cnt + 1);
            } else {
                mc.put(ch, 1);
            }
        }

        // check and print
        Set<Character> chrt = mc.keySet();
        for (Character ch : chrt) {
            int cnt = mc.get(ch);
            if (cnt > 1) {
                System.out.println(ch + " - " + cnt);
            }
        }
        scanner.close();
    }
}