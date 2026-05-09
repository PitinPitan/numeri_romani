/////////////////////////////////
// MATTIA MILAN 2137968
// NICOLA LUGATO 2145605
/////////////////////////////////
package it.unipd.mtss;

import java.util.HashMap;
import java.util.Map;
public class RomanPrinter {

 private static final Map<Character, String[]> asciiArt = new HashMap<>();

  static {
    asciiArt.put('I', new String[]{
            "  _____  ", " |_   _| ", "   | |   ", "   | |   ", "  _| |_  ", " |_____| "
        });
    asciiArt.put('V', new String[]{
            " __      __ ", " \\ \\    / / ", "  \\ \\  / /  ", "   \\ \\/ /   ", "    \\  /    ", "     \\/     "
        });
    asciiArt.put('X', new String[]{
            " __  __ ", " \\ \\/ / ", "  \\  /  ", "  /  \\  ", " / /\\ \\ ", "/_/  \\_\\"
        });
    asciiArt.put('L', new String[]{
            "  _       ", " | |      ", " | |      ", " | |      ", " | |____  ", " |______| "
        });
    asciiArt.put('C', new String[]{
            "   _____  ", "  / ____| ", " | |      ", " | |      ", " | |____  ", "  \\_____| "
        });
    asciiArt.put('D', new String[]{
            "  _____  ", " |  __ \\ ", " | |  | |", " | |  | |", " | |__| |", " |_____/ "
        });
    asciiArt.put('M', new String[]{
            "  __  __ ", " |  \\/  |", " | \\  / |", " | |\\/| |", " | |  | |", " |_|  |_|"
        });
  }
  public static String print(int num){
    return printAsciiArt(IntegerToRoman.convert(num));
  }

  private static String printAsciiArt(String romanNumber) {

    StringBuilder result = new StringBuilder();
    int height = 6; 

    for (int i = 0; i < height; i++) {
        
        for (char c : romanNumber.toCharArray()) {
            result.append(asciiArt.get(c)[i]);
        } 
   
        if (i < height - 1) {
            result.append("\n");
        }
        
    }
    return result.toString();
  }
}