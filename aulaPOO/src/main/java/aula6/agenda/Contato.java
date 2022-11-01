package aula6.agenda;

/**
 *
 * @author vanessa e filipe
 */
public class Contato {
    protected static int count = 0;
    private int id = 0;
    private String nome;
    private String telefone;
    private String detalhes;

    public Contato(String nome, String telefone, String detalhes) {
        count++;
        id = count;
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }
    
    public void atualizar(String nome, String telefone, String detalhes) {
        this.nome = nome;
        this.telefone = telefone;
        this.detalhes = detalhes;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Contato{" + "nome=" + nome + ", telefone=" + telefone + ", detalhes=" + detalhes + ", id=" + id + '}';
    }
    
}
