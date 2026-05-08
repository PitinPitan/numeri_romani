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
    public void testCovertFour() {
        assertEquals("IV",IntegerToRoman.convert(4));
    }
    
    @Test
    public void testCovertSix() {
        assertEquals("VI",IntegerToRoman.convert(6));
    }
    @Test
    public void testCovertNine() {
        assertEquals("IX",IntegerToRoman.convert(9));
    }
    @Test
    public void testCovertTen() {
        assertEquals("X",IntegerToRoman.convert(10));
    }
    
    
}