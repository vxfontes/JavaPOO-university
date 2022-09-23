package aula3.banco;

/**
 *
 * @author vxfontes
 */
public abstract class Conta {
    private String numero;
    private double saldo;

    public Conta(String numero) {
        this.numero = numero;
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
