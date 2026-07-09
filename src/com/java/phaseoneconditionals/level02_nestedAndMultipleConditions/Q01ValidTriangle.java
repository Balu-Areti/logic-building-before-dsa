package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q01ValidTriangle {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of the triangle: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b > c && b+c > a && a+c > b){
            System.out.println("Valid Triangle ");
        }else {
            System.out.println("not valid ");
        }
    }
}

/*
START
  READ a, b, c

  IF (a + b > c) AND (b + c > a) AND (a + c > b) THEN
      PRINT "Valid Triangle"
  ELSE
      PRINT "Invalid Triangle"
  END IF
END
 */