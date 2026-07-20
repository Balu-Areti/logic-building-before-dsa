package com.java.phasetwowhileloop;

public class Q03EvenNumbers {
    static void main() {
        int i = 2;

        while (i <= 100){
            System.out.println(i);
            i = i + 2;
        }

    }
}
/*
START
  i = 2
  WHILE i <= 100:
      PRINT i
      i = i + 2
END
Dry Run: i=2→print→i=4→print→i=6... up to i=100→print→i=102→stop. Output: 2 4 6 ... 100
 */