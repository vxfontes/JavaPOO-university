package aula4.consultas;

/**
 *
 * @author vxfontes
 */
public class Consulta extends Cliente {
    private String data;
    private String hora;

    public Consulta(String cpf, String nome, String telefone, String data, String hora) {
        super(nome, cpf, telefone);
        this.data = data;
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }
}
