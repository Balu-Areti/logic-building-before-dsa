package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q08RangeChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number :  ");
        int range = sc.nextInt();

        if (range >= 100 && range <= 999){
            System.out.println("in range");
        }else {
            System.out.println("Out of range");
        }

        sc.close();
    }
}
/*
Check if a given number falls within a specified range [low, high].

START
  READ low, high, num
  IF num >= low AND num <= high THEN
      PRINT "Within range"
  ELSE
      PRINT "Outside range"
END

**Dry Run** (low=10, high=50, num=25): 25>=10(T) AND 25<=50(T) → Output: **Within range**
**Dry Run** (low=10, high=50, num=75): 75>=10(T) AND 75<=50(F) → Output: **Outside range**
 */
