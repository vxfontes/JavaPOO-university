package aula3.banco;

/**
 *
 * @author vxfontes
 */
public class Main {
    public static void main(String[] args) {
        
       Banco bank = new Banco();
       
       // criando primeira poupança
       bank.addPoupanca(new Poupanca("123"));
       bank.depositar("123", 100);
       
       bank.acessar("123");
       bank.renderJuros(0.2);
       bank.acessar("123");
       
       // criando segunda poupança
       bank.addPoupanca(new Poupanca("65"));
       bank.depositar("65", 1000);
       
       bank.acessar("65");
       bank.renderJuros(100);
       bank.acessar("65");
        
    }
}
