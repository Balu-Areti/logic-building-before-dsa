package com.java.phasetwowhileloop;

public class Q02NumbersReverse {
    static void main() {
        int i = 10;

        while (i >= 1){
            System.out.println(i);
            i = i-1;
        }
    }
}

/*
START
  i = 10
  WHILE i >= 1:
      PRINT i
      i = i - 1
END
Dry Run: i=10→print→i=9 ... i=1→print→i=0→0>=1 False→stop. Output: 10 9 8 7 6 5 4 3 2 1
 */