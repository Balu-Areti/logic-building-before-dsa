package com.java.phaseoneconditionals;

import java.util.Scanner;

public class Q09VowelOrConsonant {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Character here a to z or A to Z ");
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){

            System.out.println("Vowel");
        }else {
            System.out.println("Consonant");
        }
        sc.close();
    }
}
/*
START
  READ ch (lowercase)
  IF ch=='a' OR ch=='e' OR ch=='i' OR ch=='o' OR ch=='u' THEN
      PRINT "Vowel"
  ELSE
      PRINT "Consonant"
END
 */