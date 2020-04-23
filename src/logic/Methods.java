package logic;

import java.text.DecimalFormat;

public class Methods {
    public static void numberWithWhile(double rangeMin, double rangeMax, double step, String decimalFormatPattern){
        DecimalFormat decimalFormat = new DecimalFormat(decimalFormatPattern);
        while(rangeMin <= rangeMax){
            if(rangeMin != rangeMax)
                System.out.printf(rangeMin + ",");
            else
                System.out.printf(Double.toString(rangeMin));
            rangeMin += step;
            rangeMin = Double.parseDouble(decimalFormat.format(rangeMin).toString().replace(",","."));
        }
    }

    public static void numberWithDoWhile(double rangeMin, double rangeMax, double step, String decimalFormatPattern){
        DecimalFormat decimalFormat = new DecimalFormat(decimalFormatPattern);
        do{
            System.out.printf(rangeMin + ",");
            rangeMin += step;
            rangeMin = Double.parseDouble(decimalFormat.format(rangeMin).toString().replace(",","."));
        }while(rangeMin < rangeMax);
        System.out.printf(Double.toString(rangeMax));
    }
}
