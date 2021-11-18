package com.lakhan;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome_string {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        int n = s1.length();
        String s2 = "";
       for(int i = n-1; i>=0; i--){
           s2 = s2+ s1.charAt(i);
       }

       if (s1.equals(s2)){
           System.out.println(s1 + " is a palindrome number");
       }
       else{
           System.out.println(s1 + " is not a palindrome number");
       }
    }
}
