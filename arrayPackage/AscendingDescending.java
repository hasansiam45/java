package arrayPackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AscendingDescending {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = input.nextInt();
        int [] arr = new int[n];

        // input for array
        System.out.println("Enter array = ");
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d] = ",i);
            arr [i] = input.nextInt();
        }

        // printing the array
        System.out.print("\nArray you entered is = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        // sorting array in ascending
        Arrays.sort(arr);
        System.out.print("\nArray in ascending order = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
        }
        // sorting array in ascending
        System.out.print("\nArray in descending order = ");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(" "+ arr[i]);
        }
    }
}
