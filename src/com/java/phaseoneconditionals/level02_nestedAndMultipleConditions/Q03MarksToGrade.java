package com.java.phaseoneconditionals.level02_nestedAndMultipleConditions;

import java.util.Scanner;

public class Q03MarksToGrade {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student marks (0 - 100): ");
        int marks = sc.nextInt();

        if (marks >= 90){
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }
}


/*
START
  READ marks
  IF marks >= 90 THEN PRINT "A"
  ELSE IF marks >= 75 THEN PRINT "B"
  ELSE IF marks >= 60 THEN PRINT "C"
  ELSE IF marks >= 40 THEN PRINT "D"
  ELSE PRINT "F"
END
 */









