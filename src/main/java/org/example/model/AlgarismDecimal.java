package org.example.model;

import java.util.TreeMap;

public class AlgarismDecimal {
    private static final TreeMap<String, Integer> romanToDecimalMap = new TreeMap<>();

    public AlgarismDecimal(){
        romanToDecimalMap.put("I", 1);
        romanToDecimalMap.put("V", 5);
        romanToDecimalMap.put("X", 10);
        romanToDecimalMap.put("L", 50);
        romanToDecimalMap.put("C", 100);
        romanToDecimalMap.put("D", 500);
        romanToDecimalMap.put("M", 1000);

    }

    public int convertRomanToDecimal(String romanNumeral) {
        if(isValidRomanNumeral(romanNumeral)){

            int decimalValue = 0;
            int previousValue = 0;

            for (int i = romanNumeral.length() - 1; i >= 0; i--) {
                String currentSymbol = romanNumeral.substring(i, i + 1);
                int currentValue = romanToDecimalMap.get(currentSymbol);

                if (currentValue < previousValue) {
                    decimalValue -= currentValue;
                } else {
                    decimalValue += currentValue;
                }
                previousValue = currentValue;
            }

            return decimalValue;

        } else {
            throw new IllegalArgumentException("O Romano não segue as regras permitidas, verifique se há números repetidos ou numeros menores antes de maiores ");
        }
    }

    public boolean isValidRomanNumeral(String romanNumeral) {
        return romanNumeral.matches("M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})");
    }

}
