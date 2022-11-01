package aula6.agenda;

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
    
    public static void buscar(int id) {
        for (Contato contato : agenda) {
            if(contato.getId() == id)
                System.out.println(contato.toString());
            else
                System.out.println("nao é esse contato");
        }
    }
    
    public static void remover(int id) {
        for (Contato contato : agenda) {
            if(contato.getId() == id)
                agenda.remove(contato);
            else
                System.out.println("nao é esse contato");
        }
    }
}
