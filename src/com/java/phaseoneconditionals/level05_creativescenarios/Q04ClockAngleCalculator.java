package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q04ClockAngleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours (0-23 or 1-12): ");
        int h = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int m = sc.nextInt();

        // 1. Calculate minute hand angle
        double minuteAngle = m * 6.0;

        // 2. Calculate hour hand angle (mod 12 keeps it in 12-hour format)
        double hourAngle = (h % 12) * 30.0 + (m * 0.5);

        // 3. Find the difference
        double diff = hourAngle - minuteAngle;

        // Custom ABS logic using if (convert negative to positive)
        if (diff < 0) {
            diff = -diff;
        }

        // 4. Find the smaller angle (MIN logic using if)
        double angle = diff;
        if (diff > 180) {
            angle = 360 - diff;
        }

        System.out.println("The smaller angle between the hour and minute hand is: " + angle + " degrees");

        sc.close();
    }
}


/*
START
  READ h, m
  minuteAngle = m * 6
  hourAngle = (h MOD 12) * 30 + m * 0.5
  diff = ABS(hourAngle - minuteAngle)
  angle = MIN(diff, 360 - diff)
  PRINT angle
END
Dry Run (h=3, m=0): hourAngle=3*30+0=90, minuteAngle=0 → diff=90 → min(90,270)=90 → Output: 90
 */