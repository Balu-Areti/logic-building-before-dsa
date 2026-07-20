package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q06SumOfNaturalNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int sum = 0;

        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
}

/*
START
  READ n
  i = 1
  sum = 0
  WHILE i <= n:
      sum = sum + i
      i = i + 1
  PRINT sum
END
Dry Run (n=5): i=1,sum=1→i=2,sum=3→i=3,sum=6→i=4,sum=10→i=5,sum=15→i=6,stop. Output: 15
 */