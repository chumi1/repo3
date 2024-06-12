package Funciones;

public class FuncsArrays {
    /**
     * carga un vector con numeros aleatorios
     * va del 1 y 100
     * @param v el vector recibe la funcion
     */
     public static void cargaArrayRandom(int[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = (int)((Math.random()* 101)+ 1);
        }
     }
        public static int menorValorArray(int[] v){
            int menor = Integer.MAX_VALUE;
            for (int i = 0; i < v.length; i++) {
                if (v[i] < menor){
                    menor = v[i];
                }
                
            }
        return menor;
     }
     public static int mayorValorArray(int[] v ){
        int mayor = Integer.MIN_VALUE;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > mayor ){
                mayor =v[i];
                
            }
        }
        return mayor;
    }
}
