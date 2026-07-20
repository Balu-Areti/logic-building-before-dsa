package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q08SumVsProductDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-9999): ");
        int num = sc.nextInt();
        int sum = 0;
        int product = 1;

        // Loop runs as long as num is greater than 0
        while (num > 0){
            int digit = num % 10;       // Extract last digit  3     second round 12 % 10 ➔ 2     Third round 1
            sum += digit;               // Accumulate sum     0+3                 3+2= 5                1+5 =6
            product = product * digit;  // Accumulate product 1*3 = 3              3*2=6                1*6 = 6
            num /= 10;                  // Remove last digit  12                   12/10 = 1             1/10 = 0 end
        }
        if (sum > product) {
            System.out.println("Sum is greater");
        } else {
            System.out.println("Product is greater or equal");
        }

    }
}

/*
Q8. Take integer (1–9999), check if sum of digits > product of digits.
Why loop + accumulator: Need to process each digit, accumulate sum AND product.

START
  READ num
  sum = 0
  product = 1
  WHILE num > 0:
     SET digit = num MOD 10
      sum = sum + digit
      product = product * digit
      num = num / 10
  IF sum > product THEN PRINT "Sum greater" ELSE PRINT "Product greater or equal"
END
Dry Run (num=123): digit=3,sum=3,product=3,num=12 → digit=2,sum=5,product=6,num=1
→ digit=1,sum=6,product=6,num=0(stop) → 6>6? No → Output: Product greater or equal
 */