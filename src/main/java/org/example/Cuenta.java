public class Cuenta {
    // Atributo encapsulado
    private double saldo;

    // Constructor para apertura con $0
    public Cuenta() {
        this.saldo = 0;
    }

    // Constructor para apertura con saldo inicial
    public Cuenta(double saldoInicial) {
        if (saldoInicial > 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    // Método para depositar
    public void depositar(double monto) {
        if (monto > 0) {
            this.saldo += monto;
            System.out.println("Depósito exitoso de: $" + monto);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    // Método para retirar (con validación de fondos)
    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso de: $" + monto);
            return true;
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
            return false;
        }
    }

    // Getter para obtener el saldo actual
    public double getSaldo() {
        return this.saldo;
    }
}