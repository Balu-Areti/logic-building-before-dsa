package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q04AmPmConverter {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter hour (0-23) : ");
        int hour = sc.nextInt();

        System.out.println("Enter min (0-59) :");
        int min = sc.nextInt();

        if (hour < 12){
            System.out.println(hour + " AM" );
        }else {
            System.out.println(hour + "PM");
        }

        sc.close();
    }
}
/*
START
  READ hour, minute
  IF hour < 12 THEN PRINT "AM" ELSE PRINT "PM"
END
 */