# LeetCode No.65
My solution to Leetcode No.65

## Intallation
```
git clone https://github.com/chiahan/leetcode65
```

## Compile 
```
javac Solution65.java
```
(Java version: 1.4 and above)

## Execution
This program will determine whether the input string is a valid number, and compare with the result with your expectation.
```
java -ea Solution65
```
or 
```
java -ea Solution65 [a string] [expected result]
```
e.g., 
If the result is the same as your expectation: `java -ea Solution65 "2.2e+2" true`
No output
If the result is not the same as your expectation: `java -ea Solution65 "2.2e+2" false`
Output:
```
Exception in thread "main" java.lang.AssertionError: isValidNumber() failed,
Input: 2.2e+2
Expected output: false
Output: true
	at Solution65.testIsValidNumber(Solution65.java:37)
	at Solution65.main(Solution65.java:5)
```
## Document
- `isValidNumber(String s)`
A function that will determine whether the input string is a valid number.
- `testIsValidNumber(String input, boolean expectedOutput)`
A unit test of the isValidNumber() function.
- `main()`
Provides many default test cases for the isValidNumber() function.
It could also take the arguments from command line dynamically.
