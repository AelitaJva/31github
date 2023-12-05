package com.java.Week10_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {
        // Acme Inc. ,123456.78, 7890.12, 3456.78
        // Globex Corporation, 987654.332, 5432.18, 2190.87
        // Initech Industries, 456789/91, 1234.56, 7898.12

        String values = "Acme Inc.,123456.78,7890.12,3456.78\n" +
                "        Globex Corporation,987654.332,5432.18,2190.87\n" +
                "        Initech Industries,456789.91,1234.56,7898.12";


        // task is to calculate total revenue of 3 companies
        // revenue is the between first and second commas


        int indexOfFirstComma = values.indexOf(",");
        int indexOfSecondComma = values.indexOf(",", indexOfFirstComma+1);
        //int indexOfThirdComma = values.indexOf(",", indexOfSecondComma);
        System.out.println(indexOfFirstComma);
        System.out.println(indexOfSecondComma);

        String firstCompanyRevenue = values.substring(indexOfFirstComma+1, indexOfSecondComma);
        System.out.println(firstCompanyRevenue);
        double firstCompRevenue = Double.parseDouble(firstCompanyRevenue);
        System.out.println(firstCompRevenue);


        int indexOfFirstNewLine = values.indexOf("\n");
        int secondCompFirstComma = values.indexOf(",", indexOfFirstNewLine);
        int secondCompSecondComma = values.indexOf(",", secondCompFirstComma+1);
        String secondCompRevStr = values.substring(indexOfFirstComma+1, secondCompSecondComma);
        double secCompRevenue = Double.parseDouble(secondCompRevStr);


        int indexOfSecondNewLine = values.indexOf("\n", indexOfFirstNewLine);
        int thirdCompFirstComma = values.indexOf(",", indexOfSecondNewLine+1);
        int thirdCompSecondComma = values.indexOf(",", thirdCompFirstComma+1);

        String thirdCompanyRevStr =values.substring(thirdCompFirstComma+1, thirdCompSecondComma);
        double thirdComRev = Double.parseDouble(thirdCompanyRevStr);
        System.out.println(secCompRevenue);
        System.out.println(thirdComRev);
    }
}
