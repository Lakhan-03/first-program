package com.lakhan;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input.
public class odd_even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        if (num%2 == 0){
            System.out.println(num+ " is a even number");
        }
        else {
            System.out.println(num + " is a odd number");
        }
    }
}
