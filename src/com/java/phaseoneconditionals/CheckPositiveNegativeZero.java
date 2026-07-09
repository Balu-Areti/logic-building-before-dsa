package com.java.phaseoneconditionals;

import java.util.Scanner;

public class CheckPositiveNegativeZero {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("===check postive or negative or zero===");
        System.out.println("Enter number: ");

        int n = sc.nextInt();
        if(n>0){
            System.out.println("Postive Number: " + n);
        } else if (n<0) {
            System.out.println("Nrgative number :"+ n);

        }else System.out.println("zero");
        sc.close();
    }
}

/*
START
READ N

IF N % 2 == 0 THEN
  PRINT "Even"
ELSE
  PRINT "Odd"
END IF
END
 */