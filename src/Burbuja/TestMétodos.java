package Burbuja;
/**
 * Created by kevingamboa17 on 8/18/16.
 */
public class TestMétodos {
    public static void main(String[] args){
        int arreglo[] = new int[8];
        arreglo[0] = 2;
        arreglo[1] = 56;
        arreglo[2] = 235;
        arreglo[3] = 97;
        arreglo[4] = 27;
        arreglo[5] = 35;
        arreglo[6] = 11;
        arreglo[7] = 9;

        Métodos ordenamiento = new Métodos();
        ordenamiento.setArreglo(arreglo);
        System.out.print("Arreglo desordenado: \n");
        ordenamiento.imprimirArreglo();
        System.out.print("Arreglo ordenado: \n");
        ordenamiento.burbujaMayor();
        ordenamiento.imprimirArreglo();
    }
}
