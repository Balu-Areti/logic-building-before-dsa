package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q02FizzBuzz {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter nay number : ");
        int num = sc.nextInt();

        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0) {
            System.out.println("fizz");

        }else if (num % 5 == 0){
            System.out.println("Buzz");
        }else {
            System.out.println(num);
        }

        sc.close();
    }
}


/*
```
START
  READ num
  IF num MOD 15 == 0 THEN PRINT "FizzBuzz"
  ELSE IF num MOD 3 == 0 THEN PRINT "Fizz"
  ELSE IF num MOD 5 == 0 THEN PRINT "Buzz"
  ELSE PRINT num
END
 */