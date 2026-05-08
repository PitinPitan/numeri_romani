/////////////////////////////////
// MATTIA MILAN 2137968
// NICOLA LUGATO 2145605
/////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void testCovertOne() {
        assertEquals("I",IntegerToRoman.convert(1));
    }

    @Test
    public void testCovertFour() {
        assertEquals("IV",IntegerToRoman.convert(4));
    }
    @Test
    public void testCovertNine() {
        assertEquals("IX",IntegerToRoman.convert(9));
    }
    @Test
    public void testCovertFourteen() {
        assertEquals("XIV",IntegerToRoman.convert(14));
    }
    @Test
    public void testCovertNineteen() {
        assertEquals("XIX",IntegerToRoman.convert(19));
    }
    @Test
    public void testCovertFourty() {
        assertEquals("XL",IntegerToRoman.convert(40));
    }
    @Test
    public void testCovertFourtyNine() {
        assertEquals("XLIX",IntegerToRoman.convert(49));
    }
    @Test
    public void testCovertFifty() {
        assertEquals("L",IntegerToRoman.convert(50));
    }
    @Test
    public void testCovertNinty() {
        assertEquals("XC",IntegerToRoman.convert(90));
    }
    @Test
    public void testCovertOneHundred() {
        assertEquals("C",IntegerToRoman.convert(100));
    }
    @Test
    public void testCovertFourHundred() {
        assertEquals("CD",IntegerToRoman.convert(400));
    }
    @Test
    public void testCovertFiveHundred() {
        assertEquals("D",IntegerToRoman.convert(500));
    }
    
    
}