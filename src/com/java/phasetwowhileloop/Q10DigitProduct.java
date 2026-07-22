package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q10DigitProduct {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter number ");
        int num = sc.nextInt();
        int product = 1;

        while (num > 0){
            int digit = num % 10;     // 4   3
            product = product * digit;// 4   3*12
            num = num / 10;           // 23  2
        }
        System.out.println(product);
    }
}

/**
 * ### Q10. Find and print the product of all digits of a given number.
 * **Why while on the number itself:** No fixed count — loop until number becomes 0, extracting digits via MOD/DIV.
 * ```
 * START
 *   READ num
 *   product = 1
 *   WHILE num > 0:
 *       digit = num MOD 10
 *       product = product * digit
 *       num = num / 10
 *   PRINT product
 * END
 * ```
 * **Dry Run** (num=234): digit=4,product=4,num=23
 * →digit=3,product=12,num=2
 * →digit=2,product=24,num=0
 * →stop. Output: **24**
 */