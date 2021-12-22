package com.company;
import java.util.Scanner;

public class EvenOrOddSum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Starting Even Number = ");
        int startEven = input.nextInt();

        System.out.print("Ending Even Number = ");
        int endEven = input.nextInt();

        int sum = 0;

        if(startEven %2 != 0 || endEven %2 != 0){
            System.out.println("Wrong Input! Start and end number must be even");
        }else{
            for (int i = startEven; i<=endEven; i+=2){
                sum += i;
            }
            System.out.println("Sum is = " + sum);
        }


    }
}
