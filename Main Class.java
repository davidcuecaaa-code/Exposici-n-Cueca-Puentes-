package epec;

public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso de las clases
        Contador contador = new Contador("Carlos Gómez", 350000.00);

        System.out.println("Empleado: " + contador.getNombre());
        System.out.println("Salario: $" + contador.getSalario());
    }
}