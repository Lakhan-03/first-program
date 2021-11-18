package com.lakhan;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class large_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();

        if( a > b) {
            System.out.println(a + " is greater than " + b);
        }
        else if( a <b){
            System.out.println(b + " is greater than " + a );
        }
        else{
            System.out.println(a +" is equal to "+ b);
        }
    }
}
