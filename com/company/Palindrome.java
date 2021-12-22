package com.company;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Integer number = ");
        int num = input.nextInt();
        int sum = 0, temp = num, r;

        while (temp != 0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;
        }

        if(num == sum){
            System.out.println("Its a Palindrome!");
        }else{
            System.out.println("Not a Palindrome!");
        }
    }
}
