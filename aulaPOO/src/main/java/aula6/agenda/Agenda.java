package aula6.agenda;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author vanessa e filipe
 */
public abstract class Agenda {
    
    static LinkedList<Contato> agenda = new LinkedList<>();
    
    
    public static void adiciona(String nome, String telefone, String detalhes) {
        agenda.add(new Contato(nome, telefone, detalhes));
        
    }

    public static void visualizar() {
        agenda.stream().map(Contato::toString).forEach(System.out::println);
    }
    
    public static ArrayList<String> vet() {
        int i = 0;
        ArrayList<String> nomeDosContatos = new ArrayList<>();
        for (Contato contato : agenda) {
            i++;
            nomeDosContatos.add(contato.getNome());
            
        }
        return nomeDosContatos;
        
    }
    
    public static ArrayList<String> remover(ArrayList<String> a, int b) {
            ArrayList<String> aux = new ArrayList<>();
            agenda.remove(b);
            aux = Agenda.vet();
            return aux;
    }


    public static void editar(String nome, String telefone, String descricao, int a){
        Contato d = agenda.get(a);
        if (nome.equals("")) {
            nome = d.getNome();
        }
        if (telefone.equals("")) {
            telefone = d.getTelefone();
        }
        if (descricao.equals("")) {
            descricao = d.getDetalhes();
        }
        Contato c = new Contato(nome, telefone, descricao);
        agenda.set(a, c);
      
    }
    public static String mostraNome(int a){
        Contato b = agenda.get(a);
        String c = b.getNome();
        return c;
    }
    public static String mostraTelefone(int a){
        Contato b = agenda.get(a);
        String c = b.getTelefone();
        return c;
    }
    public static String mostraDetalhes(int a){
        Contato b = agenda.get(a);
        String c = b.getDetalhes();
        return c;
    }
}
