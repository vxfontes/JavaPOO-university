package aula3.banco;

/**
 *
 * @author vxfontes
 */
public class Banco {
    private Conta[] contas;
    private int prox = 4, cont = 0;
    private Poupanca[] poupanca = new Poupanca[prox];
    
    
//    public Banco(int tam) {
//        clientes = new Clientes[tam]
//    }
//    public void add(Conta c) {
//        clientes[prox++]=c;
//    }

    public void addPoupanca(Poupanca p) {
        if(cont <= prox){
            this.poupanca[cont++] = p;
        } else {
            System.out.println("Nao podemos mais criar poupancas");
        }
    }
    
    public void depositar(String numero, double valor) {
        for(int i=0; i < cont; i++) {
            if(poupanca[i].getNumero().equals(numero)) {
                poupanca[i].depositar(valor);
            }
        }
    }
    
    public void renderJuros(double taxaDeJuros) {
        for(int i=0; i < cont; i++) {
            poupanca[i].renderJurosPoupanca(taxaDeJuros);
        }
    }
    
    public void acessar(String numero) {
        for(int i=0; i < cont; i++) {
            if(poupanca[i].getNumero().equals(numero)) {
                System.out.println(poupanca[i].getSaldo());
            }
        }
    }
    
}