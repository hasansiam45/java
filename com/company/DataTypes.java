package com.company;
import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = userInput.nextLine();
        System.out.println("Enter Your Age : ");
        int age = userInput.nextInt();
        System.out.println("Enter Your Salary : ");
        double salary = userInput.nextDouble();

        System.out.println("Hello " + name + " You are " + age + " Years Old and Your salary is " + salary + " BDT");
    }
}
