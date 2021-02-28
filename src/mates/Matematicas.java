package mates;
import java.lang.Math;

public class Matematicas {
    int aciertos = 0;
    int areaCuadrado = 4;
    int radio = 1;


    public double distancia(double x, double y){
        return Math.sqrt(x*x+y*y);
    }

    public double generarNumeroPi(long pasos) {
        long puntosTotales = args[0];
        for (long i = 0; i < puntosTotales; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (distancia (x,y) <= 1){
                aciertos++;
            }

            int areaCirculo = areaCuadrado*(int)(aciertos/puntosTotales);
            long estimacionPi = areaCirculo/radio^2;
            return estimacionPi;
        }
    }
}
