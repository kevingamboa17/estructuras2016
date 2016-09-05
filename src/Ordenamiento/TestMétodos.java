package Ordenamiento;

import java.util.Random;

/**
 * Created by kevingamboa17 on 8/18/16.
 */
public class TestMétodos {
    public static void main(String[] args){
        int i;
        int arreglo[] = new int[100000];
        Random aleatorio = new Random();
        long inicio;

        for (i=0;i<arreglo.length;i++){
            arreglo[i] = aleatorio.nextInt(100000);
        }

        Métodos ordenamiento = new Métodos();

        ordenamiento.setArreglo(arreglo);
        inicio = System.currentTimeMillis();
        ordenamiento.Quicksort();
        System.out.println("El arreglo se ordenó en " + (System.currentTimeMillis() - inicio) + " ms");
        ordenamiento.imprimirArreglo();

    }
}
