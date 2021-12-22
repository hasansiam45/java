package com.company;
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any Integer number = ");
        int num = input.nextInt(), temp = num, sum = 0, r;

        while (temp != 0){
            r = temp % 10;
            sum = sum+ (r*r*r);
            temp = temp / 10;
        }

        if(num == sum){
            System.out.println("Its an Armstrong Number!");
        }else{
            System.out.println("Not an Armstrong Number");
        }

    }
}
