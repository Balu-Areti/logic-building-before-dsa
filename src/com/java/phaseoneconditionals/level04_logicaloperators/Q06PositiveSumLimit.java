package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q06PositiveSumLimit {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number 1 : ");
        int num = sc.nextInt();

        System.out.println("enter number 2 ");
        int num2 = sc.nextInt();

        if (num > 0 && num2 > 0 && (num+num2)< 100){
            System.out.println("Condition satisfied");
        }else {
            System.out.println("Not satisfied");
        }

        sc.close();
    }
}


/*
Take two numbers and check if both are positive and their sum is less than 100.

START
  READ a, b
  IF a>0 AND b>0 AND (a+b)<100 THEN PRINT "Condition satisfied"
  ELSE PRINT "Not satisfied"
END
 */