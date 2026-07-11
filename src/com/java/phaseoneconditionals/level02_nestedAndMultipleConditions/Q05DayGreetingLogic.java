package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q05DayGreetingLogic {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Time : ");
        int time = sc.nextInt();

        if (time >= 0 && time <= 12){
            System.out.println("Good Morning");
        } else if (time >= 12 && time <= 17) {
            System.out.println("Good Afternoon");
        } else if (time >= 17 && time <= 21) {
            System.out.println("Good evening");
        }else {
            System.out.println("Good night");
        }
        sc.close();

    }
}


/*
Take the hour of the day (0–23)
and print "Good Morning", "Good Afternoon", "Good Evening", or "Good Night".

START
  READ hour
  IF hour>=5 AND hour<12 THEN PRINT "Good Morning"
  ELSE IF hour>=12 AND hour<17 THEN PRINT "Good Afternoon"
  ELSE IF hour>=17 AND hour<21 THEN PRINT "Good Evening"
  ELSE PRINT "Good Night"
END
 */