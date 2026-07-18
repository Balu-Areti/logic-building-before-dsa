package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q05TaxEligibilityCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age ");
        byte age = sc.nextByte();

        System.out.println("Enter income : ");
        int income = sc.nextInt();

        if (age > 18 && income > 500000){
            System.out.println("Eligible for tax");
        }else {
            System.out.println("Not eligible");
        }

        sc.close();
    }
}

/*
Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
START
  READ age, income
  IF age > 18 AND income > 500000 THEN PRINT "Eligible for tax"
  ELSE PRINT "Not eligible"
END
 */