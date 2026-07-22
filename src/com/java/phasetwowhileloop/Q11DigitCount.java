package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q11DigitCount {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter NUmber : ");
        int number = sc.nextInt();
        int count = 0;

        while (number > 0){
            count = count + 1;
            number = number / 10;
        }
        System.out.println("Total digits entered: " + count);

        // App logic validation (Extra knowledge)
        if(count == 6) {
            System.out.println("OTP Sent successfully!");
        } else {
            System.out.println("Error: Invalid Mobile Number");
        }

        sc.close();
    }
}

/*
we use OTP Verification user is really entered 6 Digits or less.
### Q11. Count and print the total number of digits in a given number.
**Why while:** Keep dividing by 10 until 0 — count how many times.
```
START
  READ num
  count = 0
  WHILE num > 0:
      count = count + 1
      num = num / 10
  PRINT count
END
```
**Dry Run** (num=5821): count=1,num=582→count=2,num=58→count=3,num=5→count=4,num=0→stop. Output: **4**
 */