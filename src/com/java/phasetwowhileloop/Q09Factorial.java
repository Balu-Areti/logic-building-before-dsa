package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q09Factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;

        while ( i <= n){
            fact = fact * i;
            i = i + 1;
        }
        System.out.println(fact);

    }
}

/*
### Q9. Calculate and print the factorial of a given number.
**Why while + multiplicative accumulator:** Product builds up across a known range.
```
START
  READ n
  i = 1
  fact = 1
  WHILE i <= n:
      fact = fact * i
      i = i + 1
  PRINT fact
END
```
**Dry Run** (n=4): i=1,fact=1  →i=2,fact=2  →i=3,fact=6→  i=4,fact=24 →i=5,stop. Output: **24**
Starting: fact = 1
i = 1: fact = 1 * 1 ➔ 1

i = 2: fact = 1 * 2 ➔ 2

i = 3: fact = 2 * 3 ➔ 6

i = 4: fact = 6 * 4 ➔ 24 (Final Answer!)
 */