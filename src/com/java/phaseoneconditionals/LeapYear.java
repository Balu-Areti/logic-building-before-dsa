package com.java.phaseoneconditionals;

import java.util.Scanner;

public class LeapYear {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Leap year logical condition
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        scanner.close();

    }
}
/*
START
READ year

IF (year % 400 == 0) OR (year % 4 == 0 AND year % 100 != 0) THEN
  PRINT "Leap Year"
ELSE
  PRINT "Not a Leap Year"
END IF
END
 */