package aula4.consultas;

/**
 *
 * @author vxfontes
 */
public class Cadastro extends Consulta {
    private String cpfPacientes[];
    private String nomePacientes[];
    private String telefonesPacientes[];
    
    public Consulta consultas[];
    
    public void cadastrarCliente(Cliente novoCliente, 
            String[] cpfPacientes, String[] nomePacientes, String[] telefonePacientes) {
        /* adiciona novo cliente na lista de clientes */
    }
    
    public int buscarClienteCPF(String cpf, String[] cpfPacientes) {
        int indice=0;
        
        /* tipo cpf busca por cpf e tipo nome busca por nome
            retorna o indice da posição encontrada */
        
        return indice;
    }
    
    public int buscarClienteNome(String nome, String[] nomePacientes) {
        int indice=0;
        
        /* tipo cpf busca por cpf e tipo nome busca por nome
            retorna o indice da posição encontrada */
        
        return indice;
    }
    
    public void exibeCliente(int indice) {
        /* imprime cpf, nome e telefone do cliente na posição indicada */
    }
    
    public void agendaConsulta(Consulta consulta, Consulta[] consultas) { 
        /* adiciona uma consulta na lista de consultas agendadas */
    }
}
