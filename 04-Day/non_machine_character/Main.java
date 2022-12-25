package non_machine_character;

import java.util.Scanner;
import java.util.Set;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String textUp = sc.nextLine();
        String textLow = textUp.toLowerCase();

        HashMap<Character, Integer> nm = new HashMap<>();
        // Check and add
        for (int i = 0; i < textLow.length(); i++) {
            char ch = textLow.charAt(i);
            if (nm.containsKey(ch)) {
                int cnt = nm.get(ch);
                nm.put(ch, cnt + 1);
            } else {
                nm.put(ch, 1);
            }
        }
        // check and print
        Set<Character> chartSet = nm.keySet();
        for (Character ch : chartSet) {
            int cnt = nm.get(ch);
            if (cnt == 1) {
                System.out.println(ch + " - " + cnt);
            }
        }
        sc.close();
    }
}
