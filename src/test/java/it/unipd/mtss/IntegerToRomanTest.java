/////////////////////////////////
// MATTIA MILAN 2137968
// NICOLA LUGATO 2145605
/////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void TestBase() {
        assertEquals("I", IntegerToRoman.convert(1));
        assertEquals("V", IntegerToRoman.convert(5));
        assertEquals("X", IntegerToRoman.convert(10));
        assertEquals("L", IntegerToRoman.convert(50));
        assertEquals("C", IntegerToRoman.convert(100));
        assertEquals("D", IntegerToRoman.convert(500));
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void TestSottrattivo() {
        assertEquals("IV", IntegerToRoman.convert(4));
        assertEquals("IX", IntegerToRoman.convert(9));
        assertEquals("XIV", IntegerToRoman.convert(14));
        assertEquals("XXXIV", IntegerToRoman.convert(34));
        assertEquals("XL", IntegerToRoman.convert(40));
        assertEquals("XC", IntegerToRoman.convert(90));
        assertEquals("CXL", IntegerToRoman.convert(140));
        assertEquals("CD", IntegerToRoman.convert(400));
        assertEquals("CDXCIX", IntegerToRoman.convert(499));
        assertEquals("CM", IntegerToRoman.convert(900));
    }

    @Test
    public void TestNumeroComplesso() {
        assertEquals("DCCCLXXXVIII", IntegerToRoman.convert(888));
    }   

    @Test(expected = IllegalArgumentException.class)
    public void testUnderRange() {
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOverRange() {
        IntegerToRoman.convert(1001);
    }
    
}