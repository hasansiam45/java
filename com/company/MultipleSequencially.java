package com.company;
import java.util.Scanner;

public class MultipleSequencially {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter nth number = ");

        int mul = 1, num = input.nextInt();

        for(int i = 1; i <= num; i++){
            mul = mul * i;
        }

        System.out.println("Multiplication is = " + mul);
    }
}
