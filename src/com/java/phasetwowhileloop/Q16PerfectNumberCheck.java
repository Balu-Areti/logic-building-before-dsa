package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q16PerfectNumberCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your cart ID : ");

    }

}
/*
START
  READ num
  i = 1, sum = 0
  WHILE i <= num/2:
      IF num MOD i == 0 THEN sum = sum + i
      i = i + 1
  IF sum == num THEN PRINT "Perfect" ELSE PRINT "Not perfect"
END
```
**Dry Run** (num=6): i=1(6%1=0,sum=1)→i=2(6%2=0,sum=3)→i=3(6%3=0,sum=6)→i=4,4>3=num/2,stop. sum==6==num → Output: **Perfect**
 */