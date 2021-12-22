package arrayPackage;
import java.util.Scanner;

public class ForEachLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How many Name you want to input = ");
        int n = input.nextInt();
        String [] arr = new String[n];
        System.out.println("Enter " + n + " names");
        for (int i = 0; i <n ; i++) {
            arr[i] = input.next();
        }

        System.out.print("Names you entered are = ");

        for(String x : arr){
            System.out.print(x + " ");
        }
    }
}
