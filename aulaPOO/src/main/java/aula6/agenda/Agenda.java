package aula6.agenda;

import java.util.LinkedList;

/**
 *
 * @author vanessa e filipe
 */
public class Agenda {
    
    static LinkedList<Contato> agenda = new LinkedList<>();
    
    public static void adiciona(String nome, String telefone, String detalhes) {
        agenda.add(new Contato(nome, telefone, detalhes));
    }

    public static void visualizar() {
        agenda.stream().map(Contato::toString).forEach(System.out::println);
    }
}
