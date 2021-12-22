package com.company;
import java.util.Scanner;

public class CapitalSmall {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter = ");

        char letter = input.next().charAt(0);

        if(letter >= 'a' && letter <= 'z'){
            System.out.println("Small Letter");
        }else if(letter >= 'A' && letter <= 'Z'){
            System.out.println("Capital Letter");
        }else{
            System.out.println("Invalid input");
        }

    }
}
