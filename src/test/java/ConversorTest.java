import org.example.model.AlgarismDecimal;
import org.example.model.AlgarismRoman;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {
    AlgarismDecimal decimal = new AlgarismDecimal();
    AlgarismRoman roman = new AlgarismRoman();

    @Test
    void convertionRomanToDecimal() {
        assertEquals(3547, decimal.convertRomanToDecimal("MMMDXLVII"));
        assertNotEquals(3999, decimal.convertRomanToDecimal("MMCMXCIX"));
        assertEquals(2999, decimal.convertRomanToDecimal("MMCMXCIX"));
    }

    @Test
    void convertionDecimalToRoman(){
        assertEquals("MMCMXCIX", roman.convertDecimalToRoman(2999));
        assertNotEquals("I", roman.convertDecimalToRoman(15));
    }

    @Test
    void testInvalidRepeatingInRoman(){
        assertThrows(IllegalArgumentException.class, () -> decimal.convertRomanToDecimal("MMMM"));
        assertThrows(IllegalArgumentException.class, () -> decimal.convertRomanToDecimal("XXXXXXX"));
        assertThrows(IllegalArgumentException.class, () -> decimal.convertRomanToDecimal("DDDD"));
    }

    @Test
    void testAllRomansCharacters(){
        assertTrue(decimal.isValidRomanNumeral("MXCVI"));
        assertTrue(decimal.isValidRomanNumeral("XI"));
        assertTrue(decimal.isValidRomanNumeral("XVI"));
        assertFalse(decimal.isValidRomanNumeral("IXXXXD"));
        assertFalse(decimal.isValidRomanNumeral("DDDD"));
        assertFalse(decimal.isValidRomanNumeral("XXXXVXIV"));
    }

    @Test
    void testInputZero(){
        assertThrows(IllegalArgumentException.class, () -> roman.convertDecimalToRoman(0));
    }
    @Test
    void testAcceptableLimit(){
        assertThrows(IllegalArgumentException.class, () -> roman.convertDecimalToRoman(4000));
    }

}
