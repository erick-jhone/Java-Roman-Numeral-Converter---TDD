package org.example.model;

import java.util.TreeMap;

public class AlgarismRoman {
    private static final TreeMap<Integer, String> decimalToRomanMap = new TreeMap<>();

    public AlgarismRoman() {
        decimalToRomanMap.put(1000, "M");
        decimalToRomanMap.put(900, "CM");
        decimalToRomanMap.put(500, "D");
        decimalToRomanMap.put(400, "CD");
        decimalToRomanMap.put(100, "C");
        decimalToRomanMap.put(90, "XC");
        decimalToRomanMap.put(50, "L");
        decimalToRomanMap.put(40, "XL");
        decimalToRomanMap.put(10, "X");
        decimalToRomanMap.put(9, "IX");
        decimalToRomanMap.put(5, "V");
        decimalToRomanMap.put(4, "IV");
        decimalToRomanMap.put(1, "I");
    }

    public boolean isInvalid(int decimal) {
        int limit = 3999;
        int base = 1;
        return (decimal < base || decimal > limit);
    }

    public String convertDecimalToRoman(int decimal) {
        if (isInvalid(decimal)) {
            throw new IllegalArgumentException("O número decimal é inválido, só são aceitos números de 1 a 3999.");
        } else {
            StringBuilder roman = new StringBuilder();

            while (decimal > 0) {
                int key = decimalToRomanMap.floorKey(decimal);
                String romanSymbol = decimalToRomanMap.get(key);
                roman.append(romanSymbol);
                decimal -= key;
            }

            return roman.toString();
        }
    }

}
