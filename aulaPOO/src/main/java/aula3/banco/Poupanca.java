package aula3.banco;

/**
 *
 * @author vxfontes
 */
public class Poupanca extends Conta {
    
    public void renderJuros(double taxaDeJuros) {
        double novoValor = getSaldo() + getSaldo()*taxaDeJuros;
        this.depositar(novoValor);
    }
}
