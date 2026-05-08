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
    public void testCovertThree() {
        assertEquals("III",IntegerToRoman.convert(3));
    }

    @Test
    public void testCovertFour() {
        assertEquals("IV",IntegerToRoman.convert(4));
    }

    @Test
    public void testCovertFive() {
        assertEquals("V",IntegerToRoman.convert(5));
    }
    
    @Test
    public void testCovertSix() {
        assertEquals("VI",IntegerToRoman.convert(6));
    }

    
}