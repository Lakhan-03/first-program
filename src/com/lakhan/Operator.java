package com.lakhan;

import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Two Numbers:");
        float a = input.nextFloat();
        float b = input.nextFloat();

        System.out.println("Input a operator from (+, -, *, /): ");
        String op = input.next();
        double answer = 0;
        if( op.equals("+")){
            answer = a +b;
        }
        else if(op.equals("-")){
            answer = a-b;
        }
        else if(op.equals("*")){
            answer = a*b;
        }
        else if(op.equals("/")){
            answer = a/b;
        }
        else {
            System.out.println("Invalid Input");
        }

        System.out.println(answer);


    }
}
