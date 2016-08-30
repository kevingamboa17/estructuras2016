package Ordenamiento;

import java.util.Random;

/**
 * Created by kevingamboa17 on 8/18/16.
 */
public class TestMétodos {
    public static void main(String[] args){
        int i;
        int arreglo[] = new int[100000];
        int arregloAux[];
        Random aleatorio = new Random();
        long inicio;
       /* arreglo[0] = 2;
        arreglo[1] = 56;
        arreglo[2] = 235;
        arreglo[3] = 97;
        arreglo[4] = 27;
        arreglo[5] = 35;
        arreglo[6] = 11;
        arreglo[7] = 9; */

        for (i=0;i<arreglo.length;i++){
            arreglo[i] = aleatorio.nextInt(100000);
        }
        arregloAux = arreglo.clone();

        Métodos ordenamiento = new Métodos();

        for (i=0;i<10;i++){
            ordenamiento.setArreglo(arregloAux.clone());
            inicio = System.currentTimeMillis();
            ordenamiento.shellsortMod(i+1);
            System.out.println("El arreglo " + (i+1) + " se ordenó en " + (System.currentTimeMillis() - inicio) + " ms");
        }
    }
}
