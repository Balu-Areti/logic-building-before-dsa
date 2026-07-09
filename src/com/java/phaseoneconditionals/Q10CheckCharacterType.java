package com.java.phaseoneconditionals;

import java.util.Scanner;

public class Q10CheckCharacterType {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any Character ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else if (ch >= '0' && ch <='9') {
            System.out.println("Digit");
        }else {
            System.out.println("Special Character");
        }

    }
}
/*
START
  READ ch
  IF ch >= 'A' AND ch <= 'Z' THEN PRINT "Uppercase"
  ELSE IF ch >= 'a' AND ch <= 'z' THEN PRINT "Lowercase"
  ELSE IF ch >= '0' AND ch <= '9' THEN PRINT "Digit"
  ELSE PRINT "Special character"
END
 */