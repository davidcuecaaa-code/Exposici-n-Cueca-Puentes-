package epec;

public class Empleado {
    // Atributos comunes (ej. nombre, id, salario)
    protected String nombre;
    protected double salario;

    public Empleado() { 
        // Constructor base
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
}
