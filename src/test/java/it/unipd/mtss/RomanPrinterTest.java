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
  public void testPrint() {
    // Aggiungiamo anche la chiamata al metodo per la copertura
    String result = RomanPrinter.print(1);
    assertEquals("", result);
  }
}