package maching_character;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Character, Integer> mc = new HashMap<>();

        System.out.println("Enter the text: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (mc.containsKey(ch)) {
                int cnt = mc.get(ch);
                mc.put(ch, cnt + 1);
            } else {
                mc.put(ch, 1);
            }
        }

        Set<Character> chrtr = mc.keySet();
        for (Character ch : chrtr) {
            int c = mc.get(ch);
            if (c > 1) {
                System.out.println(ch + " - " + c);
            }
        }
        scanner.close();
    }
}
