package com.lakhan;

import java.util.Scanner;

//Input currency in rupees and output in USD.
public class currency_into_USD {
    public static void main(String[] args) {
        System.out.print("Input in Rupees: ");
        Scanner input = new Scanner(System.in);
        double rp = input.nextDouble();
        double USD = 0.013 * rp;
        System.out.println(rp + " in USD = " + USD);
    }
}
