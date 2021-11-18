package com.lakhan;

import java.util.Scanner;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class simpleinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Principal Ammount: ");
        int P = input.nextInt();
        System.out.print("Input time(in years): ");
        float T = input.nextFloat();
        System.out.print("Input Interest Rate: ");
        float R = input.nextFloat();
        // formula for simple interest = P * R * T / 100
        float I = P * R * T / 100;
        System.out.println("Interest of Principal amount "+ P +" in " + T + " Years of time" + " at interest rate of " + R + "% is "+ I );
        System.out.println("Total Payble amount after " + T + " years is " +(P + I));
    }
}
