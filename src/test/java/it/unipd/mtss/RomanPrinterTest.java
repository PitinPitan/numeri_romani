/////////////////////////////////
// MATTIA MILAN 2137968
// NICOLA LUGATO 2145605
/////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull; 
import org.junit.Test;


public class RomanPrinterTest {
  
  @Test
  public void testConstructor() {
    // Ora Java troverà RomanPrinter senza problemi
    RomanPrinter test = new RomanPrinter();
    assertNotNull(test);
  }

 @Test
    public void testPrintI() {
        String expected = 
            "  _____  \n" +
            " |_   _| \n" +
            "   | |   \n" +
            "   | |   \n" +
            "  _| |_  \n" +
            " |_____| ";
        
        assertEquals(expected, RomanPrinter.print(1));
    }

    @Test
    public void testPrintV() {
        String expected = 
            " __      __ \n" +
            " \\ \\    / / \n" +
            "  \\ \\  / /  \n" +
            "   \\ \\/ /   \n" +
            "    \\  /    \n" +
            "     \\/     ";
        
        assertEquals(expected, RomanPrinter.print(5));
    }

    @Test
    public void testPrintX() {
        String expected = 
            " __  __ \n" +
            " \\ \\/ / \n" +
            "  \\  /  \n" +
            "  /  \\  \n" +
            " / /\\ \\ \n" +
            "/_/  \\_\\";
        
        assertEquals(expected, RomanPrinter.print(10));
    }

    @Test
    public void testPrintL() {
        String expected = 
            "  _       \n" +
            " | |      \n" +
            " | |      \n" +
            " | |      \n" +
            " | |____  \n" +
            " |______| ";
        
        assertEquals(expected, RomanPrinter.print(50));
    }

    @Test
    public void testPrintC() {
        String expected = 
            "   _____  \n" +
            "  / ____| \n" +
            " | |      \n" +
            " | |      \n" +
            " | |____  \n" +
            "  \\_____| ";
        
        assertEquals(expected, RomanPrinter.print(100));
    }

    @Test
    public void testPrintD() {
        String expected = 
            "  _____  \n" +
            " |  __ \\ \n" +
            " | |  | |\n" +
            " | |  | |\n" +
            " | |__| |\n" +
            " |_____/ ";
        
        assertEquals(expected, RomanPrinter.print(500));
    }

    @Test
    public void testPrintM() {
        String expected = 
            "  __  __ \n" +
            " |  \\/  |\n" +
            " | \\  / |\n" +
            " | |\\/| |\n" +
            " | |  | |\n" +
            " |_|  |_|";
        
        assertEquals(expected, RomanPrinter.print(1000));
    }
}