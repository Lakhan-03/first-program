package com.lakhan;

import java.util.Scanner;
//Take name as input and print a greeting message for that name.
public class greeting_message {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String s = input.next();
        System.out.println("Hey "+ s + " ,How are you doing?");
    }
}
