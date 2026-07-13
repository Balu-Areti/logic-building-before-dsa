package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q03FirstAndLastDigit {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 4 Digits: ");
        int num = sc.nextInt();
        int first = num/1000;   //first digit
        int last = num % 10;   //last digit

        if (first == last){
            System.out.println("equal");
        }else {
            System.out.println("Not equal");
        }
        sc.close();
    }
}

//Take a 4-digit number and check if the first and last digits are equal.
/*
START
  READ num
  first = num / 1000
  last = num MOD 10
  IF first == last THEN PRINT "Equal" ELSE PRINT "Not equal"
END

**Dry Run** (num=3213): first=3, last=3 → Output: **Equal**
 */