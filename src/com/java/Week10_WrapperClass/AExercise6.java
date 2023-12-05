package com.java.Week10_WrapperClass;

public class AExercise6 {

    public static void main(String[] args) {
        String companyInfo = "Acme Inc.,123456.78,7890.120,123456";
        String delimiter = ",";
        double result = extractDoubleNumber(companyInfo, delimiter);
        System.out.println(result); // Should print "123456.78"
    }
    public static Double extractDoubleNumber(String companyInfo, String delimiter) {
        // Split the companyInfo string using the specified delimiter
        String[] tokens = companyInfo.split(delimiter);

        // Iterate through the tokens to find the first valid double value
        for (String token : tokens) {
            try {
                // Attempt to parse the token as a double
                return Double.parseDouble(token);
            } catch (NumberFormatException e) {
                // Ignore and continue to the next token if parsing fails
            }
        }

        // Return 0.0 if no valid double is found
        return 0.0;
    }
}
