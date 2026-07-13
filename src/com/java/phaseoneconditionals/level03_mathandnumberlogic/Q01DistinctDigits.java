package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q01DistinctDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Digits : ");
        int num = sc.nextInt();     // 123
        int d1 = num/100;           // 1
        int d2 = (num /10) % 10;    // 2
        int d3 = num % 10;         //  3

        if (d1 != d2 && d2 != d3 && d1 != d3){
            System.out.println("All distinct"); // True
        }else {
            System.out.println("Not distinct");
        }
        sc.close();
    }
}
/*
START
  READ num
  d1 = num / 100
  d2 = (num / 10) MOD 10
  d3 = num MOD 10
  IF d1 != d2 AND d2 != d3 AND d1 != d3 THEN
      PRINT "All distinct"
  ELSE
      PRINT "Not distinct"
END
 */