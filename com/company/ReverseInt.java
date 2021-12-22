package com.company;
import java.util.Scanner;

public class ReverseInt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Integer Number = ");
        int number = input.nextInt();

        int sum = 0, temp = number, r;

        while (temp != 0){

            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }

        System.out.println("Reversed Integer is = "+ sum);
    }
}
