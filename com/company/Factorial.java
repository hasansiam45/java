package com.company;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter nth Factorial = ");
        int num = input.nextInt();
        int fact = 1;
        int i = num;
        while (i >= 1){

            fact = fact * i;
            i --;

        }

        System.out.println("Factorial of " + num + " is " + fact);




    }
}
