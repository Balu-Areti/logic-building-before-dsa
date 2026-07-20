package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q05MultiplicationTable {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to multiple");
        int n = sc.nextInt();
        int i = 1;

        while (i <= 10){
            System.out.println(n + "*"+ i + " = "+ (n*i));
            i = i+1;
        }

    }
}

/*
Why while: Fixed count (1 to 10) tracked with a counter.

START
  READ n
  i = 1
  WHILE i <= 10:
PRINT n + " x " + i + " = " + (n*i)
      i = i + 1
END
Dry Run (n=3): i=1→"3 x 1 = 3"→i=2→"3 x 2 = 6"...→i=10→"3 x 10 = 30"→i=11→stop.
 */