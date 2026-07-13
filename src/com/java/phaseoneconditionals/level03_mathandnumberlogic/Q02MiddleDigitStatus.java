package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q02MiddleDigitStatus {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number : ");
        int num = sc.nextInt();

        int d1 = num/100;
        int d2 = (num / 10) % 10;
        int d3 = num%10;

        if (d2 > d1 && d2 > d3){
            System.out.println("middle is largets");
        } else if (d2 < d1 && d2 < d3) {
            System.out.println("Middle is smallest");
        }else {
            System.out.println("Neither");
        }
        sc.close();

    }
}
/*
Take a 3-digit number and check if middle digit is largest, smallest, or neither.
START
  READ num
  d1 = num/100, d2=(num/10) MOD 10, d3 = num MOD 10
  IF d2 > d1 AND d2 > d3 THEN PRINT "Middle is largest"
  ELSE IF d2 < d1 AND d2 < d3 THEN PRINT "Middle is smallest"
  ELSE PRINT "Neither"
END

**Dry Run** (num=182): d1=1,d2=8,d3=2 → d2>d1(T) and d2>d3(T) → Output: **Middle is largest**
 */