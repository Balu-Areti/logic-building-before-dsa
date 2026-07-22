package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q14DigitSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;

        while (num > 0){
            sum = sum + (num % 10);
            num = num/10;
        }
        System.out.println("The checksum (sum of digits) is: " + sum);

        sc.close();
    }
}

/**
/*
 * Real-world Use Case:
 * GPay/PhonePe can use the sum of transaction ID digits
 * to trigger simple reward logic.

 * Example:
 * Transaction ID: 456
 * Sum of digits = 4 + 5 + 6 = 15

 * If sum is even -> ₹10 Cashback
 * If sum is odd  -> Better Luck Next Time
 **/
/*
START
  READ num
  sum = 0
  WHILE num > 0:
      sum = sum + (num MOD 10)
      num = num / 10
  PRINT sum
END
```
**Dry Run** (num=456): sum=6,num=45→sum=6+5=11,num=4→sum=11+4=15,num=0→stop. Output: **15**
 */