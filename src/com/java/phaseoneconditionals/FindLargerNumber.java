package com.java.phaseoneconditionals;

import java.util.Scanner;

public class FindLargerNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number (Number1): ");
        int number1 = sc.nextInt();

        System.out.println("Enter first number (number2): ");
        int number2 = sc.nextInt();

        if (number1 > number2){
            System.out.println( "Larger number1 is: " + number1);
        }else if (number2 > number1){
            System.out.println("Larger number2 is: " + number2);

        }else System.out.println("Both are equal");


    }

}

/*

START
READ A
READ B

IF A > B THEN
  PRINT A
ELSE IF B > A THEN
  PRINT B
ELSE
  PRINT "Both are equal"
END IF
END
 */