package aula3.banco;

/**
 *
 * @author vxfontes
 */
public class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double valor) {
        saldo = this.getSaldo() + valor;
    }
}
