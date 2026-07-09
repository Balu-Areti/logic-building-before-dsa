package com.java.phaseoneconditionals;

import java.util.Scanner;

public class FindLargestNumberThree {
    static void main() {
    Scanner sc = new Scanner(System.in);

    System.out.println("enter First(1) number : ");
    int number1 = sc.nextInt();

    System.out.println("enter First(2) number : ");
    int number2 = sc.nextInt();

    System.out.println("enter First number : ");
    int number3 = sc.nextInt();

    if (number1>=number2 && number1>= number3){
        System.out.println(number1);
    } else if (number2>=number1 && number2 >= number3) {
        System.out.println(number2);
        
    }else {
        System.out.println(number3);
    }

    }
}

/*
START
  READ a, b, c
  IF a >= b AND a >= c THEN PRINT a
  ELSE IF b >= a AND b >= c THEN PRINT b
  ELSE PRINT c
END
 */
