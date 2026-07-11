package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q06VotingEligibilityCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age :");
        byte age = sc.nextByte();

        if(age > 18){
            System.out.println("You are eligible ");
        }else System.out.println("You are not eligible");

        sc.close();
    }
}
