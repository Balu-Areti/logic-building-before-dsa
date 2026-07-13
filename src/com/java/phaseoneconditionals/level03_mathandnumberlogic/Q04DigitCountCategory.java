package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q04DigitCountCategory {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Digit");
        int num = sc.nextInt();

        if (num<10){
            System.out.println("single digit :" + num);
        } else if (num < 99) {
            System.out.println("double digit : "+ num);
        }else {
            System.out.println("Multi-digit: " + num);
        }
        sc.close();
    }
}

//Check whether a given integer is single-digit, double-digit, or multi-digit.