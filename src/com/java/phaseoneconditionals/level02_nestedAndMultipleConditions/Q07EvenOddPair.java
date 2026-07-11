package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q07EvenOddPair {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b = sc.nextInt();

        boolean aEven = (a % 2 == 0);
        boolean bEven = (b % 2 == 0);

        if (aEven && bEven){
            System.out.println("Both even ");
        } else if (!aEven && !bEven) {
            System.out.println("both odd");
        }else {
            System.out.println("One even, one odd");
        }
    }

}
/*
START
  READ a, b
  aEven = (a MOD 2 == 0)
  bEven = (b MOD 2 == 0)
  IF aEven AND bEven THEN PRINT "Both even"
  ELSE IF NOT aEven AND NOT bEven THEN PRINT "Both odd"
  ELSE PRINT "One even, one odd"
END
 */