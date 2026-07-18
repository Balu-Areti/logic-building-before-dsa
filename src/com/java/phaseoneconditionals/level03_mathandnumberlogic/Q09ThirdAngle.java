package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q09ThirdAngle {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first angle: ");
        int angle1 = sc.nextInt();
        System.out.println("Enter second angle: ");
        int angle2 = sc.nextInt();

        // Computing (calculating) the third angle
        int angle3 = 180 - (angle1 + angle2);

        if (angle1 + angle2 < 180 && angle1 > 0 && angle2 > 0) {
            System.out.println("Third angle = " + angle3 + " degrees");
        } else {
            System.out.println("Invalid angles! Sum of two angles must be less than 180.");
        }

        sc.close();
    }
}
/*
Given two angles of a triangle, find the third angle.
Sum of all angles in a triangle = 180 degrees.

START
  READ angle1, angle2
  IF (angle1 + angle2 < 180) AND (angle1 > 0) AND (angle2 > 0) THEN
      angle3 = 180 - (angle1 + angle2)
      PRINT "Third angle = angle3"
  ELSE
      PRINT "Invalid angles!"
END

**Dry Run** (angle1=45, angle2=75): 45+75=120 < 180, angle3=60 → Output: **Third angle = 60**
 */
