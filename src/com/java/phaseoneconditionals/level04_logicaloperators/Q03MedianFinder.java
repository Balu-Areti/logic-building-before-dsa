package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q03MedianFinder {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers one ");
        int num1 = sc.nextInt();
        System.out.println("Enter numbers two ");
        int num2 = sc.nextInt();
        System.out.println("Enter numbers three ");
        int num3 = sc.nextInt();

        // Check if 'num1' is the median
        if( (num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)){
            System.out.println("median" + num1);
        } else if (num2 >= num1 && (num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            System.out.println("number2 median " + num2);
        }else {
            System.out.println("neither maximum nor minimum"+ num3);
        }
    }
}
/*
Take three numbers and print the median value (neither maximum nor minimum).
START
  READ a, b, c
  IF (a>=b AND a<=c) OR (a<=b AND a>=c) THEN PRINT a
  ELSE IF (b>=a AND b<=c) OR (b<=a AND b>=c) THEN PRINT b
  ELSE PRINT c
END
**Dry Run** (a=10,b=5,c=8): check a: (10>=5 AND 10<=8)=F, (10<=5 AND 10>=8)=F → check b: (5>=10 AND..)=F, (5<=10 AND 5>=8)=F → falls to c → Output: **8**
 */