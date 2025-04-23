## Associate Java Test Solutions


This repository contains Java solutions for the Associate Java Test, organized in two main folders: src/ and test/. The src/ folder includes individual class files with the names of the files as the function they perform according to the problem, each solving a specific problem. The test/ folder contains corresponding JUnit 5 test files to validate each solution.

All files follow a clean and modular structure, with separate classes for logic and testing. Each problem is implemented in its own file to ensure clarity and ease of evaluation. Tests cover various input scenarios to ensure correctness.

## Requirements

- Java 8 or above
- JUnit 5
- Any Java IDE or command-line setup for compiling and running Java code

## How to Run

### To compile and run a specific solution:

```bash```
cd src
javac IncomeTaxCalculator.java
java IncomeTaxCalculator
To run tests (using JUnit 5):
Make sure junit-platform-console-standalone is available in your classpath.

bash
Copy
Edit
cd test
javac -cp .:../src:junit-platform-console-standalone-1.9.3.jar IncomeTaxCalculatorTest.java
java -jar junit-platform-console-standalone-1.9.3.jar --class-path .:../src --scan-classpath
💡 If you are using an IDE like IntelliJ or Eclipse, you can run each test class directly.

You can compile and run solution files from the src/ folder or run tests using any JUnit-compatible tool or IDE.



All files follow a clean and modular structure, with separate classes for logic and testing. Each problem is implemented in its own file to ensure clarity and ease of evaluation. Tests cover various input scenarios to ensure correctness.
