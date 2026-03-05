import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- BIENVENIDO AL BANCO EL AHORRADOR ---");
        System.out.print("¿Desea abrir la cuenta con un saldo inicial? (s/n): ");
        String opcion = scanner.nextLine();

        Cuenta miCuenta;

        if (opcion.equalsIgnoreCase("s")) {
            System.out.print("Ingrese el monto inicial: ");
            double inicial = scanner.nextDouble();
            miCuenta = new Cuenta(inicial);
        } else {
            miCuenta = new Cuenta();
        }

        // Simulación de transacciones
        System.out.println("\nSaldo inicial: $" + miCuenta.getSaldo());

        System.out.print("\nIngrese monto a depositar: ");
        double dep = scanner.nextDouble();
        miCuenta.depositar(dep);

        System.out.print("\nIngrese monto a retirar: ");
        double ret = scanner.nextDouble();
        miCuenta.retirar(ret);

        System.out.println("\n--- ESTADO FINAL ---");
        System.out.println("Saldo actual de la cuenta: $" + miCuenta.getSaldo());

        scanner.close();
    }
}