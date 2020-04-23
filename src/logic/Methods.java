package logic;

public class Methods {
    public static void numberWithWhile(double rangeMin, double rangeMax, double step){
        while(rangeMin <= rangeMax){
            System.out.printf(rangeMin + ",");
            rangeMin += step;
        }
    }
}
