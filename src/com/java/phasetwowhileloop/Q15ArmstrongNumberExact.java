package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q15ArmstrongNumberExact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to verify: ");
        int num = sc.nextInt();
        int original = num; // original = num

        // n = count of digits in num   // (Shortcut: Convert to string, get length)
        int n = String.valueOf(num).length();

        int sum = 0;        // sum = 0

        // WHILE num > 0:
        while (num > 0) {
            int digit = num % 10;                     // digit = num MOD 10   153 % 10 = 3        15%10 = 5      1  27+125+1 = 153
            sum = sum + (int) Math.pow(digit, n);     // sum = sum + digit^n  0 + 0+ 3^3 = 27     0+0+5^5= 125   1
            num = num / 10;                           // num = num / 10       153 /10 = 15          15 /10 = 1   0
        }

        // IF sum == original THEN PRINT...
        if (sum == original) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");
        }

        sc.close();
    }
}
/*
**Why while + power of digit count:** For each digit, raise to power = number of digits, sum, compare to original.
```
START
  READ num
  original = num, n = count of digits in num
  sum = 0
  WHILE num > 0:
      digit = num MOD 10
      sum = sum + digit^n
      num = num / 10
  IF sum == original THEN PRINT "Armstrong" ELSE PRINT "Not Armstrong"
END
*
* **Dry Run** (num=153, n=3): digit=3,sum=27,num=15→digit=5,sum=27+125=152,num=1→digit=1,sum=152+1=153,num=0→stop. sum==153==original → Output: **Armstrong**
 */