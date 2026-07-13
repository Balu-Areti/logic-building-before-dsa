package com.java.phaseoneconditionals.level03_mathandnumberlogic;

import java.util.Scanner;

public class Q06QuadrantFinder {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
    }
}
/*
### Q6. Take coordinates (x, y) and determine which quadrant.
**Why nested if with sign checks:** Quadrant defined by signs of x and y.
START
  READ x, y
  IF x==0 AND y==0 THEN PRINT "Origin"
  ELSE IF x>0 AND y>0 THEN PRINT "Quadrant I"
  ELSE IF x<0 AND y>0 THEN PRINT "Quadrant II"
  ELSE IF x<0 AND y<0 THEN PRINT "Quadrant III"
  ELSE IF x>0 AND y<0 THEN PRINT "Quadrant IV"
  ELSE PRINT "On an axis"
END
**Dry Run** (x=-3,y=4): not origin, not QI, x<0 AND y>0 True → Output: **Quadrant II**
 */