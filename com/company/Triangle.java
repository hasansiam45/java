package com.company;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base = ");
        float base = input.nextFloat();
        System.out.print("Enter Height = ");
        float height = input.nextFloat();

        double triangle = 0.5 * base * height;

        System.out.println("Triangle = " + triangle);

    }
}
