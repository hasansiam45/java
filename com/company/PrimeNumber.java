package com.company;
import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter any Number = ");
        int num = input.nextInt(), count = 0;

        if(num > 1){
            for (int i = 2; i<num; i++){
                if(num % i == 0){
                    count++;
                    break;
                }
            }
        }
        if(count > 0){
            System.out.println("Not a prime Number");
        }else{
            System.out.println("Prime Number");
        }

    }
}
