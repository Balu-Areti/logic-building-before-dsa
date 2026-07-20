package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q05ArithmeticProgression {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Calculate the differences
        if (b -a == c - b){
            System.out.println("The numbers are in Arithmetic Progression (AP).");
        }else {
            System.out.println("The numbers are in not Arithmetic Progression (AP).");
        }

    }
}

/*
START
  READ a, b, c
  IF (b - a) == (c - b) THEN PRINT "AP" ELSE PRINT "Not AP"
END
Dry Run (a=2,b=5,c=8): 5-2=3, 8-5=3 → equal → Output: AP
 */