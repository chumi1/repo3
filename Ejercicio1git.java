import Funciones.FuncsArrays;
public class Ejercicio1git {

public static void main(String[] args) {
    int[] vector = new int[10];
    FuncsArrays.cargaArrayRandom(vector);
    for (int i = 0; i < vector.length; i++) {
        System.out.printf("%3d ", vector[i]);
    }
    System.out.println(" ");
}
}