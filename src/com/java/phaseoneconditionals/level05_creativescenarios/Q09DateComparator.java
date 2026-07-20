package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q09DateComparator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Date 1 (day month):");
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();

        System.out.println("Enter Date 2 (day month):");
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();

        /*
         * 🎂 THE BIRTHDAY EXAMPLE LOGIC
         * Step 1: Compare Months First.
         * Example:, August (8) comes before October (10). We don't even need to check the days.
         */
        if (m1 < m2) {
            System.out.println("Date 1 comes first");
        }
        else if (m1 > m2) {
            System.out.println("Date 2 comes first");
        }

        /*
         * Step 2: Tie-Breaker (If Months are equal).
         * Example, If both are August (8), then we must compare the days. August 5 comes before August 15.
         */
        else if (d1 < d2) {
            System.out.println("Date 1 comes first");
        }
        else if (d1 > d2) {
            System.out.println("Date 2 comes first");
        }

        /*
         * Step 3: Exact same dates.
         * Example August 15 and August 15.
         */
        else {
            System.out.println("Both are the same date");
        }
    }
}

/*
Q9. Take two dates (day, month), determine which comes first.
Why compound comparison: Compare month first, then day if months equal.

START
  READ d1, m1, d2, m2
  IF m1 < m2 THEN PRINT "Date 1 first"
  ELSE IF m1 > m2 THEN PRINT "Date 2 first"
  ELSE IF d1 < d2 THEN PRINT "Date 1 first"
  ELSE IF d1 > d2 THEN PRINT "Date 2 first"
  ELSE PRINT "Same date"
END
Dry Run (d1=15,m1=6,d2=3,m2=6): m1==m2 → check d1<d2? 15<3 No → d1>d2? Yes → Output: Date 2 first
 */