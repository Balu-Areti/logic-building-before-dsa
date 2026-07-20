package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q10PasswordValidatorPro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.next();

        // 1. hasDigit = False
        boolean hasDigit = false;

        // 2. FOR each ch in password
        // (password.toCharArray()
        for (char ch : password.toCharArray()) {

            // 3. IF ch is digit THEN hasDigit = True
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
                break; // Okka digit got enough,(Saves time)
            }
        }

        // 4. IF LENGTH(password) >= 8 AND hasDigit == True THEN
        if (password.length() >= 8 && hasDigit == true) {
            System.out.println("Valid password");
        }
        // 5. ELSE
        else {
            System.out.println("Invalid password");
        }

        sc.close();
    }
}