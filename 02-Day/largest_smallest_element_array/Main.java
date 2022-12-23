package largest_smallest_element_array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int arrayLength = sc.nextInt();
        int[] arr = new int[arrayLength];
        // Enter array loop.
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + (i + 1) + " Element : ");
            arr[i] = sc.nextInt();
        }

        // Smallest Element
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Smallest element: " + min);

        // Largest Element
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Largest element: " + max);
        sc.close();
    }
}
