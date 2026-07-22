package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q08SumOfOddNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n){
            if (i % 2 != 0){
                sum = sum + i;
            }
            i = i + 1;
        }
        System.out.println(sum);
    }
}

/**
 *
 * START
 *   READ n
 *   i = 1
 *   sum = 0
 *   WHILE i <= n:
 *       IF i MOD 2 != 0 THEN sum = sum + i
 *       END IF
 *       i = i + 1
 *   PRINT sum
 * END
 * **Dry Run** (n=6): i=1(sum=1)→i=2(skip)→i=3(sum=4)→i=4(skip)→i=5(sum=9)→i=6(skip)→stop. Output: **9**
 */