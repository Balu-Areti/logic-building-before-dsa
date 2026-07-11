package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q10EachMonthHowMnayDays {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month 1 is Jan : ");
        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            System.out.println("31 days");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 Days");
        }else {
            System.out.println("invalid");
        }
        sc.close();
    }
}

/*
START
  READ month
  IF month is in {1,3,5,7,8,10,12} THEN PRINT 31
  ELSE IF month is in {4,6,9,11} THEN PRINT 30
  ELSE IF month == 2 THEN PRINT 28
  ELSE PRINT "Invalid"
END
 */