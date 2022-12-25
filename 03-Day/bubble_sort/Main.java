package bubble_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int[] arr = { 6, 5, 1, 3, 4 };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of the array: ");
        int lenth = sc.nextInt();
        int arr[] = new int[lenth];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + " element: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}