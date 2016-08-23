package Burbuja;

/**
 * Created by kevingamboa17 on 8/18/16.
 */
public class Métodos {
    private int Arreglo[];

    public Métodos() {
    }

    public int[] getArreglo() {
        return Arreglo;
    }

    public void setArreglo(int[] arreglo) {
        Arreglo = arreglo;
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
}
