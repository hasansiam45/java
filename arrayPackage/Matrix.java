package arrayPackage;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // getting input for row and col number;
        System.out.print("How many Row You Want = ");
        int r = input.nextInt();
        System.out.print("How many Column You Want = ");
        int c = input.nextInt();

        // getting input for first array
        int [] [] arr1 = new int [r] [c];
        System.out.println("\nEnter First Array Value\n");

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print("Enter " + row + " Row " + col + " Col Value = ");
                arr1 [row] [col] = input.nextInt();
            }
            System.out.println();
        }

        // getting input for second array
        int [] [] arr2 = new int [r] [c];
        System.out.println("\nEnter Second Array Value\n");

        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print("Enter " + row + " Row " + col + " Col Value = ");
                arr2 [row] [col] = input.nextInt();
            }
            System.out.println();
        }


        // printing first array
        System.out.println("First Array is = ");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(" " + arr1[row][col]);
            }
            System.out.println();
        }

        // printing second array
        System.out.println("Second Array is = ");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(" " + arr2[row][col]);
            }
            System.out.println();
        }


        // sum of first and second array
        int [] [] arr3 = new int [r] [c];
        for (int row = 0; row < r; row++) {

            for (int col = 0; col < c; col++) {
              arr3 [row] [col] = arr1 [row] [col] + arr2 [row] [col];
            }
        }

        // printing sum
        System.out.println("\nSum of first and second array = \n");
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(" " + arr3 [row] [col]);
            }
            System.out.println();
        }
    }
}
