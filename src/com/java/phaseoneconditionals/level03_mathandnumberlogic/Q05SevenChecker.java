package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q05SevenChecker {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number : ");
        int num = sc.nextInt();
       int lastDigit = num % 10;

        if ((num % 7 == 0) ||(lastDigit == 7)){
            System.out.println("you entered num is a multiple of 7 or ends with 7");
        }else {
            System.out.println("No");
        }
    }
}

//Check if a number is a multiple of 7 or ends with 7.
/*

```
**Dry Run** (num=27): 27 MOD 7=6(F), lastDigit=7(T) → F OR T = True → Output: **Condition met**

START
  READ num
  lastDigit = num MOD 10
  IF (num MOD 7 == 0) OR (lastDigit == 7) THEN
      PRINT "Condition met"
  ELSE
      PRINT "No"
END
 */