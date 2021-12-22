package arrayPackage;
import java.util.Scanner;

public class Matrix2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many Row = ");
        int r = input.nextInt();
        int [] [] arr = new int[r][r];
        int diagonalSum = 0;
        int upperSum = 0;
        int lowerSum = 0;


        // getting array input
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < r; col++) {
                System.out.print("Enter " + row + " row " + col + " column = ");
                arr [row] [col] = input.nextInt();
            }
        }

        // find sum of diagonal element, upper triangle and lower triangle
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < r; col++) {
                if(row == col){
                    diagonalSum += arr [row] [col];
                }
                if(row < col){
                    upperSum += arr [row] [col];
                }
                if(row > col){
                    lowerSum += arr [row] [col];
                }
            }
        }

        System.out.println(" sum of diagonal element = " + diagonalSum);
        System.out.println(" sum of upper triangle element = " + upperSum);
        System.out.println(" sum of lower triangle element = " + lowerSum);

    }
}
