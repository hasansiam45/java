package arrayPackage;
import java.util.Scanner;

public class ArrayMaxMin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How Many Numbers you want to input = ");
        int num = input.nextInt();

        double [] arr = new double [num];
        double sum = 0;
        double max = arr[0];
        double min = arr[0];

        // receiving input
        System.out.println("Enter " + num + " Numbers = ");
        for (int i = 0; i <num ; i++) {
            arr[i] = input.nextDouble();
        }

        // Find Max Min
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        // Calculating Sum
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }

        // Output
        System.out.println("Maximum Number is = " + max);
        System.out.println("Minimum Number is = " + min);
        System.out.println("Sum is = " + sum);
        System.out.println("Average is = " + sum/ arr.length);

    }
}
