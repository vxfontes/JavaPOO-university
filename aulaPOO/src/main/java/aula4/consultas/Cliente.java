package aula4.consultas;

/**
 *
 * @author vxfontes
 */
public abstract class Cliente {
    public String nome;
    public String cpf;
    public String telefone;

    public Cliente(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }    
}
