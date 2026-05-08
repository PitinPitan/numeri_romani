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
    public void testCovertSixteen() {
        assertEquals("XVI",IntegerToRoman.convert(16));
    }
    @Test
    public void testCovertNineteen() {
        assertEquals("XIX",IntegerToRoman.convert(19));
    }
    @Test
    public void testCovertTwenty() {
        assertEquals("XX",IntegerToRoman.convert(20));
    }
    
    
}