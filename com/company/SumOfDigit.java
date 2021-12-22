package com.company;
import java.util.Scanner;

public class SumOfDigit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the digit = ");
        int n = input.nextInt();
        int temp = n, r,sum=0;
         while(temp != 0){
             r = temp % 10;
             sum = sum + r;
             temp = temp / 10;
         }

        System.out.println("Sum of digit is = " + sum);

    }
}
