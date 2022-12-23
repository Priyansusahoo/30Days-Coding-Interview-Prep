package number_of_digit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = scanner.nextLine();
        int oldLenght = str.length();

        str = str.replaceAll("\\d", "");
        int newLength = str.length();
        System.out.println(oldLenght - newLength);
        scanner.close();
    }
}