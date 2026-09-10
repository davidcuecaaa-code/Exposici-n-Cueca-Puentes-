package epec;

public class Empleado {
    // Atributos protegidos para permitir el acceso en subclases
    protected String nombre;
    protected double salario;

    // Constructor por defecto
    public Empleado() { 
    }

    // Constructor parametrizado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}