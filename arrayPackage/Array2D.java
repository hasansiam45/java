package arrayPackage;
import java.util.Scanner;

public interface Array2D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How Many Row You Want = ");
        int r = input.nextInt();
        System.out.print("How Many Column You Want = ");
        int c = input.nextInt();
        int [] [] arr = new int[r] [c];

        // taking input
        for (int row = 0; row <r ; row++) {
            for (int col = 0; col <c ; col++) {
                System.out.print("Enter " + row + " row " + col + " col = ");
                arr[row][col] = input.nextInt();
            }
        }

        System.out.println("Array You Entered Was = ");

        // showing output
        for (int row = 0; row <r ; row++) {
            for (int col = 0; col < c; col++) {
                System.out.print(" " + arr[row][col]);
            }
            System.out.println();
        }


    }
}
