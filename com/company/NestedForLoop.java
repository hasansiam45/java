package com.company;
import java.util.Scanner;

public class NestedForLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter mth number = ");
        int m = input.nextInt();

        System.out.print("Enter nth number = ");
        int n = input.nextInt();

        if(n>m){
            for (int i = m; i<= n; i++){
                for(int j = 1; j <= 10; j++){
                    System.out.println(i + " x " + j + " = " + i*j);
                }
                System.out.println();
            }
        }else if (m>n){
            for (int i = m; i >= n; i--){
                for(int j = 1; j <= 10; j++){
                    System.out.println(i + " x " + j + " = " + i*j);
                }
                System.out.println();
            }
        }else{

                for(int i = 1; i <= 10; i++){
                    System.out.println(m + " x " + i + " = " + m*i);
                }

        }
    }
}
