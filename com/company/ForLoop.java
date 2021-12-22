package com.company;
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter how many number do you want to print = ");

        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            System.out.println( i + " Hello");
            if(i % 5 == 0){
                break;
            }
        }
    }
}
