package com.java.phaseoneconditionals;

import java.util.Scanner;

public class CheckNumDivByThreeAndFive {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int number = sc.nextInt();

        if (number % 5 == 0 && number % 3 == 0){
            System.out.println(number + "  Divisible by 3 and 5 ");
        }else System.out.println(number + " not Divisible by 3 and 5 ");
        sc.close();
    }
}
/*

START
READ N

IF N % 3 == 0 AND N % 5 == 0 THEN
  PRINT "Divisible by both 3 and 5"
ELSE
  PRINT "Not divisible by both"
END IF
END
 */