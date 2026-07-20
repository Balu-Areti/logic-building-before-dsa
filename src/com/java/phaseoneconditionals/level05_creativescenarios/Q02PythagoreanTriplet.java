package com.java.phaseoneconditionals.level05_creativescenarios;

import java.util.Scanner;

public class Q02PythagoreanTriplet {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean isTriplet = (a * a == b*b + c * c) ||
                (b * b == a * a + c * c) ||
                (c * c == a * a + b * b);


        if(isTriplet ){
            System.out.println(a + ", " + b + ", " + c + " form a Pythagorean Triplet!");
        } else {
            System.out.println(a + ", " + b + ", " + c + " do NOT form a Pythagorean Triplet.");
        }
    }
}

/*

Pythagorean: This is a rule discovered by a great mathematician named Pythagoras.
In a right-angled triangle (L-shape), the square of the longest side (the hypotenuse)
is exactly equal to the sum of the squares of the other two sides (h^2 = a^2 + b^2) = a*a = b *b etc.

START
  READ a, b, c
  find largest among a,b,c → call it 'h', other two 'p','q'
  IF h*h == p*p + q*q THEN PRINT "Pythagorean triplet"
  ELSE PRINT "Not a triplet"
END
 */