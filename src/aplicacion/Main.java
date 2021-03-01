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
package aplicacion;
import mates.Matematicas;

/**
 * Clase Principal del programa que muestra el resultado de las operaciones de la clase Matematicas
 * @author Pablo Rivero
 * @version 21.2, 1/03/2021
 */
public class Main {
    /**
     * Metodo que muestra el resultado en pantalla.
     * @param args, numero de puntos aleatorios que se generaran
     */
    public static void main(String[] args) {
        System.out.println("El numero pi es " + Matematicas.generarNumeroPi(Integer.parseInt(args[0])));

    }
}