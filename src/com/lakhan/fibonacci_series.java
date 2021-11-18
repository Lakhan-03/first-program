package com.lakhan;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class fibonacci_series {
    public static void main(String[] args) {
        System.out.print("Enter a Number: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int n1= 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);

        for( int i = 2; i<n; i++){
            int n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);

        }
    }
}
