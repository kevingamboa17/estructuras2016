package Burbuja;

import java.util.Scanner;

/**
 * Created by kevingamboa17 on 8/18/16.
 */
public class Métodos {
    private int Arreglo[];

    public Métodos() {
    }

    public Métodos(int arreglo[]){
        Arreglo = arreglo;
    }

    public int[] getArreglo() {
        return Arreglo;
    }

    public void setArreglo(int[] arreglo) {
        Arreglo = arreglo;
    }

    public void insercion(){
        int i,aux,k;
        for(i=1;i<Arreglo.length;i++){
            aux = Arreglo[i];
            k = i-1;
            while(k>=0 && aux<Arreglo[k]){
                Arreglo[k+1] = Arreglo[k];
                k--;
            }
            Arreglo[k+1] = aux;
        }
    }

    public void burbujaMayor(){
        int i,j,aux;
        for (i=1; i<Arreglo.length; i++){
            for (j=0; j<Arreglo.length-1;j++){
                if(Arreglo[j] < Arreglo[j+1]){
                    aux = Arreglo[j];
                    Arreglo[j] = Arreglo[j+1];
                    Arreglo[j+1] = aux;
                }
            }
        }
    }

    public void imprimirArreglo(){
        for (int i=0; i<Arreglo.length;i++){
            System.out.print(Arreglo[i] + "\n");
        }
    }

    public void shellsort(){
        System.out.println("Shellsort");
        int intervalo,i,aux;
        boolean band;
        intervalo = Arreglo.length;
        while(intervalo>1){
            intervalo /=2;
            band = true;
            while(band){
                band = false;
                i=0;
                while((intervalo+i) <  Arreglo.length){
                    if(Arreglo[i]>Arreglo[i+intervalo]){
                        aux = Arreglo[i];
                        Arreglo[i] = Arreglo[i+intervalo];
                        Arreglo[i+intervalo] = aux;
                        band = true;

                    }
                    i++;
                }
            }
        }
    }

    public void shellsortMod(){
        System.out.println("Ingresa el número TOTAL secuencias: ");
        int intervalo,i,aux;
        int secuencias[];
        boolean band;
        Scanner n = new Scanner(System.in);
        secuencias = new int[n.nextInt()];
        intervalo = secuencias.length;

        for (i=0; i<intervalo;i++){
            
            band = true;
            while(band){
                band = false;
                i=0;
                while((intervalo+i) <  Arreglo.length){
                    if(Arreglo[i]>Arreglo[i+intervalo]){
                        aux = Arreglo[i];
                        Arreglo[i] = Arreglo[i+intervalo];
                        Arreglo[i+intervalo] = aux;
                        band = true;

                    }
                    i++;
                }
            }
        }

    }
}
