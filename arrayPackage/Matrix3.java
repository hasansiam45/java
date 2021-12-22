package arrayPackage;
import java.util.Scanner;

public class Matrix3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("how many row = ");
        int r = input.nextInt();
        int k = 1;
        int [] [] arr = new int [r] [r+1];

        // storing values to array
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < r+1; col++) {
                arr [row] [col] = k;
                k++;
            }
        }

        // printing array
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < r+1; col++) {
                System.out.print(" "+ arr [row] [col]);
            }
            System.out.println();
        }
    }
}
