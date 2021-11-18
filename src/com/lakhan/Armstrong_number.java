package com.lakhan;
//To find Armstrong Number between two given number.

import java.util.Scanner;

//To find Armstrong Number between two given number.
public class Armstrong_number {
    public static void main(String[] args) {
        System.out.print("Enter two numbers");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        boolean answer = false;
        for (int i = a ; i <= b; i++) {
            int c = i;
            int rem = 0;
            while (c != 0) {
                int digit = c% 10;
                rem += (digit * digit * digit);
                c= c / 10;
            }
            if (i == rem) {
                System.out.println(rem+ " is a Armstrong Number");
                answer = true;
            }
        }
        if (answer == false){
            System.out.println("there is no Armstrong Number in this limit");
        }

    }
}