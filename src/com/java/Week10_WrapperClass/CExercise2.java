package com.java.Week10_WrapperClass;

public class CExercise2 {
    public static void main(String[] args) {
        String str = "Hello 123 World!";
//        int[] result = countCharacterTypes(str);
//        System.out.println(Arrays.toString(result));
        System.out.println(countCharacterTypes(str));
    }

    public static int[] countCharacterTypes (String str) {
        int alphabeticChars = 0;
        int digitChars = 0;
        int whiteSpaceChar = 0;

        for(char ch : str.toCharArray()) {
            if(Character.isLetter(ch)) {
                alphabeticChars++;
            } else if(Character.isDigit(ch)) {
                digitChars++;
            } else if(Character.isWhitespace(ch)) {
                whiteSpaceChar++;
            }
        }

        int[] countedResult = {alphabeticChars, digitChars, whiteSpaceChar};
        return countedResult;

//        return String.format("Alphabetic Chars: %d, Digit Chars: %d, White Space Chars: %d", alphabeticChars, digitChars, whiteSpaceChar);

    }
}
