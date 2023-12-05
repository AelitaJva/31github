package com.java.Week10_WrapperClass;

public class AExercise7 {
    public static void main(String[] args) {
        String companyInfo = "Acme Inc.,123456.78,7890.120,123456";
        String delimiter = ",";
        Double result = extractDoubleNumber(companyInfo, delimiter);

        if (result != null) {
            System.out.println(result); // Should print "123456.78"
        } else {
            System.out.println("No valid double value found");
        }
    }

    public static Double extractDoubleNumber(String companyInfo, String delimiter) {
        // Split the companyInfo string using the specified delimiter
        String[] tokens = companyInfo.split(delimiter);

        // Variable to track whether a valid double value was found
        boolean found = false;

        // Iterate through the tokens to find the first valid double value
        for (String token : tokens) {
            try {
                // Attempt to parse the token as a double
                Double result = Double.parseDouble(token);
                found = true;
                return result;
            } catch (NumberFormatException e) {
                // Ignore and continue to the next token if parsing fails
            }
        }

        // Return null if no valid double is found
        return found ? 0.0 : null;
    }
}
