package Ordenamiento;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by kevingamboa17 on 8/29/16.
 */
public class MergeSort {

    public ArrayList ordenaMerge(ArrayList L){
        int n = L.size(),i,m;
        ArrayList L1 = new ArrayList(),
                L2 = new ArrayList();
        if (n>1){
            m = n/2;
            for (i=0;i<m;i++) {
                L1.add(L.get(i));
            }
            for (i=m;i<n;i++){
                L2.add(L.get(i));
            }
            L = merge(ordenaMerge(L1), ordenaMerge(L2));
        }
        return L;
    }

    public ArrayList merge(ArrayList L1, ArrayList L2){
        ArrayList lista = new ArrayList();
        while(!L1.isEmpty() && !    L2.isEmpty()){
            if ((Integer)L1.get(0) < (Integer)L2.get(0)){
                lista.add(L1.get(0));
                L1.remove(0);
                if (L1.isEmpty()){
                    lista.addAll(L2);
                    L2.clear();
                }
            }
            else {
                lista.add(L2.get(0));
                L2.remove(0);
                if (L2.isEmpty()){
                    lista.addAll(L1);
                    L1.clear();
                }
            }
        }
        return lista;
    }

    public static void main(String[] args){
        ArrayList lista = new ArrayList();
        MergeSort merge= new MergeSort();
        long inicio;
        Random r = new Random();
        for (int i= 0; i<100000;i++){
            lista.add(r.nextInt(100000));
        }
        System.out.println("Arreglo desordenado");
        System.out.println(lista);
        System.out.println("Arreglo ordenado");
        inicio = System.currentTimeMillis();
        lista = merge.ordenaMerge(lista);
        System.out.println(lista);
        System.out.println("La ordenación duró " + (System.currentTimeMillis() - inicio) + " ms" );
    }
}
