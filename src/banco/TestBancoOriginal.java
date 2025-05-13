package banco;

/**
 * Clase de prueba para simular operaciones básicas entre dos clientes de un banco.
 * Se crean dos clientes con sus cuentas respectivas y se realizan transferencias,
 * ingresos y retiradas, mostrando el saldo tras cada operación.
 * 
 * @author victorperezmarq
 */
public class TestBancoOriginal {

    /**
     * Método principal que ejecuta la simulación de las operaciones bancarias.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en esta simulación).
     */
    public static void main(String[] args) {

        // Antonio y Beatriz se hacen clientes del banco
        Cliente antonio = new Cliente("123456789Z", "Antonio Alonso", "Av. Pueblo Saharaui, s/n");
        Cliente beatriz = new Cliente("987654321A", "Beatriz Benítez", "Calle Sol, 4");

        // Por defecto, todas las cuentas nuevas tienen 100€
        Cuenta cuentaAntonio = new Cuenta(48151, 100, antonio);
        Cuenta cuentaBeatriz = new Cuenta(62342, 100, beatriz);

        // Consultar saldo inicial
        consultacuenta(cuentaAntonio);
        consultacuenta(cuentaBeatriz);

        // Beatriz transfiere 50€ a Antonio
        cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 50);
        cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 50);

        // Consultar saldos tras la transferencia
        consultacuenta(cuentaAntonio);
        consultacuenta(cuentaBeatriz);

        // Antonio gana 100€ en una rifa
        cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() + 100);

        // Beatriz paga 30€ a Hacienda
        cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() - 30);

        // Consultar saldos tras las operaciones
        consultacuenta(cuentaAntonio);
        consultacuenta(cuentaBeatriz);

        // Antonio transfiere 50€ a Beatriz
        cuentaAntonio.setSaldo(cuentaAntonio.getSaldo() - 50);
        cuentaBeatriz.setSaldo(cuentaBeatriz.getSaldo() + 50);

        // Consultar saldos finales
        consultacuenta(cuentaAntonio);
        consultacuenta(cuentaBeatriz);
    }

    /**
     * Muestra el saldo actual de una cuenta.
     * 
     * @param cuenta La cuenta de la que se desea consultar el saldo
     */
    public static void consultacuenta(Cuenta cuenta) {
        System.out.println("La cuenta de " + cuenta.getCliente().getNombre() +
                " tiene " + cuenta.getSaldo() + " euros.");
    }
}
