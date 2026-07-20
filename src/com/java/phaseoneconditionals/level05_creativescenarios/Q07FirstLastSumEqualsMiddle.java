package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q07FirstLastSumEqualsMiddle {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three-digits");
        int num = sc.nextInt();

        int d1 = num/100;         //4
        int d2 = (num / 10) % 10; //1
        int d3 = num % 10;        //3

        if (d1 + d3 == d2){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}

/*
START
  READ num
  d1 = num/100, d2=(num/10) MOD 10, d3 = num MOD 10
  IF (d1 + d3) == d2 THEN PRINT "Condition true" ELSE PRINT "False"
END

Dry Run (num=413): d1=4,d2=1,d3=3 → 4+3=7, d2=1 → 7==1? No → Output: False
 */