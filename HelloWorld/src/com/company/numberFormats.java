package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class numberFormats {

    public static void main(String[] args) {

        var doubleValue = 10000000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number : " + numF.format(doubleValue));

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number : " + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Number : " + intF.format(doubleValue));

        var locale = new Locale("de", "DE");
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number : " + localeFormatter.format(doubleValue));

        var currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormatter.format(doubleValue));
    }

}
