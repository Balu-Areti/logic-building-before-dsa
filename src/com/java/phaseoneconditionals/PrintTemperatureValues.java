package com.java.phaseoneconditionals;

import java.util.Scanner;

public class PrintTemperatureValues {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature ");
        float temp = sc.nextFloat();

        if (temp <= 15 ){
            System.out.println("cold becuase of temp is : "+ temp);
        } else if (temp <= 30 ) {
            System.out.println("warm "+ temp);

        }else {
            System.out.println("Hot");
        }
     sc.close();
    }
}
/*
START
  READ temp
  IF temp < 15 THEN PRINT "Cold"
  ELSE IF temp <= 30 THEN PRINT "Warm"
  ELSE PRINT "Hot"
END
 */