package arrayPackage;
import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How Many Numbers you want to input = ");
        int num = input.nextInt();
        double [] arr = new double [num];
        double sum = 0;

        System.out.println("Enter " + num + " Numbers = ");
        for (int i = 0; i <num ; i++) {
            arr[i] = input.nextDouble();
        }

        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        System.out.println("Sum is = " + sum);
        System.out.println("Average is = " + sum/ arr.length);


    }
}
