package com.java.phasetwowhileloop;

public class Q01NumbersOneToTen {
    public static void main(String[] args) {
        // 1. Initialization (Start point)
        int i = 1;

        // 2. Condition (Stop point)
        while (i <= 10) {
            System.out.println(i); // Print current value

            // 3. Updation (Move to next step i = i + 1)
            i++;
        }
    }
}

/*
START
  i = 1
  WHILE i <= 10:
      PRINT i
      i = i + 1
END
 */