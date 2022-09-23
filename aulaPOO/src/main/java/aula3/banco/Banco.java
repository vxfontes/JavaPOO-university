package aula3.banco;

/**
 *
 * @author vxfontes
 */
public class Banco {
    private Conta[] contas;
    private Poupanca[] poupanca;
    private int prox;

    public void depositar(String numero, double valor) {
        for(int i=0; i < prox; i++) {
            if(contas[i].getNumero().equals(numero)) {
                contas[i].depositar(valor);
            }
        }
    }
    
    public void renderJuros(double taxaDeJuros) {
        for(int i=0; i < prox; i++) {
            poupanca[i].renderJuros(taxaDeJuros);
        }
    }
    
}
