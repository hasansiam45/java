package com.company;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Celsius : ");
        double cel = input.nextDouble();

        double farenRes = 1.8 * cel + 32;
        System.out.println("Farenheigth result = " + farenRes);

        System.out.println("Enter Fahrenheit : ");
        double far = input.nextDouble();
        double celRes = (far - 32) * 0.556;
        System.out.println("Celsius result = " + celRes);
    }
}
