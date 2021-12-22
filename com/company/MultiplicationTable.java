package com.company;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Which multiplication table do you want = ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++){

            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
