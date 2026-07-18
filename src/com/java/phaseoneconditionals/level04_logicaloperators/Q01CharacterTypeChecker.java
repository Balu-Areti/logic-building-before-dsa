package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q01CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any single character: ");
        char ch = sc.next().charAt(0); //Java we don't have read for character so we use to extract 1 letter usin charAt(0);

        // Checking for Letter using AND (&&) and OR (||)
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Letter");
        }
        // Checking for Digit using AND (&&)
        else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        }
        // If not a letter and not a digit
        else {
            System.out.println("Neither");
        }

        sc.close();
    }
}

/*
START
  READ ch
  IF (ch>='a' AND ch<='z') OR (ch>='A' AND ch<='Z') THEN PRINT "Letter"
  ELSE IF ch>='0' AND ch<='9' THEN PRINT "Digit"
  ELSE PRINT "Neither"
END
 */