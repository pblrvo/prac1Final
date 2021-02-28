package mates;
import java.lang.Math;

public class Matematicas {

    public static double generarNumeroPi(long pasos) {
       double aciertos = 0;

       for (int i = 0; i < pasos; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2))) <= 1){
                aciertos++;
            }
        }

        int areaCuadrado = 4;
        int radio = 1;
        double areaCirculo = areaCuadrado* (aciertos / (double) pasos);
        double estimacionPi = areaCirculo / Math.pow(radio,2);
        return estimacionPi;
    }
}

