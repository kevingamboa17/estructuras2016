package Ordenamiento;

/**
 * Created by kevingamboa17 on 8/29/16.
 */
public class Alumno {
    private String nombre;
    private String apellido;
    private String matricula;
    private int edad;
    private double promedio;

    public Alumno(String nombre, String apellido, String matricula, int edad, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.edad = edad;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
