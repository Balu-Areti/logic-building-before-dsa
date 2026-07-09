package com.java.phaseoneconditionals;

import java.util.Scanner;

public class EvenOrOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any number : ");
        int number = sc.nextInt();

        if(number % 2 == 0){
            System.out.println("even");
        }else System.out.println("Odd");
        sc.close();
    }
}

/*
START
READ N

IF N % 2 != 0 THEN
  PRINT "Odd"
ELSE
  PRINT "Even"
END IF
END
 */