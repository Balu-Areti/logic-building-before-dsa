# 🧠 logic-building-before-dsa

> A structured, phase-wise roadmap to build strong programming logic **before** starting Data Structures & Algorithms — covering conditionals, loops, recursion, arrays, and strings.

 · Merged from *"Master Your Logic Building"* + *"Logic Building with Loops"* · Organized & tracked as a personal prep repo.

---

## 📌 About

This repo merges two practice sheets into a single, non-redundant, ordered curriculum. Loops are front-loaded and covered in depth **once**, instead of twice across two separate files. Every phase builds on the one before it.

**Suggested repo name:** `logic-building-before-dsa`
**Alt names:** `pre-dsa-logic-drills` · `logic-foundations` · `dsa-readiness-kit`

---

## 🗂 Repo Structure (Industry-Standard Naming)

```
logic-building-before-dsa/
│
├── README.md
├── 01-conditionals/
├── 02-loops-while/
├── 03-loops-do-while/
├── 04-loops-for/
├── 05-loops-nested/
├── 06-loops-break-continue/
├── 07-mathematical-series/
├── 08-loops-mixed-problems/
├── 09-patterns-star-printing/
├── 10-loops-review/
├── 11-recursion/
├── 12-arrays/
├── 13-strings/
└── 14-mixed-challenges/
```

Each folder holds one file per question, numbered, e.g. `01-conditionals/01-check-positive-negative-zero.java`.

---

## 🚦 Recommended Learning Flow

| # | Phase (Folder) | Source | Topic | Questions |
|---|---|---|---|---|
| 01 | `01-conditionals` | *Master Your Logic Building* → Phase 1 | If-Else, Boolean Logic | 50 |
| 02 | `02-loops-while` | *Logic Building with Loops* → Phase 1 | While Loop | 29 |
| 03 | `03-loops-do-while` | *Logic Building with Loops* → Phase 2 | do-while Loop | 15 |
| 04 | `04-loops-for` | *Logic Building with Loops* → Phase 3 | For Loop | 21 |
| 05 | `05-loops-nested` | *Logic Building with Loops* → Phase 4 | Nested Loop Logic | 8 |
| 06 | `06-loops-break-continue` | *Logic Building with Loops* → Phase 5 | Break / Continue | 7 |
| 07 | `07-mathematical-series` | *Logic Building with Loops* → Phase 6 | Series & Progressions | 15 |
| 08 | `08-loops-mixed-problems` | *Logic Building with Loops* → Phase 7 | Mixed Loop Problems | 10 |
| 09 | `09-patterns-star-printing` | *Logic Building with Loops* → Phase 8 | Star / Number Patterns | 25 |
| 10 | `10-loops-review` | *Master Your Logic Building* → Phase 2 | Looping & Patterns (checkpoint review) | 40 |
| 11 | `11-recursion` | *Master Your Logic Building* → Phase 3 | Recursion | 40 |
| 12 | `12-arrays` | *Master Your Logic Building* → Phase 4 | Basic Arrays | 40 |
| 13 | `13-strings` | *Master Your Logic Building* → Phase 5 | Strings | 50 |
| 14 | `14-mixed-challenges` | *Master Your Logic Building* → Phase 6 | Mixed Applied Reasoning | 50 |
| | | | **Total** | **400** |

**Why this order:** Conditionals → Loops (deep, once) → Loop checkpoint review → Recursion → Arrays → Strings → Mixed. Recursion comes after loops because base-case thinking is easier once iteration is second nature. Arrays and strings follow recursion since several problems benefit from a clean recursive helper. Mixed challenges sit last as the final readiness check before DSA.

## 🛠 Workflow Used

For every problem: **1)** Pseudocode first → **2)** Translate to code (Java) → **3)** Dry-run by hand with small input (e.g. N=5) → **4)** Commit solved file and tick the checkbox.

---
---

# 01 — Conditionals
*(Master Your Logic Building → Phase 1)*
🎯 Relational operators, logical operators, nested if, multiple conditions.

### 🟢 Level 1: Simple Conditions
- [x] 1. Take a number and print whether it's positive, negative, or zero.
- [x] 2. Check if a number is even or odd.
- [x] 3. Check if a number is divisible by 5.
- [x] 4. Check if a number is divisible by both 3 and 5.
- [x] 5. Check if a given year is a leap year.
- [x] 6. Take two numbers and print the larger one.
- [x] 7. Take three numbers and print the largest.
- [x] 8. Take a temperature value and print "Cold", "Warm", or "Hot" using range conditions.
- [x] 9. Take a character and check if it's a vowel or consonant.
- [x] 10. Take a character and check whether it's uppercase, lowercase, a digit, or a special character.

### 🟡 Level 2: Nested If & Multiple Conditions
- [x] 1. Take three sides and check if they form a valid triangle.
- [x] 2. If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.
- [x] 3. Take marks (0–100) and print the corresponding grade (A/B/C/D/F).
- [x] 4. Check if one of two given numbers is a multiple of the other.
- [x] 5. Take the hour of the day (0–23) and print "Good Morning", "Good Afternoon", "Good Evening", or "Good Night".
- [x] 6. Check voting eligibility for a given age (18+).
- [x] 7. Take two numbers and determine whether both are even, both are odd, or one is even and one is odd.
- [x] 8. Take an alphabet character and check if it lies between 'a' and 'm' or 'n' and 'z'.
- [x] 9. Take a day number (1–7) and print the corresponding day name.
- [x] 10. Take a month number (1–12) and print the number of days in that month (ignore leap years).

### 🟠 Level 3: Math and Number Logic
- [x] 1. Take a 3-digit number and check if all digits are distinct.
- [x] 2. Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.
- [x] 3. Take a 4-digit number and check if the first and last digits are equal.
- [x] 4. Check whether a given integer is single-digit, double-digit, or multi-digit.
- [x] 5. Check if a number is a multiple of 7 or ends with 7.
- [x] 6. Take coordinates (x, y) and determine which quadrant the point lies in.
- [x] 7. Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.
- [x] 8. Check if a number lies within the range [100, 999].
- [x] 9. Take two angles of a triangle and compute the third angle.
- [x] 10. Check whether a number is a perfect square (without using the square root function).

### 🟢 Level 4: Logical Operators & Compound Statements
- [X] 1. Take a character and check if it is a letter, a digit, or neither.
- [x] 2. Take a number and print "Fizz" if divisible by 3, "Buzz" if divisible by 5, and "FizzBuzz" if divisible by both.
- [x] 3. Take three numbers and print the median value (neither maximum nor minimum).
- [x] 4. Take 24-hour time (hours and minutes) and print whether it is AM or PM.
- [x] 5. Take income and age, and check if eligible for tax (age > 18 and income > 5 L).
- [x] 6. Take two numbers and check if both are positive and their sum is less than 100.
- [x] 7. Take a single digit (0–9) and print its word form ("Zero" to "Nine").
- [x] 8. Take a weekday number (1–7) and determine if it is a weekday or weekend.
- [x] 9. Take electricity units consumed and calculate the bill as per slabs (using if-else).
- [x] 10. Take a password string and check basic rules (length ≥ 8 and contains at least one digit).

### 🔴 Level 5: Creative / Tricky Logical Scenarios
- [x] 1. Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.
- [x] 2. Take three numbers and check if they can form a Pythagorean triplet.
- [x] 3. Take day and month and check if it forms a valid calendar date (ignoring leap years).
- [x] 4. Take time (hours and minutes) and print the smaller angle between the hour and minute hands.
- [x] 5. Take three numbers and check if they are in arithmetic progression.
- [x] 6. Take three numbers and check if they are in geometric progression.
- [x] 7. Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.
- [x] 8. Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.
- [x] 9. Take two dates (day and month) and determine which one comes first in the calendar.
- [x] 10. Take a year and print the corresponding century (e.g., "19th century", "20th century").

---

# 02 — While Loop
*(Logic Building with Loops → Phase 1)*

- [x] 1. Print all numbers from 1 to 10 using a loop.
- [x] 2. Print numbers from 10 down to 1 in reverse order.
- [x] 3. Print all even numbers between 1 and 100.
- [x] 4. Print all odd numbers between 1 and 100.
- [x] 5. Print the multiplication table of a given number from n × 1 to n × 10.
- [x] 6. Calculate and print the sum of the first n natural numbers.
- [x] 7. Calculate the sum of all even numbers from 1 up to n.
- [x] 8. Calculate the sum of all odd numbers from 1 up to n.
- [x] 9. Calculate and print the factorial of a given number.
- [x] 10. Find and print the product of all digits of a given number.
- [x] 11. Count and print the total number of digits in a given number.
- [x] 12. Reverse the given number and print the reversed value.
- [x] 13. Check whether the given number is a palindrome.
- [ ] 14. Find and print the sum of digits of the given number.
- [ ] 15. Check whether the given number is an Armstrong number.
- [ ] 16. Check whether the given number is a Perfect number.
- [ ] 17. Print all prime numbers between 1 and 100.
- [ ] 18. Check whether the given number is a prime number.
- [ ] 19. Print the Fibonacci series up to n terms.
- [ ] 20. Find and print the sum of the Fibonacci series up to n terms.
- [ ] 21. Print the square of each number from 1 to n.
- [ ] 22. Print the cube of each number from 1 to n.
- [ ] 23. Print all numbers between a and b that are divisible by 7.
- [ ] 24. Print all factors of the given number.
- [ ] 25. Find and print the sum of all factors of the given number.
- [ ] 26. Find the HCF (Highest Common Factor) of two given numbers.
- [ ] 27. Find the LCM (Least Common Multiple) of two given numbers.
- [ ] 28. Find the smallest digit in the given number.
- [ ] 29. Find the largest digit in the given number.

---

# 03 — do-while Loop
*(Logic Building with Loops → Phase 2)*

- [ ] 1. Print all numbers from 1 to 10.
- [ ] 2. Print the multiplication table of a given number.
- [ ] 3. Keep taking numbers from the user until 0 is entered, then print the sum of all entered numbers.
- [ ] 4. Keep taking numbers from the user until 0 is entered, then print the largest number among all inputs.
- [ ] 5. Count and print the number of digits in the given number.
- [ ] 6. Reverse the given number and print the reversed value.
- [ ] 7. Check whether the given number is a palindrome.
- [ ] 8. Check whether the given number is an Armstrong number.
- [ ] 9. Calculate and print the factorial of the given number.
- [ ] 10. Print the Fibonacci series up to the required number of terms.
- [ ] 11. Find the HCF (Highest Common Factor) of the given numbers.
- [ ] 12. Create a menu-driven program that allows the user to choose and perform different operations.
- [ ] 13. Keep taking numbers from the user until a negative number is entered, then count how many positive numbers were entered.
- [ ] 14. Find and print the sum of digits of the given number.
- [ ] 15. Calculate and print the sum of even digits and the sum of odd digits of the given number separately.

---

# 04 — For Loop
*(Logic Building with Loops → Phase 3)*

- [ ] 1. Print all numbers from 1 to 10.
- [ ] 2. Print numbers from 10 down to 1 in reverse order.
- [ ] 3. Print all even numbers between 1 and 100.
- [ ] 4. Print all odd numbers between 1 and 100.
- [ ] 5. Print the multiplication table of a given number.
- [ ] 6. Calculate and print the factorial of a given number.
- [ ] 7. Calculate and print the factorial of every number from 1 to n.
- [ ] 8. Print all prime numbers between 1 and 100.
- [ ] 9. Check whether the given number is a prime number.
- [ ] 10. Print the Fibonacci series up to the required number of terms.
- [ ] 11. Find and print the sum of the Fibonacci series.
- [ ] 12. Print all factors of the given number.
- [ ] 13. Find and print the sum of all factors of the given number.
- [ ] 14. Find the HCF (Highest Common Factor) of the given numbers.
- [ ] 15. Find the LCM (Least Common Multiple) of the given numbers.
- [ ] 16. Print the square of each number from 1 to n.
- [ ] 17. Print the cube of each number from 1 to n.
- [ ] 18. Print all numbers between a and b that are divisible by 7.
- [ ] 19. Find and print the sum of the first n natural numbers.
- [ ] 20. Find and print the sum of all even numbers from 1 up to n.
- [ ] 21. Find and print the sum of all odd numbers from 1 up to n.

---

# 05 — Nested Loop Logic
*(Logic Building with Loops → Phase 4)*

- [ ] 1. Print the multiplication tables for all numbers from 1 to 10.
- [ ] 2. Print all possible pairs (i, j) where both i and j range from 1 to n.
- [ ] 3. For every number from 1 to n, count and print the total number of its factors.
- [ ] 4. Print all prime numbers up to n using nested loop checking.
- [ ] 5. Print the Fibonacci pattern row by row, where each row prints the next Fibonacci numbers.
- [ ] 6. Generate and print a number triangle pattern using nested loops.
- [ ] 7. Print a matrix, then calculate and display the sum of each row and the sum of each column.
- [ ] 8. Print all Pythagorean triplets whose values are less than or equal to n.

---

# 06 — Break / Continue Logic
*(Logic Building with Loops → Phase 5)*

- [ ] 1. Print numbers from 1 to 100, and stop the loop as soon as a number divisible by 17 is encountered.
- [ ] 2. Print numbers from 1 to 100, but skip all numbers that are divisible by 5 and continue printing the rest.
- [ ] 3. Take 5 numbers as input, skip any number that is 0 using continue, and calculate the sum of the remaining numbers.
- [ ] 4. Search for a specific number in a list of inputs, and terminate the loop immediately when the number is found.
- [ ] 5. Keep taking numbers from the user and print them until a negative number appears, then stop the loop.
- [ ] 6. Skip all odd numbers and print only the even numbers.
- [ ] 7. Continuously add numbers in a loop and stop the loop when the sum becomes greater than 100.

---

# 07 — Mathematical Series
*(Logic Building with Loops → Phase 6)*

- [ ] 1. Find and print the sum of the first n natural numbers.
- [ ] 2. Find and print the sum of the first n even numbers.
- [ ] 3. Find and print the sum of the first n odd numbers.
- [ ] 4. Print the first n terms of an arithmetic progression for the given first term and common difference.
- [ ] 5. Print the first n terms of a geometric progression for the given first term and common ratio.
- [ ] 6. Print the Fibonacci series up to the required number of terms.
- [ ] 7. Find and print the sum of the Fibonacci series up to the required number of terms.
- [ ] 8. Calculate and print the value of the series 1² + 2² + 3² + … + n².
- [ ] 9. Calculate and print the value of the series 1³ + 2³ + 3³ + … + n³.
- [ ] 10. Calculate and print the value of the series 1 + 1/2 + 1/3 + … + 1/n.
- [ ] 11. Print the series of powers of two: 1 + 2 + 4 + 8 + … + 2ⁿ.
- [ ] 12. Calculate and print the value of the series 1! + 2! + 3! + … + n!.
- [ ] 13. Calculate and print the value of the series 1 + x + x² + x³ + … + xⁿ.
- [ ] 14. Calculate and print the value of the series x − x²/2! + x³/3! − x⁴/4! + ….
- [ ] 15. Check whether the given number is a Strong number, where the number equals the sum of factorials of its digits.

---

# 08 — Mixed Logical Loop Problems
*(Logic Building with Loops → Phase 7)*

- [ ] 1. Print all numbers between 1 and 100 whose sum of digits is even.
- [ ] 2. Count total numbers between 1 & 500 that are divisible by 7 but not divisible by 5.
- [ ] 3. Print all palindrome numbers between 1 and 500.
- [ ] 4. Print all numbers from 1 to 100 whose sum of digits is a multiple of 3.
- [ ] 5. Print all numbers from 1 to n whose binary representation contains an even number of 1s.
- [ ] 6. Print a pattern where the i-th row prints the value i × i.
- [ ] 7. Find & print the sum of odd digits & the sum of even digits of the given number.
- [ ] 8. Print all Armstrong numbers between 1 and 1000.
- [ ] 9. Print all Perfect numbers between 1 and 1000.
- [ ] 10. Find the number between 1 and n that has the maximum digit sum, and print that number along with its digit sum.

---

# 09 — Star / Number Pattern Printing
*(Logic Building with Loops → Phase 8)*

- [ ] 1. Print a Single Star (*)
- [ ] 2. Print Four Stars (****)
- [ ] 3. Print n Stars on Same Line
- [ ] 4. Print Square of Stars (n x n Stars)
```
*****
*****
*****
*****
*****
```
- [ ] 5. Print an Increasing Triangle of Stars
```
*
**
***
****
*****
```
- [ ] 6. Print a Right-Aligned Triangle of Stars
```
    *
   **
  ***
 ****
*****
```
- [ ] 7. Print Stars in Even Numbers (2, 4, 6, 8, 10)
```
**
****
******
********
**********
```
- [ ] 8. Print Stars in Odd Numbers (1, 3, 5, 7, 9)
```
*
***
*****
*******
*********
```
- [ ] 9. Print a Centered Pyramid of Stars
```
    *
   ***
  *****
 *******
*********
```
- [ ] 10. Print Stars and Spaces Alternating (b = blank space)
```
bbbb*
bbb*b*
bb*b*b*
b*b*b*b*
*b*b*b*b*
```
- [ ] 11. Print Numbers in an Increasing Sequence
```
1
12
123
1234
12345
```
- [ ] 12. Print Repeated Numbers per Row
```
1
22
333
4444
55555
```
- [ ] 13. Print a right-triangle number pattern continuing the count across rows
```
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```
- [ ] 14. Print a number pattern that counts up continuously and wraps back to 0 after 9
```
1
2 3
4 5 6
7 8 9 0
1 2 3 4 5
5 7 8 9 0 1
2 3 4 5 6 7 8
```
- [ ] 15. Print a binary-style triangle pattern of 0s and 1s
```
1
0 1
0 1 0
1 0 1 0
1 0 1 0 1
```
- [ ] 16. Print an alphabet triangle pattern repeating the next set of letters per row
```
A
B C
D E F
G H I J
K L M N O
```
- [ ] 17. Print an alphabet triangle pattern repeating a single letter increasing times
```
A
B B
C C C
D D D D
E E E E E
```
- [ ] 18. Print an alphabet triangle pattern repeating the full sequence up to the row's letter
```
A
A B
A B C
A B C D
A B C D E
```
- [ ] 19. Print a centered alphabet pyramid pattern
```
    A
   BCD
  EFGHI
 JKLMNOP
QRSTUVWXY
```
- [ ] 20. Print Numbers in an Increasing Sequence (repeat)
```
1
12
123
1234
12345
```
- [ ] 21. Print a centered numeric palindrome pyramid pattern
```
    1
   121
  12321
 1234321
123454321
```
- [ ] 22. Print a diamond pattern of stars increasing then decreasing (1,2,4,5,4,3,2,1 rows as shown)
```
*
**
****
*****
****
***
**
*
```
- [ ] 23. Print a diamond pattern of stars increasing then decreasing symmetrically (1 to 5 then back to 1)
```
*
**
***
****
*****
*****
****
***
**
*
```
- [ ] 24. Print a centered diamond pattern of stars
```
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```
- [ ] 25. Print a centered numeric diamond pattern using a fixed digit and counting sequence
```
    5
   545
  54345
 5432345
543212345
```

---

# 10 — Looping & Patterns (Review Checkpoint)
*(Master Your Logic Building → Phase 2)*
🎯 This is a fast review/checkpoint — you've already covered loops in depth in Phases 02–09 above.

### 🟢 Level 1: Basic Looping
- [ ] 1. Print numbers from 1 to 10.
- [ ] 2. Print all even numbers between 1 and 100.
- [ ] 3. Print all odd numbers between 1 and 100.
- [ ] 4. Print numbers from 10 down to 1.
- [ ] 5. Print the table of a given number (n × 1 to n × 10).
- [ ] 6. Print the sum of first n natural numbers.
- [ ] 7. Print the sum of all even numbers up to n.
- [ ] 8. Print the sum of all odd numbers up to n.
- [ ] 9. Print the factorial of a given number.
- [ ] 10. Print the product of digits of a given number.

### 🟡 Level 2: Number-based Looping Logic
- [ ] 1. Count the number of digits in a given number.
- [ ] 2. Print the reverse of a given number.
- [ ] 3. Check if a number is a palindrome.
- [ ] 4. Find the sum of digits of a number.
- [ ] 5. Check if a number is an Armstrong number.
- [ ] 6. Check if a number is a perfect number.
- [ ] 7. Print all prime numbers between 1 and 100.
- [ ] 8. Check if a number is prime or not.
- [ ] 9. Print Fibonacci series up to n terms.
- [ ] 10. Print sum of first n terms of Fibonacci series.

### 🟠 Level 3: Mathematical & Logical Patterns
- [ ] 1. Print the squares of numbers from 1 to n.
- [ ] 2. Print cubes of numbers from 1 to n.
- [ ] 3. Print all numbers between a and b divisible by 7.
- [ ] 4. Find HCF (GCD) of two numbers using loops.
- [ ] 5. Find LCM of two numbers using loops.
- [ ] 6. Print all factors of a given number.
- [ ] 7. Find the sum of all factors of a number.
- [ ] 8. Check if a number is a strong number (sum of factorials of digits = number).
- [ ] 9. Print first n terms of an arithmetic progression (a, d).
- [ ] 10. Print first n terms of a geometric progression (a, r).

### 🔵 Level 4: Pattern Printing (Stars & Numbers)
- [ ] Already covered in **09 — Star / Number Pattern Printing** above.

### 🔴 Level 5: Logical Loop Combinations
- [ ] 1. Print all numbers whose sum of digits is even (1–100).
- [ ] 2. Count how many numbers between 1–500 are divisible by 7 but not by 5.
- [ ] 3. Print all numbers that are palindromes between 1–500.
- [ ] 4. Print numbers between 1–100 whose digits add up to a multiple of 3.
- [ ] 5. Find the smallest and largest digit in a given number.
- [ ] 6. Print all numbers from 1–n whose binary representation has an even number of 1s.
- [ ] 7. Print a pattern where each row i prints i*i.
- [ ] 8. Print factorial of each number from 1 to n.
- [ ] 9. Print the sum of all odd digits and even digits separately in a number.
- [ ] 10. Take 5 numbers as input. If the user enters 0, skip it using continue. At the end, print the sum of all non-zero numbers entered.

---

# 11 — Recursion
*(Master Your Logic Building → Phase 3)*
🎯 Recursive definition, base cases, call stack tracing.

### 🟢 Level 1: Foundation of Recursion
- [ ] 1. Print numbers from 1 to n using recursion.
- [ ] 2. Print numbers from n down to 1 using recursion.
- [ ] 3. Print only even numbers from 1 to n recursively.
- [ ] 4. Print only odd numbers from 1 to n recursively.
- [ ] 5. Print sum of first n natural numbers recursively.
- [ ] 6. Print factorial of a number recursively.
- [ ] 7. Calculate power of a number (xⁿ) using recursion.
- [ ] 8. Find nth Fibonacci number recursively.
- [ ] 9. Print Fibonacci series up to n terms recursively.
- [ ] 10. Find sum of digits of a number recursively.

### 🟡 Level 2: Number-based Recursive Thinking
- [ ] 1. Count the number of digits in a number recursively.
- [ ] 2. Reverse a number recursively.
- [ ] 3. Check if a number is a palindrome using recursion.
- [ ] 4. Find product of digits of a number recursively.
- [ ] 5. Find GCD (HCF) of two numbers using Euclid's algorithm recursively.
- [ ] 6. Convert a number to binary recursively.
- [ ] 7. Print digits of a number in words recursively (e.g., 123 → "one two three").
- [ ] 8. Calculate the sum of first n even numbers recursively.
- [ ] 9. Calculate the sum of first n odd numbers recursively.
- [ ] 10. Find nCr (Combination formula) recursively using Pascal's relation.

### 🟠 Level 3: Pattern & Printing Problems
- [ ] 1. Print a line of n stars recursively.
- [ ] 2. Print a square of stars recursively (n×n).
- [ ] 3. Print a triangle of stars recursively (top-down).
- [ ] 4. Print a triangle of stars recursively (bottom-up).
- [ ] 5. Print pattern of numbers recursively (1 to n each row).
- [ ] 6. Print reverse triangle pattern recursively.
- [ ] 7. Print multiplication table of n recursively.
- [ ] 8. Print numbers in increasing and decreasing order in same function.
- [ ] 9. Print sum of series 1 + 2 + 3 + ... + n recursively and display each step.
- [ ] 10. Print pattern of characters (A, AB, ABC, ...) recursively.

### 🔵 Level 4: String-based Recursion
- [ ] 1. Reverse a string using recursion.
- [ ] 2. Check if a string is palindrome using recursion.
- [ ] 3. Count vowels in a string recursively.
- [ ] 4. Remove all spaces from a string recursively.
- [ ] 5. Replace all occurrences of a character (say 'a' → 'x') recursively.
- [ ] 6. Remove all occurrences of a character from a string recursively.
- [ ] 7. Print all characters of a string one by one recursively.
- [ ] 8. Print the string in reverse order recursively (without using loops).
- [ ] 9. Convert a string to uppercase recursively.
- [ ] 10. Count consonants and vowels separately using recursion.

---

# 12 — Basic Arrays
*(Master Your Logic Building → Phase 4)*
🎯 Traversal, frequency, simple manipulation, aggregations.

### 🟢 Level 1: Fundamentals of Arrays
- [ ] 1. Input n and take n integers into an array; print them.
- [ ] 2. Find the sum of all elements in an array.
- [ ] 3. Find the average of array elements.
- [ ] 4. Find the maximum element in an array.
- [ ] 5. Find the minimum element in an array.
- [ ] 6. Count how many elements are positive, negative, or zero.
- [ ] 7. Count how many elements are even and odd.
- [ ] 8. Find the index of the maximum element.
- [ ] 9. Find the index of the minimum element.
- [ ] 10. Take n elements and print only those greater than a given value k.

### 🟡 Level 2: Searching & Counting Logic
- [ ] 1. Input an element x — check if it exists in the array.
- [ ] 2. Count how many times a given element appears.
- [ ] 3. Find the first occurrence of a given number.
- [ ] 4. Find the last occurrence of a given number.
- [ ] 5. Check if all elements in an array are unique.
- [ ] 6. Find the sum of even elements only.
- [ ] 7. Find the sum of odd elements only.
- [ ] 8. Find the count of prime numbers in the array.
- [ ] 9. Count how many numbers are divisible by 3 and 5 both.
- [ ] 10. Count how many elements are perfect squares.

### 🟠 Level 3: Transformation & Manipulation
- [ ] 1. Create a new array containing squares of all numbers.
- [ ] 2. Create a new array containing only even elements.
- [ ] 3. Replace every negative number with 0.
- [ ] 4. Replace all even numbers with 1 and all odd with 0.
- [ ] 5. Swap the first and last elements of the array.
- [ ] 6. Reverse an array (without using built-in reverse).
- [ ] 7. Rotate an array by one position to the left.
- [ ] 8. Rotate an array by one position to the right.
- [ ] 9. Swap alternate elements (1st ↔ 2nd, 3rd ↔ 4th, etc.).
- [ ] 10. Copy one array to another manually.

### 🔵 Level 4: Aggregate & Comparative Thinking
- [ ] 1. Compare two arrays — check if they are equal (same elements & order).
- [ ] 2. Compare two arrays — check if they contain the same elements (ignore order).
- [ ] 3. Merge two arrays into a third array.
- [ ] 4. Find the common elements between two arrays.
- [ ] 5. Find elements that are in one array but not in the other.
- [ ] 6. Count how many elements are common between two arrays.
- [ ] 7. Find element-wise sum of two arrays (A[i] + B[i]).
- [ ] 8. Find element-wise product of two arrays.
- [ ] 9. Create a frequency array of numbers (count occurrence of each number).
- [ ] 10. Print all elements that appear more than once.

### 🔴 Level 5: Logical & Applied Array Problems
- [ ] 1. Check if the array is sorted in ascending order.
- [ ] 2. Check if the array is sorted in descending order.
- [ ] 3. Find the second largest element in an array.
- [ ] 4. Find the second smallest element in an array.
- [ ] 5. Find the difference between the largest and smallest element.
- [ ] 6. Find the sum of all elements except the largest and smallest.
- [ ] 7. Count how many pairs of elements have a sum equal to a given number k.
- [ ] 8. Count how many elements are greater than the average of the array.
- [ ] 9. Print the frequency of each distinct element.
- [ ] 10. Print all unique elements (those that occur exactly once).

---

# 13 — Strings
*(Master Your Logic Building → Phase 5)*

### Category 1: Basic String Handling
- [ ] 1. Take a string input and print its length.
- [ ] 2. Print the first and last character of a string.
- [ ] 3. Convert all characters of a string to uppercase.
- [ ] 4. Convert all characters of a string to lowercase.
- [ ] 5. Count how many characters (excluding spaces) are in the string.
- [ ] 6. Count how many words are in a sentence.
- [ ] 7. Take two strings and print them concatenated.
- [ ] 8. Compare two strings lexicographically (like dictionary order).
- [ ] 9. Print the ASCII value of each character in a string.
- [ ] 10. Check whether the string is empty or not.

### Category 2: Counting & Character Analysis
- [ ] 1. Count how many vowels and consonants are in a string.
- [ ] 2. Count the number of digits, letters, and special characters in a string.
- [ ] 3. Count how many uppercase and lowercase letters a string has.
- [ ] 4. Find the frequency of each character in a string (without using a map).
- [ ] 5. Count how many spaces are there in a sentence.
- [ ] 6. Count how many times a given character appears in a string.
- [ ] 7. Count how many alphabets are before 'm' and after 'm' in a given string.
- [ ] 8. Count how many substrings start and end with the same character (simple logic).
- [ ] 9. Print how many words start with a vowel in a sentence.
- [ ] 10. Count how many words end with 's'.

### Category 3: Reversing & Palindromic Thinking
- [ ] 1. Reverse a string without using built-in reverse.
- [ ] 2. Reverse each word in a sentence.
- [ ] 3. Reverse the order of words in a sentence.
- [ ] 4. Check whether a string is a palindrome.
- [ ] 5. Check if two strings are the reverse of each other.
- [ ] 6. Print the middle character(s) of a string.
- [ ] 7. Print the second half of the string in reverse.
- [ ] 8. Remove the first and last character and print the remaining string.
- [ ] 9. Reverse only characters, keeping digits in place.
- [ ] 10. Reverse string but skip spaces.

### Category 4: Character & Word Manipulation
- [ ] 1. Remove all vowels from a string.
- [ ] 2. Remove all spaces from a string.
- [ ] 3. Replace all vowels with '*'.
- [ ] 4. Replace all spaces with '_'.
- [ ] 5. Print the string after removing all digits.
- [ ] 6. Remove duplicate characters from a string.
- [ ] 7. Keep only the first occurrence of each character.
- [ ] 8. Remove consecutive duplicate characters (e.g., "aaabb" → "ab").
- [ ] 9. Swap case: uppercase → lowercase and lowercase → uppercase.
- [ ] 10. Shift each character by 1 (e.g., "abc" → "bcd").

### Category 5: Word-level Thinking
- [ ] 1. Print each word of a sentence on a new line.
- [ ] 2. Count how many words have even length.
- [ ] 3. Find the longest word in a sentence.
- [ ] 4. Find the shortest word in a sentence.
- [ ] 5. Swap first and last words in a sentence.
- [ ] 6. Print all words that start and end with the same letter.
- [ ] 7. Count how many words contain the letter 'a'.
- [ ] 8. Capitalize the first letter of each word.
- [ ] 9. Print the sentence in title case (first letter capital, rest lowercase).
- [ ] 10. Remove extra spaces between words (normalize spacing).

---

# 14 — Mixed Logical Challenges
*(Master Your Logic Building → Phase 6)*
🎯 Char array logic, string length, substring, conditions — final readiness check before DSA.

### Category 1: Number-Based Logical Combinations
- [ ] 1. Print all numbers between 1 and N that are divisible by both 3 and 5.
- [ ] 2. Find the sum of digits of a number (use loop).
- [ ] 3. Check if a number is an Armstrong number.
- [ ] 4. Print all Armstrong numbers between 1 and 1000.
- [ ] 5. Find the factorial of a number using recursion.
- [ ] 6. Count how many even digits a number contains.
- [ ] 7. Print all prime numbers between 1 and N.
- [ ] 8. Print the reverse of a number (123 → 321).
- [ ] 9. Check if a number is palindrome (121 → true).
- [ ] 10. Check if a number is perfect (sum of factors equals number).

### Category 2: String + Logic Mix
- [ ] 1. Check if two strings are anagrams (without using collections).
- [ ] 2. Count vowels in each word of a sentence.
- [ ] 3. Reverse words in a string if their length is even.
- [ ] 4. Replace every vowel in a string with its position (a=1, e=2...).
- [ ] 5. Print characters that appear more than once (without map).
- [ ] 6. Count words that start and end with the same letter.
- [ ] 7. Toggle case for every alternate word in a sentence.
- [ ] 8. Check if two strings are rotations of each other.
- [ ] 9. Find the word with maximum vowels in a sentence.
- [ ] 10. Remove duplicate words from a sentence.

### Category 3: Array + Looping Logic
- [ ] 1. Find the maximum and minimum element in an array.
- [ ] 2. Count how many positive, negative, and zero elements are in an array.
- [ ] 3. Print all unique elements from an array.
- [ ] 4. Reverse an array in-place.
- [ ] 5. Shift all zeros to the end of the array.
- [ ] 6. Count how many elements are even at an even index.
- [ ] 7. Merge two arrays into one.
- [ ] 8. Find the second largest element in an array.
- [ ] 9. Rotate an array by one position to the right.
- [ ] 10. Find the sum of all elements at odd indices.

### Category 4: Nested Logic & Pattern Flow
- [ ] 1. Print a multiplication table in a formatted grid (10x10).
- [ ] 2. Print all pairs in an array whose sum equals a given number.
- [ ] 3. Print all subarrays of a given array.
- [ ] 4. Check if an array is sorted (ascending or descending).
- [ ] 5. Count how many times a number appears consecutively in an array.
- [ ] 6. Find all pairs of characters in a string that are the same (nested loop).
- [ ] 7. Print pattern of increasing characters (A, AB, ABC...).
- [ ] 8. Print Pascal's triangle up to N rows.
- [ ] 9. Generate Fibonacci series up to N using recursion.
- [ ] 10. Print numbers in a spiral-like pattern (conceptual dry run).

### Category 5: Applied Reasoning & Real-Life Logic
- [ ] 1. Given marks of students, find how many passed (>= 40).
- [ ] 2. Take age inputs and count how many are adults, minors, seniors.
- [ ] 3. Validate a password (at least one uppercase, lowercase, digit, special char).
- [ ] 4. Simulate a simple calculator using switch-case.
- [ ] 5. Count how many times a coin lands on heads/tails (use random).
- [ ] 6. Print frequency of each digit in a number.
- [ ] 7. Find common elements between two arrays.
- [ ] 8. Print characters that are common in two strings.
- [ ] 9. Count how many prime numbers are there in an array.
- [ ] 10. Print all palindromic words from a sentence.

---

