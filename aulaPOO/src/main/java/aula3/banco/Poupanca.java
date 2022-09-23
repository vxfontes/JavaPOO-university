package aula3.banco;

/**
 *
 * @author vxfontes
 */
public class Poupanca extends Conta {

    public Poupanca(String numero) {
        super(numero);
    }
    
    public void renderJurosPoupanca(double taxaDeJuros) {
        double novoValor = getSaldo()*taxaDeJuros;
        depositar(novoValor);
    }
}
