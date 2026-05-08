/////////////////////////////////
// MATTIA MILAN 2137968
// NICOLA LUGATO 2145605
/////////////////////////////////
package it.unipd.mtss;


public class IntegerToRoman
{
    public static String convert(int number) {
        String stringa = "";
        if(number<=3){
            for(int i=0; i<number;i++){
                stringa+="I";
            }
        }
        return stringa;
    }
}
