package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class DayOfWeekPrinter {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day in (1-7) ");
        byte day = sc.nextByte();

        if (day == 1){
            System.out.println("Monday");
        } else if (day ==2) {
            System.out.println("Tus");
        } else if (day == 3) {
            System.out.println("Wed");
        } else if (day ==4 ) {
            System.out.println("Thur");
        } else if (day == 5) {
            System.out.println("Friday");
        }else if (day == 6){
            System.out.println("Sat");
        }else if (day == 7){
            System.out.println("Sun");
        }else {
            System.out.println("Invalid day");
        }
    }
}
/*
take a day number (1–7) and print the corresponding day name.

START
  READ day
  IF day==1 THEN PRINT "Monday"
  ELSE IF day==2 THEN PRINT "Tuesday"
  ... (continue for 3-7)
  ELSE PRINT "Invalid day"
END

 */