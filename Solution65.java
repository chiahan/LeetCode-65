class Solution65 {

    public static void main(String[] args) {
        if (args.length == 2) {
            verifyResult(args[0], Boolean.valueOf(args[1]));
            System.out.println("Test case passed!");
        } else {
            testIsValidNumber();
        }
    }

    public static void testIsValidNumber() {
        verifyResult("2", true);
        verifyResult("2 ", true);
        verifyResult(" ", false);
        verifyResult("2,000", false);
        
        verifyResult("2 2", false);
        verifyResult("2e2", true);
        verifyResult("2E2", false);
        verifyResult("2e2.2", false);
        verifyResult("e10", false);
        verifyResult("e", false);
        verifyResult("2e", false);
        verifyResult("2e+2", true);
        verifyResult("2e-2", true);

        verifyResult("2.2", true);
        verifyResult(".2", true);
        verifyResult("2.", true);
        verifyResult(".", false);
        verifyResult(". 1", false);
        verifyResult(".e", false);
        
        verifyResult("-1.", true);
        verifyResult("+1.", true);
        verifyResult("-.", false);
        System.out.println("All test cases passed!");
    }

    public static void verifyResult(String input, boolean expectedOutput) {
        boolean output = isValidNumber(input);
        assert output == expectedOutput: "isValidNumber() failed,\n"
            + "Input: " + input + "\n"
            + "Expected output: " + expectedOutput + "\n"
            + "Output: " + output;
    }

    public static boolean isValidNumber(String s) {
        boolean result = true;
        boolean hasPoint = false;
        boolean hasE = false;
        boolean hasDigit = false;
        s = s.trim();

        for(int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                hasDigit = true;
            } else if (s.charAt(i) == '.') {
                if (hasPoint || hasE) { 
                    return false; 
                }
                hasPoint = true;
            } else if (s.charAt(i) == 'e') {
                if (hasE || !hasDigit) {
                    return false;
                }
                hasE = true;
                hasDigit = false;
            } else if ((s.charAt(i) == '-' || s.charAt(i) == '+') && (i == 0 || s.charAt(i-1) == 'e')) {
                
            } else {
                return false;
            }
        }
        
        return hasDigit;
    }
}
