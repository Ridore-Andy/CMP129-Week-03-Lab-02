CMP 129 – Computer Science II
Week 3 – Lab 2: Method Overloading
Learning Objectives

After completing this lab, students should be able to:

Explain method overloading.
Create methods with the same name but different parameter lists.
Use different parameter types and numbers of parameters.
Create an object and call its instance methods.
Test overloaded methods in a separate test class.
Calculator Class

Create a Java class named Calculator in:

Calculator.java

Implement these four overloaded add methods:

public int add(int a, int b)

Returns the sum of two integers.

public double add(double a, double b)

Returns the sum of two double values.

public int add(int a, int b, int c)

Returns the sum of three integers.

public String add(String a, String b)

Concatenates and returns two strings.

All four methods must have the same name, add, but different parameter lists.

CalculatorTest Class

Create a separate class named CalculatorTest in:

CalculatorTest.java

In its main method:

Create a Calculator object.
Call each overloaded add method.
Use different test values for every method.
Store or print the returned results.
Add clear labels showing which version is being tested.

Example output format:

Sum of two integers: 15
Sum of two doubles: 13.25
Sum of three integers: 30
Concatenated strings: Hello World

Students may use different test values.

General Requirements
Place each public class in a separate Java file.
Do not place main() inside the Calculator class.
Use the exact method signatures provided.
Each method must return its result.
Do not perform the calculations directly inside CalculatorTest.
Follow standard Java naming and formatting conventions.
Include comments explaining the class, overloaded methods, and important test statements.
Test all four overloaded methods.
Ensure the program compiles and runs without errors.
Follow the course AI-use policy.
Record any AI assistance in AI-Use-Report.md.
Required Organization
Week-03
└── Lab-02
    ├── CMP129-Week-03-Lab-02.docx
    ├── AI-Use-Report.md
    └── src
        ├── Calculator.java
        └── CalculatorTest.java

The two Java files can initially contain only this starter comment:

/*
 * Student Name:
 * Course: CMP 129
 * Week: 3
 * Lab: 2
 * Assignment: Calculator Method Overloading
 * Date:
 */
Submission

Students must push these files:

Lab-02/src/Calculator.java
Lab-02/src/CalculatorTest.java
Lab-02/AI-Use-Report.md

A suitable commit message is:

Complete Calculator method overloading lab
