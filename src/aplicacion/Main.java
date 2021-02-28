package aplicacion;
import mates.Matematicas;

public class Main {

    public static void main(String[] args) {
        System.out.println("El numero pi es " + Matematicas.generarNumeroPi(Integer.parseInt(args[0])));

    }
}