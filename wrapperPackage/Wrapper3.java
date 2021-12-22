package wrapperPackage;

import java.util.Scanner;

public class Wrapper3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any decimal number = ");
        int n = input.nextInt();

        String octal = Integer.toOctalString(n);
        String hexa = Integer.toHexString(n);
        String binary = Integer.toBinaryString(n);

        System.out.println("Binary = " + binary);
        System.out.println("Octal = " + octal);
        System.out.println("Hex = " + hexa);
    }
}
