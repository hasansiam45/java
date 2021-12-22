package wrapperPackage;

import java.util.Scanner;

public class Wrapper4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a binary Number = ");
        String binary = input.next();

        int decimal1 = Integer.parseInt(binary, 2);
        System.out.println("Decimal = "+ decimal1);

        System.out.print("Enter an octal Number = ");
        String octal = input.next();

        int decimal2 = Integer.parseInt(octal, 8);
        System.out.println("Decimal = "+ decimal2);

        System.out.print("Enter an hexadecimal Number = ");
        String hex = input.next();

        int decimal3 = Integer.parseInt(hex, 16);
        System.out.println("Decimal = "+ decimal3);

    }
}
