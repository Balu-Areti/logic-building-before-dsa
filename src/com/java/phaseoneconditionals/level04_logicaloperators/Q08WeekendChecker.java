package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q08WeekendChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day in Number (1-7) where 1 is monday");
        byte day = sc.nextByte();

        if (day == 6 || day == 7){
            System.out.println("Weekend");
        }else if (day >= 1 && day <= 5){
            System.out.println("Working day");
        }else {
            System.out.println("Invalid input! Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}
/*
START
  READ day
  IF day==6 OR day==7 THEN PRINT "Weekend" ELSE PRINT "Weekday"
END
```
 */