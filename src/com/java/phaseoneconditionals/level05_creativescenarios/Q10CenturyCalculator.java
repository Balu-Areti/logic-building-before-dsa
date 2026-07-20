package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q10CenturyCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year I will Give you which Century you are now  ");
        int year = sc.nextInt();

        int century = (year -1 )/ 100 + 1;
        String suffix;

        // 2. English grammar rules for ordinal numbers using modulo (% 10)
        if (century % 10 == 1 && century != 11) {
            suffix = "st";
        }
        else if (century % 10 == 2 && century != 12) {
            suffix = "nd";
        }
        else if (century % 10 == 3 && century != 13) {
            suffix = "rd";
        }
        else {
            // other numbers ki (0, 4, 5, 6, 7, 8, 9, and exceptions 11, 12, 13)
            suffix = "th";
        }


        System.out.println(century + suffix + " century");
            

    }
}

/*
Why math + if for suffix: Century = (year-1)/100 + 1, suffix depends on last digit of century number.

START
  READ year
  century = (year - 1) / 100 + 1
  IF century MOD 10 == 1 AND century != 11 THEN suffix = "st"
  ELSE IF century MOD 10 == 2 AND century != 12 THEN suffix = "nd"
  ELSE IF century MOD 10 == 3 AND century != 13 THEN suffix = "rd"
  ELSE suffix = "th"
  PRINT century + suffix + " century"
END
Dry Run (year=1999): century=(1999-1)/100+1 = 19+1=20 → 20 MOD 10=0
→ falls to else → suffix="th" → Output: 20th century


 */