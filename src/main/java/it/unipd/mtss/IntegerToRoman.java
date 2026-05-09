/////////////////////////////////
// MATTIA MILAN 2137968
// NICOLA LUGATO 2145605
/////////////////////////////////
package it.unipd.mtss;


public class IntegerToRoman
{
    private static String[] nRomani = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    private static int[] nArabi = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    private IntegerToRoman(){}

    public static String convert(int number) {
        String stringa = "";
        if(number<=0 || number>1000){
            throw new IllegalArgumentException("Il numero deve essere compreso tra 1 e 1000");
        }
        for(int i=0;i<nArabi.length;i++){
            while(number>=nArabi[i]){
                stringa += nRomani[i];
                number-=nArabi[i];
            }
        }
        return stringa;
    }
}
