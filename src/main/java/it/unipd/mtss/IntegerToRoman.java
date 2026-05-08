/////////////////////////////////
// MATTIA MILAN 2137968
// NICOLA LUGATO 2145605
/////////////////////////////////
package it.unipd.mtss;


public class IntegerToRoman
{
    public static String convert(int number) {
        String stringa = "";
        if(number<=0 || number>1000){
            return "";
        }
        while(number>0){
            if(number<4){
                for(; number>0;number--){
                    stringa+="I";
                }
            }else{
                if(number==4){
                    stringa+="IV";
                    number-=4;
                }
                if(number>=5 && number<10){
                    stringa+="V";
                    number-=5;
                }
            }

        }
        return stringa;
    }
}
