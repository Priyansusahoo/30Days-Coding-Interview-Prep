import java.util.Scanner;;

public class EasyMode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String str = "Priyansu";
        String str = scanner.nextLine();
        String revString = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revString += str.charAt(i);
        }
        System.out.println(revString);
        scanner.close();
    }
}