package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q08AlphabetRangeCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character (a to z) : ");
        char ch = sc.next().charAt(0);

        if (ch > 'a' && ch <= 'm'){
            System.out.println("You entered character in (a to m) middle");
        } else if (ch >= 'm' && ch <= 'z') {
            System.out.println("You entered character in (n to z) last");
        }else {
            System.out.println("not valid");
        }
        sc.close();
    }
}
/*
Take an alphabet character and check if it lies between 'a' and 'm' or 'n' and 'z'.
 */