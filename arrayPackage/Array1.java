package arrayPackage;

public class Array1 {
    public static void main(String[] args) {
        int [] num1 = new int [5];
        int sum = 0;

        num1[0] = 1;
        num1[1] = 2;
        num1[2] = 3;
        num1[3] = 4;
        num1[4] = 5;


        for (int i = 0; i <num1.length ; i++) {
            sum = sum + num1[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average is = " + sum/num1.length);
    }
}
