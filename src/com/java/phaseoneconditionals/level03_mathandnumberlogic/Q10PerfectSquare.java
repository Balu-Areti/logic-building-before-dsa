package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q10PerfectSquare {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int i = 1;
        while (i * i < num){
            i++;
        }

        if (i * i == num){
            System.out.println("perfect square");
        }else {
            System.out.println("Not perfect square");
        }

        sc.close();
    }
}
/*
Check if a given integer is a perfect square.
START
  READ num
  i = 1
  WHILE i*i < num:
      i = i + 1
  IF i*i == num THEN PRINT "Perfect square" ELSE PRINT "Not a perfect square"
END
**Dry Run** (num=16): i=1(1<16)→i=2(4<16)→i=3(9<16)→i=4(16<16 False, stop) → check 4*4==16 True → Output: **Perfect square**

 */