[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/GnbY2yDH)
# Week 1: Java Basics Homework (C/C++ to Java)

## Objective

This homework helps you transition from C/C++ to Java by implementing familiar programming tasks using Java syntax, rules, and object-oriented concepts.

You will complete several small tasks by writing Java code that passes provided unit tests.

## What You Will Practice
- Java syntax and conventions
- Static methods and classes
- Java arrays and strings
- Basic object-oriented programming
- Writing code that passes automated tests (TDD style)
- Using Maven to run tests

## Project Structure
```
./
├── pom.xml
├── README.md
└── src
   ├── main
   │   └── java
   │       └── w1
   │          ├── basic
   │          │   ├── ArrayUtils.java
   │          │   ├── MathUtils.java
   │          │   ├── Person.java
   │          │   └── StringUtils.java
   │          └── Main.java
   │   
   └── test
       └── java
           └── w1
              └── basic
                   ├── ArrayUtilsTest.java
                   ├── MathUtilsTest.java
                   ├── PersonTest.java
                   └── StringUtilsTest.java

```

## Important Rules

- Do NOT modify any files in `src/test/java`
- Do NOT change package names
- Do NOT rename classes or methods
- Only edit files in `src/main/java`
- Follow the method signatures exactly as provided

If a test fails, fix your implementation, not the test.

## Tasks to Complete
### Task 1: Math Utilities

- **File to edit**: [MathUtils.java](src/main/java/w1/basic/MathUtils.java)

- **Implement the following methods**:

    - `add(int a, int b) `– return the sum of two integers
    - `max(int a, int b)` – return the larger value
    - `isEven(int n)` – return true if the number is even
    - `factorial(int a)` - return the factorial of the input number


### Task 2: String Utilities

- **File to edit**: [StringUtils.java](src/main/java/w1/basic/StringUtils.java)
- **Implement the following methods**:

    - `length(String s)` – return the length of the string
    - `toUpper(String s)` – return the uppercase version of the string
    - `reverse(String s)` – return the reverse version of the string
    - `wordCount(String s)` - return how many word in the string


### Task 3: Array Utilities

- **File to edit**: [ArrayUtils.java](src/main/java/w1/basic/ArrayUtils.java)
- **Implement the following methods**:

    - `sum(int[] a)` – return the sum of all elements
    - `max(int[] a)` – return the largest element
    - `sort(int[] a)` – return a new array sorted in ascending order

### Task 4: Object-Oriented Programming

- **File to edit**: [Person.java](src/main/java/w1/basic/Person.java)
- **Implement the Person class with**:

    - A constructor Person(String name, int age)
    - Getter methods:
        - `getName()`
        - `getAge()`
        - `isAdult()` – return true if age ≥ 18

## How to Run the Tests

Make sure you are in the project root directory, then run:

```bash
mvn test
```

**Expected Output**:
- **All tests pass** → your solution is correct
- **Test failures** → read the error message and fix your code

You may run the tests as many times as needed.

## When You Are Done
- Make sure all tests pass
- Push your code to the provided repository
- Submit your generated repository URL in Microsoft Team

## Happy Coding!