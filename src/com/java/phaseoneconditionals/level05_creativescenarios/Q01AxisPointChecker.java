package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q01AxisPointChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X coordinate : ");
        int x = sc.nextInt();
        System.out.println("Enter Y coordinate : ");
        int y = sc.nextInt();

        if (x == 0 && y == 0){
            System.out.println("The point lies at the origin");
        } else if (y == 0) {
            System.out.println(" The point lies at the On X-axis");
        } else if (x==0) {
            System.out.println(" The point lies at the Y-axis");
        }else {
            System.out.println("Not on axis");
        }
        sc.close();

    }
}

/*
START
  READ x, y
  IF x==0 AND y==0 THEN PRINT "Origin"
  ELSE IF y==0 THEN PRINT "On X-axis"
  ELSE IF x==0 THEN PRINT "On Y-axis"
  ELSE PRINT "Not on axis"
END
This is x is rigth to left
y is top to bottom    |
4  Quadrants      1   |  2
                ---- 0|0 -----
                  3   | 4
                      |
 */