# LeetCode No.65
My solution to Leetcode No.65

## Intallation
```
git clone https://github.com/chiahan/leetcode65
```

## Compilation
```
javac Solution65.java
```
(Java version: 1.4 or above)

## Execution
This program will determine whether the input string is a valid number, and compare it with your expectation.
```
java -ea Solution65
```
or 
```
java -ea Solution65 [a string] [expected result]
```
## Example Output
1. If the result is the same as your expectation: `java -ea Solution65 "2.2e+2" true`
```All test cases passed!```
2. If the result is not the same as your expectation: `java -ea Solution65 "2.2e+2" false`
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
A function that determine whether the input string is a valid number.
- `testIsValidNumber()`
A unit test of the isValidNumber() function.
- `verifyResult(String input, boolean expectedOutput)`
The function that use assertion to check whether the output is the same as expectation.
- `main()`
Main function performs the unit test with predefined test cases for the isValidNumber() function if there is no user input.
It could also take arguments as input to isValidNumber() from command line dynamically and the output will compare to the user's expected output.

## How did I use Assertion to conquer the question?
The definition of the number is not clear in this question. For example, I didn't expect that "+1." is a number and "2E2" is not a number. Therefore, I wrote a testIsValidNumber() and used it to test my initial assumptions. Then, when any submission failed, I modified my solution according to the new test case and added it into the main function, so I could make sure that the modification won't break any known test cases. Finally, all the cases passed and my solution is accepted!
