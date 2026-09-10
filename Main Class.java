package epec;

public class Main {
    public static void main(String[] args) {
        
        Contador contador = new Contador("Carlos Gómez", 350000.00);

        System.out.println("Empleado: " + contador.getNombre());
        System.out.println("Salario: $" + contador.getSalario());
    }
}
