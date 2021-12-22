package com.company;
import java.util.Scanner;

public class NthSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nth number = ");
        int sqr = 0 , num = input.nextInt();

        for(int i = 1; i <= num; i++){
            sqr = sqr + (i * i);
        }

        System.out.println("Total sum of square is = " + sqr);
    }
}
