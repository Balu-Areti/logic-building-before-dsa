package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q07SumOfEvenNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        int i = 1;
        int sum = 0;

        while(i <= number){
            if (i % 2 == 0){
                sum = sum+ i;
            }
            i = i +1;
        }
        System.out.println(" Sum of even numbers is: " + sum);
        sc.close();
    }
}
/**
 * START
 *   READ n
 *   i = 1
 *   sum = 0
 *   WHILE i <= n:
 *       IF i MOD 2 == 0 THEN sum = sum + i
 *       i = i + 1
 *   PRINT sum
 * END
 * Dry Run (n=6): i=1(odd,skip)→i=2(sum=2)→i=3(skip)→i=4(sum=6)→i=5(skip)→i=6(sum=12)→i=7,stop. Output: 12
 */