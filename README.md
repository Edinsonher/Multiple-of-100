
# Multiple of 100 Evaluator

## Description
This repository contains a simple, lightweight Java console application designed to determine whether a given integer is a multiple of 100. It fulfills the assignment requirements for the Programming Fundamentals course.

## Features
- Interactive command-line interface (CLI).
- Efficient evaluation using the Java `Scanner` utility.
- Instant feedback on the console output.

## How the Logic Works
The application reads an integer input provided by the user. It then evaluates the mathematical condition using the modulo operator (`%`):
```java
if (number % 100 == 0) { ... }
```
- If the remainder of the division by 100 equals **0**, the number is classified as a multiple of 100.
- Otherwise, the program safely confirms that it is not a multiple.

## How to Run the Program
1. Make sure you have the Java Development Kit (JDK) installed on your system.
2. Compile the source file using the terminal:
   ```bash
   javac Main.java
   ```
3. Run the compiled bytecode:
   ```bash
   java Main
   ```

## Author
- **Edinsonher** - University Student (Programming Fundamentals)
