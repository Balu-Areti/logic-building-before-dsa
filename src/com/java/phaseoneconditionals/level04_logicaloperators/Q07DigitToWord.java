package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q07DigitToWord {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter digit (0-9) : ");
        int digit = sc.nextInt();

        // Creating a look-up array
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

        // Validation check (digit must be a valid array index between 0 and 9)
        if (digit >= 0 && digit <= 9) {
            System.out.println(words[digit]);
        } else {
            System.out.println("Invalid input! Please enter only a single digit (0-9).");
        }

//        switch (digit){
//            case 0:
//                System.out.println("Zero");
//                break;
//            case 1:
//                System.out.println("One");
//                break;
//            case 3:
//                System.out.println("Three");
//                break;
//
//            case 4:
//                System.out.println("Four");
//
//            case 5:
//                System.out.println("Five");
//                break;
//            case 6:
//                System.out.println("Six");
//                break;
//            case 7:
//                System.out.println("Seven");
//                break;
//
//            case 8:
//                System.out.println("Eight");
//                break;
//            case 9:
//                System.out.println("Nine");
//                break;
//            default:
//                System.out.println("Invalid digit ");
//        }


        sc.close();
    }
}
