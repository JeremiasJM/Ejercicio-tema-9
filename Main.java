// Definición de la clase Persona
class Persona {
    protected int edad;
    protected String nombre;
    protected String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
}

// Definición de la clase Cliente, que hereda de Persona
class Cliente extends Persona {
    private double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void mostrarDatos() {
        System.out.println("Datos del cliente:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Crédito: " + credito);
    }
}

// Definición de la clase Trabajador, que hereda de Persona
class Trabajador extends Persona {
    private double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Datos del trabajador:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Salario: " + salario);
    }
}

// Ejemplo de uso
public class Main {
    public static void main(String[] args) {
        // Crear objeto Cliente
        Cliente cliente = new Cliente(30, "Juan", "123456789", 1000.0);
        cliente.mostrarDatos();

        System.out.println();

        // Crear objeto Trabajador
        Trabajador trabajador = new Trabajador(25, "Pedro", "987654321", 2000.0);
        trabajador.mostrarDatos();
    }
}
