package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q04MultipleCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number ");
        int a = sc.nextInt();

        System.out.println("Enter second number ");
        int b = sc.nextInt();

        if (a != 0 && b != 0) {
            if (a % b == 0 || b % a == 0) {
                System.out.println("One is Multiplr of other");
            } else {
                System.out.println("No, they are not multiples of each other");
            }
        }else {
            System.out.println("Please enter non-zero numbers.");
        }
        sc.close();
    }
}

/*
START
  READ a, b
  IF (a MOD b == 0) OR (b MOD a == 0) THEN
      PRINT "One is multiple of other"
  ELSE
      PRINT "No"
END
```
 */