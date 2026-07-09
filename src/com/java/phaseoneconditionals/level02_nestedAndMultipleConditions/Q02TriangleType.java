package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q02TriangleType {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three sides of triangles ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a+b > c) && (b+c > a) && (a+c>b)){
            if (a == b && b==c){
                System.out.println("Equilateral Triangle"); ////Three sides equal
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle "); ////any of two sides
            }else {
                System.out.println("Scalene Triangle "); //// no one qual triangle
            }
        }else {
            System.out.println("Invalid Triangle");
        }
        sc.close();

    }
}
/*
```
START
  READ a, b, c
  IF triangle is valid THEN
      IF a==b AND b==c THEN PRINT "Equilateral"
      ELSE IF a==b OR b==c OR a==c THEN PRINT "Isosceles"
      ELSE PRINT "Scalene"
  ELSE
      PRINT "Not valid"
END
```
 */