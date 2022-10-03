package aula4.consultas;

/**
 *
 * @author vxfontes
 */
public class Cadastro {
    public String cpfPacientes[];
    public String nomePacientes[];
    public String telefonesPacientes[];
    
    public Consulta consultas[];
    
    public void cadastrarCliente(String cpf, String nome, String telefone, 
            String[] cpfPacientes, String[] nomePacientes, String[] telefonePacientes) {
        /* adiciona novo cliente na lista de clientes */
    }
    
    public int buscarCliente(String tipo, String dado, String[] array) {
        int indice=0;
        
        /* tipo cpf busca por cpf e tipo nome busca por nome
            retorna o indice da posição encontrada */
        
        return indice;
    }
    
    public void exibeCliente(int indice) {
        /* imprime cpf, nome e telefone do cliente na posição indicada */
    }
    
    public void agendaConsulta(String cpf, String nome, String telefone, String data,
            String hora, Consulta[] consultas) {
        /* adiciona uma consulta na lista de consultas agendadas */
    }
}
