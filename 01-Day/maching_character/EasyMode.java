package maching_character;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class EasyMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        HashMap<Character, Integer> mc = new HashMap<>();
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
        for (Character chartr : chrtr) {
            int c = mc.get(chartr);
            if (c > 1) {
                System.out.println(chartr + " - " + c);
            }
        }
        scanner.close();
    }
}
