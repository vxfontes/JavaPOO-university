package aula6.agenda;

/**
 *
 * @author vxfontes
 */
public class Contato {
    private String nome;
    private String telefone;
    private String detalhes;

    public Contato(String nome, String telefone, String detalhes) {
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }
    
    public void atualizar(String nome, String telefone, String detalhes) {
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", detalhes=" + detalhes + '}';
    }
}
