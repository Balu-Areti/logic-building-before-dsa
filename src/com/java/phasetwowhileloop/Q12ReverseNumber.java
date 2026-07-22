package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q12ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        System.out.println("Before reversing the number : " + number);
        int rev = 0;

        while (number > 0){
            int digit = number % 10; //extract last digit 0 * 10 + 3 ➔ 3
            rev = rev * 10 + digit; // 3 * 10 + 2 ➔ 30 + 2 ➔ 32
            number = number / 10;  // last digit remove 32 * 10 + 1 ➔ 320 + 1 ➔ 321
        }

        System.out.println("After reverse the given number: "+rev);


    }
}
/*
Real-world App Use Case:
In Netflix, suppose you watched Movie 1, Movie 2, and Movie 3 in that order.
The database stores them as 1 → 2 → 3 (watch order). However, when you open the Watch History page, you should see the most recently watched movie first.
So, the backend reverses the data and sends it to the UI as 3 → 2 → 1 (latest first).
 */

/*
### Q12. Reverse the given number and print the reversed value.
**Why while + digit-by-digit build:** Pull last digit, append to a growing reversed number.
```
START
  READ num
  rev = 0
  WHILE num > 0:
      digit = num MOD 10
      rev = rev * 10 + digit
      num = num / 10
  PRINT rev
END
```
**Dry Run** (num=123): digit=3,rev=3,num=12→digit=2,rev=32,num=1→digit=1,rev=321,num=0→stop. Output: **321**

 */