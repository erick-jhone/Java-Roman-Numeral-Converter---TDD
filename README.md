# Roman Numeral Converter (TDD)

This project provides a Roman numeral converter that supports both Roman to decimal and decimal to Roman conversions. The implementation follows the Test-Driven Development (TDD) approach, and unit tests are created using JUnit 5 to ensure the correctness of the conversions.

## Table of Contents
- [Roman to Decimal Conversion](#roman-to-decimal-conversion)
- [Decimal to Roman Conversion](#decimal-to-roman-conversion)
- [Usage](#usage)
- [Testing](#testing)
- [Contributing](#contributing)


## Roman to Decimal Conversion

The `AlgarismDecimal` class in this project contains a method `convertRomanToDecimal` that takes a Roman numeral as input and returns its corresponding decimal value. It also provides validation for Roman numeral input to ensure it adheres to the allowed rules.

## Decimal to Roman Conversion

The `AlgarismRoman` class provides a method `convertDecimalToRoman` that takes a decimal number as input and converts it to a Roman numeral. It follows the rules for Roman numeral representation and handles valid input within the range of 1 to 3999.

## Usage

To use the Roman numeral converter, you can create instances of the `AlgarismDecimal` and `AlgarismRoman` classes and call their respective conversion methods. Here's an example of how to use it:

```java
AlgarismDecimal decimal = new AlgarismDecimal();
AlgarismRoman roman = new AlgarismRoman();

// Convert Roman to Decimal
int decimalValue = decimal.convertRomanToDecimal("MMCMXCIX");
System.out.println("Roman to Decimal: " + decimalValue);

// Convert Decimal to Roman
String romanValue = roman.convertDecimalToRoman(2999);
System.out.println("Decimal to Roman: " + romanValue);
````

## Testing
The project includes a comprehensive set of unit tests created with JUnit 5 to ensure the correctness of the conversion and validate that it adheres to the rules of Roman numerals. You can run these tests to verify the functionality of the converter.

## Contributing
If you'd like to contribute to this project, feel free to open issues, suggest improvements, or submit pull requests. Your contributions are welcome and appreciated.
