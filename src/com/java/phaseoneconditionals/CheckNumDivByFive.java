package com.java.phaseoneconditionals;

import java.util.Scanner;

public class CheckNumDivByFive {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = sc.nextInt();

        if(number % 5 == 0){
            System.out.println( number + " Divisble % 5");
        }else System.out.println(number + " not divisible by 5");
        sc.close();
    }
}

/*
START
READ N

IF N % 5 == 0 THEN
  PRINT "Divisible by 5"
ELSE
  PRINT "Not divisible by 5"
END IF
END
 */
