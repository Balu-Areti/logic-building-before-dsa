package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q06GeometricProgression {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Zero check: Usually GP numbers are non-zero
        if (a == 0 || b == 0 || c == 0) {
            System.out.println("The numbers are NOT in Geometric Progression (zeros not allowed).");
        }

        // The Pro-Level Check using Cross-Multiplication
        if (b * b == a * c){
            System.out.println("The numbers are in Geometric Progression (GP).");
        }else {
            System.out.println("Not GP Geometric Progression (GP)");
        }
    }
}

/*
START
  READ a, b, c
  IF (b*b) == (a*c) THEN PRINT "GP" ELSE PRINT "Not GP"
END
Dry Run (a=2,b=4,c=8): bb=16, ac=16 → equal → Output: GP
 */