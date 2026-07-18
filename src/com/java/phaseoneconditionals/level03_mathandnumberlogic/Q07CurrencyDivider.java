package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q07CurrencyDivider {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to withdraw : ");
        int amount = sc.nextInt();

        if ( amount %2000 == 0 || amount % 500 ==0 || amount % 200 == 0){
            System.out.println("can be divide");
        }else {
            System.out.println("cannot be divided");
        }

        sc.close();
    }
}
/*
Divide an amount into Indian currency denominations (2000, 500, 200, 100, 50, 20, 10, 5, 2, 1).
Key idea: Use division (/) to get count, then modulo (%) for remaining amount.

START
  READ amount

  IF amount % 2000 == 0 OR amount % 500 == 0 OR amount % 200 == 0
  [PRINT "Can evenly divide "
  ELSE
  PRINT " cannot be divided"
  END
 */

