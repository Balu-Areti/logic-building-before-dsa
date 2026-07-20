package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q03ValidDateValidator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day (1-31) :");
        int day = sc.nextInt();
        System.out.println("Enter Month (1-12)");
        int month = sc.nextInt();

//        int maxDay;

        if (month < 1 || month > 12){
            System.out.println("Invalid");
            sc.close();
            return;
        }

        // Index 0 is a dummy value (0) because months start from 1.
        // Array values:     0,Jan, Feb,Mar,Apr,May,Jun,Jul,Aug,Sep,Oct,Nov,Dec
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Instead of if-else, direct ga array nunchi maxDay
        int maxDay = daysInMonth[month];

        /*
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            maxDay = 31;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else {
            maxDay = 28;
        }
         */
        if (day >= 1 && day <= maxDay){
            System.out.println("Valid date");
        }else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}

/*
START
  READ day, month
  IF month < 1 OR month > 12 THEN PRINT "Invalid" ; STOP
  IF month is in {1,3,5,7,8,10,12} THEN maxDay=31
  ELSE IF month is in {4,6,9,11} THEN maxDay=30
  ELSE maxDay=28
  IF day >=1 AND day <= maxDay THEN PRINT "Valid date" ELSE PRINT "Invalid date"
END
 */