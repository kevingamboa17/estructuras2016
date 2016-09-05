package Ordenamiento;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

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
        while(!L1.isEmpty() && !L2.isEmpty()){
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

    public ArrayList ordenaMergeMod(ArrayList <Alumno> L, int tipo){
        int n = L.size(),i,m;
        ArrayList<Alumno> L1 = new ArrayList <Alumno>(),
                L2 = new ArrayList <Alumno>();
        if (n>1){
            m = n/2;
            for (i=0;i<m;i++) {
                L1.add(L.get(i));
            }
            for (i=m;i<n;i++){
                L2.add(L.get(i));
            }
            L = mergeMod(ordenaMergeMod(L1, tipo), ordenaMergeMod(L2, tipo), tipo);
        }
        return L;
    }

    public ArrayList mergeMod(ArrayList <Alumno> L1, ArrayList <Alumno> L2, int tipo){
        ArrayList<Alumno> lista = new ArrayList <Alumno>();
        while (!L1.isEmpty() && !L2.isEmpty()){
            switch (tipo){
                case 1:
                    if (L1.get(0).getNombre().compareTo(L2.get(0).getNombre()) < 0){
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
                    break;
                case 2:
                    if (L1.get(0).getApellido().compareTo(L2.get(0).getApellido()) < 0){
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
                    break;
                case 3:
                    if (L1.get(0).getMatricula().compareTo(L2.get(0).getMatricula()) < 0){
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
                    break;
                case 4:
                    if ((Integer)L1.get(0).getEdad() < (Integer)L2.get(0).getEdad()){
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
                    break;
                case 5:
                    if ((Double)L1.get(0).getPromedio() < (Double)L2.get(0).getPromedio()){
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
                    break;
            }
        }
        return lista;
    }

    public ArrayList<Alumno> crearArrayAlumnos()    {
        ArrayList<Alumno> lista = new ArrayList<Alumno>();
        lista.add(new Alumno("Kevin", "Gamboa", "12001493", 19, 81));
        lista.add(new Alumno("Adrian", "Leyva", "14001395", 22, 77));
        lista.add(new Alumno("Marco", "Chavez", "13001643", 21, 99));
        lista.add(new Alumno("Armando", "Carjaval", "14829373", 19, 87));
        lista.add(new Alumno("Daniel", "Baas", "13001167", 18, 99));
        lista.add(new Alumno("Aquino", "Cob", "13001483", 16, 62));
        lista.add(new Alumno("Rolando", "tupe", "12001443", 2, 55));
        lista.add(new Alumno("Lionel", "Messi", "13001643", 33, 99));
        lista.add(new Alumno("Steve", "Jobs", "10372854", 32, 73));
        lista.add(new Alumno("Yisus", "Craist", "10362712", 12, 4));
        return lista;
    }
    public void imprimiArreglo(ArrayList <Alumno> array){
        int size = array.size(), i;
        for (i=0;i<size;i++){
            System.out.print(array.get(i).getNombre() + " ");
            System.out.print(array.get(i).getApellido() + " ");
            System.out.print(array.get(i).getMatricula() + " ");
            System.out.print(array.get(i).getEdad() + " ");
            System.out.print(array.get(i).getPromedio() + "\n");
        }
    }

    public static void main(String[] args){
        ArrayList<Alumno> listaAlumnos , listaOrdenada;
        MergeSort merge= new MergeSort();
        int tipo;
        Scanner scanner = new Scanner(System.in);
        listaAlumnos = merge.crearArrayAlumnos();
        long inicio;

        System.out.println("Lista desordenada\n");
        merge.imprimiArreglo(listaAlumnos);
        System.out.println("\n¿Cómo desea ordenar la lista?");
        tipo = scanner.nextInt();
        System.out.println("Lista ordenada\n");
        inicio = System.currentTimeMillis();
        listaOrdenada = merge.ordenaMergeMod(listaAlumnos, tipo);
        merge.imprimiArreglo(listaOrdenada);
        System.out.println("\nLa ordenación duró " + (System.currentTimeMillis() - inicio) + " ms" );
    }
}
