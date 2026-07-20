package com.java.phasetwowhileloop;

public class Q04OddNumbers {
    static void main() {
        int i = 1;

        while (i <= 100) {
            System.out.println(i);
            i = i + 2;  //3 5 7
        }
    }
}

/*
START
  i = 1
  WHILE i <= 100:
      PRINT i
      i = i + 2
END
Dry Run: i=1 print > i=3→print..99
 */