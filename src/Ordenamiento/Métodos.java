package Ordenamiento;

import java.util.ArrayList;

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

    public void shellsortMod(int sec){
        int intervalo,i,aux;
        int secuencias[] = secuencias(sec);
        boolean band;

        for (int j=0; j < secuencias.length;j++){
            intervalo = secuencias[j];
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

    public int[] secuencias(int sec){
        int opcion;
        int secuencias[];
        opcion = sec;

        switch (opcion){
            case 1:
                secuencias = new int[1];
                secuencias[0] = 1;
                return secuencias;
            case 2:
                secuencias = new int[2];
                secuencias[0] = 6;
                secuencias[1] = 1;
                return secuencias;
            case 3:
                secuencias = new int[2];
                secuencias[0] = 5;
                secuencias[1] = 1;
                return secuencias;
            case 4:
                secuencias = new int[2];
                secuencias[0] = 7;
                secuencias[1] = 1;
                return secuencias;
            case 5:
                secuencias = new int[2];
                secuencias[0] = 4;
                secuencias[1] = 1;
                return secuencias;
            case 6:
                secuencias = new int[2];
                secuencias[0] = 3;
                secuencias[1] = 1;
                return secuencias;
            case 7:
                secuencias = new int[2];
                secuencias[0] = 2;
                secuencias[1] = 1;
                return secuencias;
            case 8:
                secuencias = new int[3];
                secuencias[0] = 5;
                secuencias[1] = 3;
                secuencias[2] = 1;
                return secuencias;
            case 9:
                secuencias = new int[3];
                secuencias[0] = 4;
                secuencias[1] = 2;
                secuencias[2] = 1;
                return secuencias;
            case 10:
                secuencias = new int[3];
                secuencias[0] = 3;
                secuencias[1] = 2;
                secuencias[2] = 1;
                return secuencias;
        }
        secuencias = new int[1];
        secuencias[0] = 1;
        return secuencias;
    }

    public void Quicksort(){
        int ini, fin , pos;
        ArrayList pilaMenor = new ArrayList(), pilaMayor = new ArrayList();
        pilaMenor.add(0);
        pilaMayor.add(Arreglo.length-1);
        while (!pilaMenor.isEmpty()){
            ini = (Integer)pilaMenor.remove(pilaMenor.size()-1);
            fin = (Integer)pilaMayor.remove(pilaMayor.size()-1);
            pos = posicionaQuicksort(ini, fin);

            if (ini<pos-1){
                pilaMenor.add(ini);
                pilaMayor.add(pos-1);
            }
            if (fin>pos+1){
                pilaMenor.add(pos+1);
                pilaMayor.add(fin);
            }
        }

    }

    public int posicionaQuicksort(int ini, int fin){
        int pos, izq, der, aux;
        boolean band;
        izq = ini;
        der = fin;
        pos = ini;
        band = true;
        while (band){
            while (Arreglo[pos] <= Arreglo[der] && pos!=der){
                der--;
            }
            if (pos==der){
                band = false;
            }
            else {
                aux = Arreglo[pos];
                Arreglo[pos] = Arreglo[der];
                Arreglo[der] = aux;
                pos= der;
                while (Arreglo[pos]>=Arreglo[izq] && pos!=izq){
                    izq++;
                }
                if (pos==izq){
                    band=false;
                }
                else {
                    aux = Arreglo[pos];
                    Arreglo[pos] = Arreglo[izq];
                    Arreglo[izq] = aux;
                    pos = izq;
                }
            }

        }

        return pos;
    }

}
