package com.company;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number = ");

        int num = input.nextInt();

        int i = 1;

        do {
            System.out.println(i + " I love You ");
            i++;
        }
        while (i <= num);
    }
}
