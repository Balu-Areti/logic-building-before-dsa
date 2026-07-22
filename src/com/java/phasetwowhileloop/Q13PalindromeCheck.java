package com.java.phasetwowhileloop;

import java.util.Scanner;

public class Q13PalindromeCheck {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        int number = sc.nextInt();
        int original = number; //IMPORTANT: number save originsl num
        int rev = 0;

        while (number > 0){
            int digit = number % 10;
            rev = (rev * 10) + digit;
            number = number / 10;
        }
        if (rev == original){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
        sc.close();


    }

}
//==== Reverse Number and Palindrome same code in last we just check rev == original .======
/*
1. Swiggy / Zomato "Easter Egg" Promo Codes

Sometimes, food delivery and e-commerce apps offer secret rewards.
If a user's Account ID or Order ID is a Palindrome (e.g., 50505),
the backend detects it and triggers a special reward. The app may show a popup like:
"Congratulations! You got a lucky symmetric order! Here is a 10% cashback!"
This is used to increase customer engagement and make the app experience more fun.
 */