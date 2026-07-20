package com.java.phaseoneconditionals.level04_logicaloperators;

import java.util.Scanner;

public class Q09ElectricityBillCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Total Units consumed : ");
        int units = sc.nextInt();
        double bill = 0;

        if (units < 0){
            System.out.println("Invalid input! Units cannot be negative.");
        } else if (units <=50) {
            bill = units * 3.0; // ₹3 for up to 50 units
            
        } else if (units <= 100) {
            bill = (50 * 3.0) + ((units- 50)*4.5);
        } else if (units <= 200) {
            bill = (50 * 3.0) + 100 * 4.5 + ((units - 100)* 6.0);
            
        }else { // Above 200 units
            // First 50 @ ₹3 + Next 50 @ ₹4.5 + Next 100 @ ₹6 + remaining units @ ₹8
            bill = (50 * 3.0) + (50 * 4.5) + (100 * 6.0) + ((units - 200) * 8.0);
        }

        if (units >= 0) {
            System.out.println("Total Electricity Bill: ₹" + bill);
        }

    }
}
/*
START
  READ units
  IF units <= 100 THEN bill = units * 5
  ELSE IF units <= 300 THEN bill = 100*5 + (units-100)*7
  ELSE bill = 100*5 + 200*7 + (units-300)*10
  PRINT bill
END
 */