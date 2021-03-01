/*
Copyright [2021] [Pablo Rivero]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing,
software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
implied.
See the License for the specific language governing permissions
and
limitations under the License.
 */
package mates;
import java.lang.Math;

/**
 * Clase Matematicas contiene el metodoque realiza los calculos para obtener el numero Pi.
 * @author Pablo Rivero
 * @version 21.2, 1/03/2021
 */
public class Matematicas {

    /**
     * Metodo que genera puntos aleatorios en un plano, y calcula el numero Pi a traves del metodo de montecarlo
     * @param pasos, numero de puntos generados en el plano. Es tomado del primer argumento introducido al ejecutar el
     programa.
     * @return EstimacionPi
     */
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

